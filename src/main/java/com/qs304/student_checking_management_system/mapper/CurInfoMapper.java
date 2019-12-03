package com.qs304.student_checking_management_system.mapper;

import com.qs304.student_checking_management_system.entity.CurInfo;
import com.qs304.student_checking_management_system.entity.CurInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurInfoMapper {
    long countByExample(CurInfoExample example);

    int deleteByExample(CurInfoExample example);

    int deleteByPrimaryKey(Integer curId);

    int insert(CurInfo record);

    int insertSelective(CurInfo record);

    List<CurInfo> selectByExample(CurInfoExample example);

    CurInfo selectByPrimaryKey(Integer curId);

    int updateByExampleSelective(@Param("record") CurInfo record, @Param("example") CurInfoExample example);

    int updateByExample(@Param("record") CurInfo record, @Param("example") CurInfoExample example);

    int updateByPrimaryKeySelective(CurInfo record);

    int updateByPrimaryKey(CurInfo record);
}