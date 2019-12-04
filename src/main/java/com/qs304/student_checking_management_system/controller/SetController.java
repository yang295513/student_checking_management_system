package com.qs304.student_checking_management_system.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/set")
public class SetController {

    @GetMapping("/setClassId")
    public JSONObject addClassId(Integer classId, HttpServletRequest request){
        JSONObject jsonObject=new JSONObject();
        HttpSession session=request.getSession();
        session.setAttribute("classId",classId);
        jsonObject.put("code",200);
        jsonObject.put("msg","设置成功");
        return jsonObject;
    }

}
