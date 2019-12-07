package com.qs304.student_checking_management_system.service;

import com.qs304.student_checking_management_system.entity.*;
import com.qs304.student_checking_management_system.entity.CurScoreInfoExample.Criteria;
import com.qs304.student_checking_management_system.mapper.ClassInfoMapper;
import com.qs304.student_checking_management_system.mapper.CurInfoMapper;
import com.qs304.student_checking_management_system.mapper.CurScoreInfoMapper;
import com.qs304.student_checking_management_system.mapper.StuInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    CurInfoMapper curInfoMapper;
    @Autowired
    StuInfoMapper stuInfoMapper;
    @Autowired
    ClassInfoMapper classInfoMapper;
    @Autowired
    CurScoreInfoMapper curScoreInfoMapper;
    /**
     * 根据课程号查询该课程的所有信息
     * @param curId 课程号
     * @return
     */
    public CurInfo getCurInfoByCurId(Integer curId){
        return curInfoMapper.selectByPrimaryKey(curId);
    }

    /**
     * 获取所有学生的基本信息,携带班级信息
     * @return
     */
    public List<StuInfo> getStuInfoAllWithClassInfo(){
        List<StuInfo> list=stuInfoMapper.getStuInfoAllWithClassInfo();
        list.addAll(stuInfoMapper.getStuInfoAllByClassIdIsNull());

        return list;
    }

    /**
     * 新增学生信息
     * @param stuInfo 新增的学生信息
     * @return
     */
    public Integer addStuInfo(StuInfo stuInfo){
        return stuInfoMapper.insert(stuInfo);
    }

    /**
     * 根据学号修改个人信息
     * @param stuId 学号
     * @param stuInfo 修改后的个人信息
     * @return
     */
    public Integer updateStuInfoById(Integer stuId,StuInfo stuInfo){
        stuInfo.setStuId(stuId);
        return stuInfoMapper.updateByPrimaryKey(stuInfo);
    }

    /**
     * 获取所有班级的基本信息
     * @return
     */
    public List<ClassInfo> getClassInfoAll(){
        return classInfoMapper.getClassInfoAll();
    }

    /**
     * 新增班级信息
     * @param classInfo 待新增的班级信息
     * @return
     */
    public Integer addClassInfo(ClassInfo classInfo){
        return classInfoMapper.insert(classInfo);
    }

    /**
     * 按照班级号修改班级信息
     * @param classId 班级号
     * @param classInfo 修改后的班级信息
     * @return
     */
    public Integer updateClassInfo(Integer classId,ClassInfo classInfo){
        classInfo.setClassId(classId);
        return classInfoMapper.updateByPrimaryKey(classInfo);
    }

    /**
     * 给指定学号学生选所有的课
     * @param stuId
     * @return
     */
    public Integer courseSelection(Integer stuId){
        List<CurInfo> curList=getCurInfoAll();
        Integer rel=new Integer(0);
        for (CurInfo curInfo : curList) {
            CurScoreInfo curScoreInfo=new CurScoreInfo();
            curScoreInfo.setCurId(curInfo.getCurId());
            curScoreInfo.setStuId(stuId);
            rel+=curScoreInfoMapper.insert(curScoreInfo);
        }
        return rel;
    }

    /**
     * 获取所有的课程信息
     * @return
     */
    public List<CurInfo> getCurInfoAll(){
        return curInfoMapper.getCurInfoAll();
    }

    /**
     * 给学生评分，哪个字段不为空给那个字段评分
     * @param curScoreInfo
     * @return
     */
    public Integer score(Integer stuId,CurScoreInfo curScoreInfo){
        curScoreInfo.setStuId(stuId);
        CurScoreInfoExample example=new CurScoreInfoExample();
        Criteria criteria=example.createCriteria();
        criteria.andCurIdEqualTo(curScoreInfo.getCurId()).andStuIdEqualTo(stuId);
        return curScoreInfoMapper.updateByExampleSelective(curScoreInfo,example);
    }

    /**
     * 获取某个班的所有学生
     * @Param classId班级id
     * @return
     */
    public ClassInfo getClassInfoWithStuInfo(Integer classId){
        return classInfoMapper.getClassInfoWithStuInfo(classId);
    }

    /**
     * 根据id删除该学生
     * @param stuId
     * @return
     */
    public Integer deleteStuInfoById(Integer stuId){
        return stuInfoMapper.deleteByPrimaryKey(stuId);
    }

    /**
     * 根据id删除该班级
     * @param classId 班级号
     * @return
     */
    public Integer deleteClassInfoById(Integer classId){
        return classInfoMapper.deleteByPrimaryKey(classId);
    }

    /**
     * 查询指定课程的所有人分数信息
     * @return
     */
    public List<CurScoreInfo> getCurScoreInfoListWithStuInfo(Integer curId){
        return curScoreInfoMapper.getCurScoreInfoListWithStuInfo(curId);
    }

}
