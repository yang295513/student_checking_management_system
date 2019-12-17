package com.qs304.student_checking_management_system.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class SignIn {

    private String account="admin";
    private String password="admin";

    @PostMapping(value = "/login",produces = "application/json;charset=utf-8")
    public JSONObject Login(String account, String password, HttpServletRequest request){
        JSONObject jsonObject=new JSONObject();
        try {
            HttpSession session=request.getSession();
            if(account!=null&&password!=null&&account.equals(this.account)&&password.equals(this.password)){
                session.setAttribute("login","true");
                jsonObject.put("code",302);
                jsonObject.put("msg","登陆成功");
                jsonObject.put("url","index/classList");
            }else {
                jsonObject.put("code",400);
                jsonObject.put("msg","账号或者密码错误");
            }
        }catch (Exception e){
            jsonObject.put("code",500);
            jsonObject.put("msg",e.getMessage());
        }
        return jsonObject;
    }


}
