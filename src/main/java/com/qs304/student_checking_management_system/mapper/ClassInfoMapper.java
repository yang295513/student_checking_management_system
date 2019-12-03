package com.qs304.student_checking_management_system.mapper;

import com.qs304.student_checking_management_system.entity.ClassInfo;
import com.qs304.student_checking_management_system.entity.ClassInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassInfoMapper {
    long countByExample(ClassInfoExample example);

    int deleteByExample(ClassInfoExample example);

    int deleteByPrimaryKey(Integer classId);

    int insert(ClassInfo record);

    int insertSelective(ClassInfo record);

    List<ClassInfo> selectByExample(ClassInfoExample example);

    ClassInfo selectByPrimaryKey(Integer classId);

    int updateByExampleSelective(@Param("record") ClassInfo record, @Param("example") ClassInfoExample example);

    int updateByExample(@Param("record") ClassInfo record, @Param("example") ClassInfoExample example);

    int updateByPrimaryKeySelective(ClassInfo record);

    int updateByPrimaryKey(ClassInfo record);
}