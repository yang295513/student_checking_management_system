package com.qs304.student_checking_management_system.controller;

import com.alibaba.fastjson.JSONObject;
import com.qs304.student_checking_management_system.entity.ClassInfo;
import com.qs304.student_checking_management_system.entity.CurScoreInfo;
import com.qs304.student_checking_management_system.entity.StuInfo;
import com.qs304.student_checking_management_system.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/set")
public class SetController {

    @Autowired
    Service service;

    /**
     * 设置班级号
     * @param classId
     * @param request
     * @return
     */
    @GetMapping("/setClassId")
    public JSONObject addClassId(Integer classId, HttpServletRequest request){
        JSONObject jsonObject=new JSONObject();
        HttpSession session=request.getSession();
        session.setAttribute("classId",classId);
        jsonObject.put("code",200);
        jsonObject.put("msg","设置成功");
        return jsonObject;
    }

    /**
     * 设置课程号
     * @param curId
     * @param request
     * @return
     */
    @GetMapping("/setCurId")
    public JSONObject addCurId(Integer curId, HttpServletRequest request){
        JSONObject jsonObject=new JSONObject();
        HttpSession session=request.getSession();
        session.setAttribute("curId",curId);
        jsonObject.put("code",200);
        jsonObject.put("msg","设置成功");
        return jsonObject;
    }

    /**
     * 新增班级信息
     * @param className
     * @return
     */
    @PostMapping(value = "/addClassInfo",produces = "application/json;charset=utf-8")
    public JSONObject addClassInfo(String className){
        JSONObject jsonObject=new JSONObject();
        try {
            ClassInfo classInfo=new ClassInfo();
            classInfo.setClassName(className);
            jsonObject.put("code",200);
            jsonObject.put("msg","添加成功");
            jsonObject.put("data",service.addClassInfo(classInfo));
        }catch (Exception e){
            jsonObject.put("code",400);
            jsonObject.put("msg","添加失败");
        }
        return jsonObject;
    }

    /**
     *添加学生，添加学生的同时给改学生选课
     * @param stuId
     * @param stuName
     * @param stuSex
     * @param stuSchool
     * @param stuClassId
     * @param stuPhonenumber
     * @return
     */
    @PostMapping(value = "/addStuInfo",produces = "application/json;charset=utf-8")
    public JSONObject addStuInfo(String stuId,String stuName,String stuSex,String stuSchool,String stuClassId,String stuPhonenumber){
        JSONObject jsonObject=new JSONObject();
        StuInfo stuInfo=new StuInfo();

        try {
            stuInfo.setStuId(Integer.parseInt(stuId));
            stuInfo.setStuName(stuName);
            stuInfo.setStuSex(stuSex);
            stuInfo.setStuSchool(stuSchool);
            stuInfo.setStuClassid(Integer.parseInt(stuClassId));
            stuInfo.setStuPhonenumber(stuPhonenumber);

            Integer rel=service.addStuInfo(stuInfo);//插入学生
            service.courseSelection(stuInfo.getStuId());//给该学生选课
            if(rel!=0){
                jsonObject.put("code",200);
                jsonObject.put("msg","成功");
            }else{
                jsonObject.put("code",400);
                jsonObject.put("msg","添加失败");
            }
        }catch (Exception e){
            jsonObject.put("code",500);
            jsonObject.put("msg",e.getMessage());
        }

        return jsonObject;
    }

    /**
     * 根据主键删除对应学生
     * @param stuId 学生学号
     * @return 返回json
     */
    @GetMapping(value = "/deleteStuInfoById",produces = "application/json;charset=utf-8")
    public JSONObject deleteStuInfo(String stuId){
        JSONObject jsonObject=new JSONObject();

        try {
            Integer rel=service.deleteStuInfoById(Integer.parseInt(stuId));
            if(rel!=0){
                jsonObject.put("code",200);
                jsonObject.put("msg","删除成功");
            }else{
                jsonObject.put("code",400);
                jsonObject.put("msg","删除失败");
            }
        }catch (Exception e){
            jsonObject.put("code",500);
            jsonObject.put("msg",e.getMessage());
        }

        return jsonObject;
    }


    /**
     * 根据主键删除班级信息
     * @param classId 班级主键
     * @return
     */
    @GetMapping(value = "/deleteClassInfoById",produces = "application/json;charset=utf-8")
    public JSONObject deleteClassInfo(String classId){
        JSONObject jsonObject=new JSONObject();

        try {
            Integer rel=service.deleteClassInfoById(Integer.parseInt(classId));
            if(rel!=0){
                jsonObject.put ("code",200);
                jsonObject.put("msg","删除成功");
            }else{
                jsonObject.put("code",400);
                jsonObject.put("msg","删除失败");
            }
        }catch (Exception e){
            jsonObject.put("code",400);
            jsonObject.put("msg",e.getMessage());
        }
        return jsonObject;
    }

    /**
     * 修改个人信息
     * @param stuName
     * @param stuSex
     * @param stuSchool
     * @param stuClassId
     * @param stuPhonenumber
     */
    @PostMapping(value = "/setSutInfoByStuId",produces = "application/json;charset=utf-8")
    public JSONObject setStuInfoByStuId(String stuId,String stuName,String stuSex,String stuSchool,String stuClassId,String stuPhonenumber){
        JSONObject jsonObject=new JSONObject();
        StuInfo stuInfo=new StuInfo();

        try {
            stuInfo.setStuName(stuName);
            stuInfo.setStuSex(stuSex);
            stuInfo.setStuSchool(stuSchool);
            stuInfo.setStuClassid(Integer.parseInt(stuClassId));
            stuInfo.setStuPhonenumber(stuPhonenumber);

            Integer rel=service.updateStuInfoById(Integer.parseInt(stuId),stuInfo);
            if (rel!=0){
                jsonObject.put("code",200);
                jsonObject.put("msg","修改成功");
            }else{
                jsonObject.put("code",400);
                jsonObject.put("msg","修改失败");
            }
        }catch (Exception e){
            jsonObject.put("code",500);
            jsonObject.put("msg","修改失败");
        }

        return jsonObject;
    }

    /**
     * 根据学号和课程号修改学生成绩,-1就是没有成绩
     * @param stuId
     * @param usuScore
     * @param finalScore
     * @return
     */
    @PostMapping(value = "/setScore",produces = "application/json;charset=utf-8")
    public JSONObject setCurScore(String stuId,String usuScore,String finalScore,HttpServletRequest request){
        JSONObject jsonObject=new JSONObject();

        try{
            HttpSession session=request.getSession();
            Integer curId=Integer.parseInt(session.getAttribute("curId").toString());
            Integer stuId1=Integer.parseInt(stuId);

            Double usu=Double.parseDouble(usuScore);
            Double fin=Double.parseDouble(finalScore);
            Double sum=usu*0.4+fin*0.6;

            CurScoreInfo curScoreInfo=new CurScoreInfo();
            curScoreInfo.setCurId(curId);
            curScoreInfo.setCurUsuscore(usu);
            curScoreInfo.setCurFinalscore(fin);
            curScoreInfo.setCurSumFinalscore(sum);

            service.score(stuId1,curScoreInfo);

            jsonObject.put("code",200);
            jsonObject.put("msg","修改成功");

        }catch (Exception e){
            jsonObject.put("code",500);
            jsonObject.put("msg",e.getMessage());
        }
        return jsonObject;
    }
}
