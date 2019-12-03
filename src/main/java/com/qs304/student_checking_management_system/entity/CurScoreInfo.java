package com.qs304.student_checking_management_system.entity;

public class CurScoreInfo {
    private Integer stuId;

    private Integer curId;

    private Double curUsuscore;

    private Double curFinalscore;

    private Double curSumFinalscore;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getCurId() {
        return curId;
    }

    public void setCurId(Integer curId) {
        this.curId = curId;
    }

    public Double getCurUsuscore() {
        return curUsuscore;
    }

    public void setCurUsuscore(Double curUsuscore) {
        this.curUsuscore = curUsuscore;
    }

    public Double getCurFinalscore() {
        return curFinalscore;
    }

    public void setCurFinalscore(Double curFinalscore) {
        this.curFinalscore = curFinalscore;
    }

    public Double getCurSumFinalscore() {
        return curSumFinalscore;
    }

    public void setCurSumFinalscore(Double curSumFinalscore) {
        this.curSumFinalscore = curSumFinalscore;
    }
}