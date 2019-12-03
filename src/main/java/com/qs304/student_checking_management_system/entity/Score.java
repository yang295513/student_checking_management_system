package com.qs304.student_checking_management_system.entity;

public class Score {
    private Integer stuId;

    private Integer curId;

    private Double usuScore;

    private Double testScore;

    private Double finalScore;

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

    public Double getUsuScore() {
        return usuScore;
    }

    public void setUsuScore(Double usuScore) {
        this.usuScore = usuScore;
    }

    public Double getTestScore() {
        return testScore;
    }

    public void setTestScore(Double testScore) {
        this.testScore = testScore;
    }

    public Double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(Double finalScore) {
        this.finalScore = finalScore;
    }
}