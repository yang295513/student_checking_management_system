package com.qs304.student_checking_management_system.entity;

import java.util.List;

public class ClassInfo {
    private Integer classId;

    private String className;

    private List<StuInfo> stuInfoList;

    public List<StuInfo> getStuInfoList() {
        return stuInfoList;
    }

    public void setStuInfoList(List<StuInfo> stuInfoList) {
        this.stuInfoList = stuInfoList;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    @Override
    public String toString() {
        return "ClassInfo{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                '}';
    }
}