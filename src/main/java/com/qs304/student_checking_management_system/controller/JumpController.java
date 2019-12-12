package com.qs304.student_checking_management_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
