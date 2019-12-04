package com.qs304.student_checking_management_system.controller;

import com.alibaba.fastjson.JSONObject;
import com.qs304.student_checking_management_system.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/index")
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
     * @param classId 班级号
     * @return
     */
    @PostMapping(value = "/getStuInfoInClassbyclassId",produces = "application/json;charset=utf-8")
    public JSONObject getStuInfoInClass(String classId){
        JSONObject jsonObject=new JSONObject();

        try {
            jsonObject.put("code",200);
            jsonObject.put("msg","获取成功");
            jsonObject.put("data",service.getClassInfoWithStuInfo(new Integer(classId)));
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

}
