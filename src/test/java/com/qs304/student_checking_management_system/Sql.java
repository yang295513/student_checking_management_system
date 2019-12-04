package com.qs304.student_checking_management_system;

import com.qs304.student_checking_management_system.entity.ClassInfo;
import com.qs304.student_checking_management_system.entity.CurScoreInfo;
import com.qs304.student_checking_management_system.entity.StuInfo;
import com.qs304.student_checking_management_system.service.Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Sql {

    @Autowired
    Service service;


    @Test
    public void getCurInfoById(){
        System.out.println(service.getCurInfoByCurId(3));
    }

    @Test
    public void getStuAll(){
        List<StuInfo> list=service.getStuInfoAllWithClassInfo();

        for (StuInfo stuInfo : list) {
            System.out.println(stuInfo);
        }
    }
    @Test
    public void getClassInfoAll(){
        List<ClassInfo> list=service.getClassInfoAll();
        for (ClassInfo classInfo : list) {
            System.out.println(classInfo);
        }
    }
    @Test
    public void addStuInfo(){
        StuInfo stuInfo=new StuInfo();
        stuInfo.setStuName("测试");
        stuInfo.setStuClassid(1);
        stuInfo.setStuPhonenumber("15993343299");
        stuInfo.setStuSchool("安阳师范学院");
        stuInfo.setStuSex("M");
        Integer rel=service.addStuInfo(stuInfo);
        System.out.println("成功插入"+rel+"条数据");
    }
    @Test
    public void setStuInfo(){
        StuInfo stuInfo=new StuInfo();
        stuInfo.setStuName("测试2");
        stuInfo.setStuClassid(1);
        stuInfo.setStuPhonenumber("15993343299");
        stuInfo.setStuSchool("安阳师范学院");
        stuInfo.setStuSex("F");
        Integer rel=service.updateStuInfoById(3,stuInfo);
        System.out.println("成功修改"+rel+"条数据");
    }

    /**
     * 选课
     */
    @Test
    public void cur(){
        System.out.println(service.courseSelection(2));
    }

    /**
     * 评分
     */
    @Test
    public void score(){
        CurScoreInfo curScoreInfo=new CurScoreInfo();
        curScoreInfo.setCurId(2);
        curScoreInfo.setCurUsuscore(100.0);
        System.out.println(service.score(2,curScoreInfo));
    }
    @Test
    public void selectStuInfoInClassInfoByclassId(){
        ClassInfo classInfo=service.getClassInfoWithStuInfo(1);
        System.out.println(service.getClassInfoWithStuInfo(1));
        List<StuInfo> list=classInfo.getStuInfoList();
        for (StuInfo stuInfo : list) {
            System.out.println(stuInfo);
        }
    }
}
