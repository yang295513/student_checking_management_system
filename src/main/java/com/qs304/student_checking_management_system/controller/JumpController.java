package com.qs304.student_checking_management_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

@Controller
public class JumpController {

    @RequestMapping("index/classList")
    public String jumpGetClassList(){
        return "class_list";
    }
    @RequestMapping("index/stuList")
    public String jumpGetStuList(){
        return "stu_list";
    }
    @RequestMapping("index/curList")
    public String jumpGetCurList(){
        return "cur_list";
    }
    @RequestMapping("index/classInfo")
    public String jumpGetClassInfo(){
        return "class_info";
    }
    @RequestMapping("index/curInfo")
    public String jumpGetCurInfo(){
        return "cur_info";
    }
    @RequestMapping("index/repeat")
    public String jumpGetRepeat(){
        return "repeat";
    }
    @RequestMapping("index/curListScore")
    public String jumpGetCurLists(){
        return "cur_list";
    }
    @RequestMapping("index/classInfoScore")
    public String jumpGetClassInfos(){
        return "class_info";
    }

    @RequestMapping("signUp")
    public String jumpLogin(HttpServletRequest request){
        HttpSession session=request.getSession();
        Enumeration<String> enumeration= session.getAttributeNames();

        while(enumeration.hasMoreElements()){
            session.removeAttribute(enumeration.nextElement());
        }
        return "login";
    }

    @RequestMapping("login")
    public String jumpGetlogin(){
        return "login";
    }
}
