package com.qs304.student_checking_management_system.service;

import com.qs304.student_checking_management_system.entity.CurInfo;
import com.qs304.student_checking_management_system.mapper.CurInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    CurInfoMapper curInfoMapper;

    /**
     * 根据课程号查询该课程的所有信息
     * @param curId 课程号
     * @return
     */
    public CurInfo getCurInfoByCurId(Integer curId){
        return curInfoMapper.selectByPrimaryKey(curId);
    }

}
