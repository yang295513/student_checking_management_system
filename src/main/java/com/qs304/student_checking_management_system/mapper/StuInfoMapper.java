package com.qs304.student_checking_management_system.mapper;

import com.qs304.student_checking_management_system.entity.StuInfo;
import com.qs304.student_checking_management_system.entity.StuInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuInfoMapper {
    long countByExample(StuInfoExample example);

    int deleteByExample(StuInfoExample example);

    int deleteByPrimaryKey(Integer stuId);

    int insert(StuInfo record);

    int insertSelective(StuInfo record);

    List<StuInfo> selectByExample(StuInfoExample example);

    StuInfo selectByPrimaryKey(Integer stuId);

    int updateByExampleSelective(@Param("record") StuInfo record, @Param("example") StuInfoExample example);

    int updateByExample(@Param("record") StuInfo record, @Param("example") StuInfoExample example);

    int updateByPrimaryKeySelective(StuInfo record);

    int updateByPrimaryKey(StuInfo record);

    List<StuInfo> getStuInfoAllWithClassInfo();


}