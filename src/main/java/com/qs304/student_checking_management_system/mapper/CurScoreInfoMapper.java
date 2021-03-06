package com.qs304.student_checking_management_system.mapper;

import com.qs304.student_checking_management_system.entity.CurScoreInfo;
import com.qs304.student_checking_management_system.entity.CurScoreInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CurScoreInfoMapper {
    long countByExample(CurScoreInfoExample example);

    int deleteByExample(CurScoreInfoExample example);

    int insert(CurScoreInfo record);

    int insertSelective(CurScoreInfo record);

    List<CurScoreInfo> selectByExample(CurScoreInfoExample example);

    int updateByExampleSelective(@Param("record") CurScoreInfo record, @Param("example") CurScoreInfoExample example);

    int updateByExample(@Param("record") CurScoreInfo record, @Param("example") CurScoreInfoExample example);

    List<CurScoreInfo> getCurScoreInfoListWithStuInfo(Integer curId);
    List<CurScoreInfo> getClassScoreInfoListWithStuInfo(Integer classId);
}