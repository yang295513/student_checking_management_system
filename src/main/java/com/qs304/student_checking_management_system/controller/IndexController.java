package com.qs304.student_checking_management_system.controller;

import com.alibaba.fastjson.JSONObject;
import com.qs304.student_checking_management_system.service.Service;
import com.qs304.student_checking_management_system.utils.Duplicatechecking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.BufferedInputStream;
import java.io.InputStream;

@RequestMapping("/index")
@RestController
public class IndexController {
    @Autowired
    Service service;

    /**
     * 获取所有班级信息
     * @return
     */
    @GetMapping(value = "/getClassInfoAll",produces = "application/json;charset=utf-8")
    public JSONObject getClassInfoAll(){
        JSONObject jsonObject=new JSONObject();

        jsonObject.put("code",200);
        jsonObject.put("msg","获取成功");
        jsonObject.put("data",service.getClassInfoAll());

        return jsonObject;
    }

    /**
     * 获取给定班级号的班级里面的所有学生
     * @return
     */
    @PostMapping(value = "/getStuInfoInClassbyclassId",produces = "application/json;charset=utf-8")
    public JSONObject getStuInfoInClass(HttpServletRequest request){
        JSONObject jsonObject=new JSONObject();

        try {
            HttpSession session=request.getSession();
            Integer classId=(Integer) session.getAttribute("classId");
            if(classId!=null){
                jsonObject.put("code",200);
                jsonObject.put("msg","获取成功");
                jsonObject.put("data",service.getClassInfoWithStuInfo(new Integer(classId)));
            }else {
                jsonObject.put("code",400);
                jsonObject.put("msg","请先获取班级号");
            }
        }catch (Exception e){
            jsonObject.put("code",500);
            jsonObject.put("msg",e.getMessage());
        }

        return jsonObject;
    }

    /**
     * 获取所有学生信息以及他所在的班级
     * @return
     */
    @GetMapping(value = "/getStuInfoAll",produces = "application/json;charset=utf-8")
    public JSONObject getStuInfoAll(){
        JSONObject jsonObject=new JSONObject();

        try {
            jsonObject.put("code",200);
            jsonObject.put("msg","获取成功");
            jsonObject.put("data",service.getStuInfoAllWithClassInfo());
        }catch (Exception e){
            jsonObject.put("code",500);
            jsonObject.put("msg",e.getMessage());
        }

        return jsonObject;
    }

    /**
     * 获取所有的课程信息
     * @return
     */
    @GetMapping(value = "/getCurInfoAll",produces = "application/json;charset=utf-8")
    public JSONObject getCurInfoAll(){
        JSONObject jsonObject=new JSONObject();

        try {
            jsonObject.put("code",200);
            jsonObject.put("msg","获取成功");
            jsonObject.put("data",service.getCurInfoAll());
        }catch (Exception e){
            jsonObject.put("code",500);
            jsonObject.put("msg",e.getMessage());
        }

        return jsonObject;
    }

    /**
     * 获取指定班级号的所有学生成绩
     * @param request
     * @return
     */
    @GetMapping(value = "/getCurScoreInfoWIthStuInfo",produces = "application/json;charset=utf-8")
    public JSONObject getCurScoreInfoWithStuInfo(HttpServletRequest request){
        JSONObject jsonObject=new JSONObject();
        HttpSession session=request.getSession();
        Integer curId;

        try {
            curId=new Integer(session.getAttribute("curId").toString());
            jsonObject.put("code",200);
            jsonObject.put("msg","获取成功");
            jsonObject.put("data",service.getCurScoreInfoListWithStuInfo(curId));

        }catch (Exception e){
            jsonObject.put("code",500);
            jsonObject.put("msg",e.getMessage());
        }

        return jsonObject;
    }

    @PostMapping("/uploadFile")
    public JSONObject upload(@RequestParam("file") MultipartFile file){
        JSONObject jsonObject=new JSONObject();

//        gatName()file
//        getSize()1141
//        getContentType()text/plain
//        getOriginalFilename()2019年算法艺术社获奖名单.txt
        try {
            if(file.getOriginalFilename().endsWith(".txt")==true){//普通文本

                byte[] bytes=new byte[2048];

                InputStream inputStream=file.getInputStream();
                BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream);

                String source=new String();

                int in;

                while((in=bufferedInputStream.read(bytes))!=-1){
                    String str=new String(bytes,0,in,"gbk");
                    source+=str;
                }
                bufferedInputStream.close();

                Duplicatechecking duplicatechecking=new Duplicatechecking();
                double repole=duplicatechecking.localCompare(source,10);
                jsonObject.put("code",200);
                jsonObject.put("msg","重复率为:"+repole*100+"%");

            }else if (file.getOriginalFilename().endsWith(".docx")){//excel

            }else{
                jsonObject.put("code",400);
                jsonObject.put("msg","文件格式不合法");
            }
        }catch (Exception e){
            jsonObject.put("code",500);
            jsonObject.put("msg",e.getMessage());
        }

        return jsonObject;
    }

}
