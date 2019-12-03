package com.qs304.student_checking_management_system.mapper;

import com.qs304.student_checking_management_system.entity.ClassScoreInfo;
import com.qs304.student_checking_management_system.entity.ClassScoreInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassScoreInfoMapper {
    long countByExample(ClassScoreInfoExample example);

    int deleteByExample(ClassScoreInfoExample example);

    int insert(ClassScoreInfo record);

    int insertSelective(ClassScoreInfo record);

    List<ClassScoreInfo> selectByExample(ClassScoreInfoExample example);

    int updateByExampleSelective(@Param("record") ClassScoreInfo record, @Param("example") ClassScoreInfoExample example);

    int updateByExample(@Param("record") ClassScoreInfo record, @Param("example") ClassScoreInfoExample example);
}