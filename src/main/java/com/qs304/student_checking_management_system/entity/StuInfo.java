package com.qs304.student_checking_management_system.entity;

public class StuInfo {
    private Integer stuId;

    private String stuName;

    private String stuSex;

    private String stuSchool;

    private Integer stuClassid;

    private String stuPhonenumber;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex == null ? null : stuSex.trim();
    }

    public String getStuSchool() {
        return stuSchool;
    }

    public void setStuSchool(String stuSchool) {
        this.stuSchool = stuSchool == null ? null : stuSchool.trim();
    }

    public Integer getStuClassid() {
        return stuClassid;
    }

    public void setStuClassid(Integer stuClassid) {
        this.stuClassid = stuClassid;
    }

    public String getStuPhonenumber() {
        return stuPhonenumber;
    }

    public void setStuPhonenumber(String stuPhonenumber) {
        this.stuPhonenumber = stuPhonenumber == null ? null : stuPhonenumber.trim();
    }
}