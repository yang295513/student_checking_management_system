package com.qs304.student_checking_management_system.entity;

public class ClassScoreInfo {
    private Integer classId;

    private Double classSumUsuscore;

    private Double classAvgUsuscore;

    private Double classSumTestscore;

    private Double classAvgTestscore;

    private Double classSumFinalscore;

    private Double classAvgFinalscore;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Double getClassSumUsuscore() {
        return classSumUsuscore;
    }

    public void setClassSumUsuscore(Double classSumUsuscore) {
        this.classSumUsuscore = classSumUsuscore;
    }

    public Double getClassAvgUsuscore() {
        return classAvgUsuscore;
    }

    public void setClassAvgUsuscore(Double classAvgUsuscore) {
        this.classAvgUsuscore = classAvgUsuscore;
    }

    public Double getClassSumTestscore() {
        return classSumTestscore;
    }

    public void setClassSumTestscore(Double classSumTestscore) {
        this.classSumTestscore = classSumTestscore;
    }

    public Double getClassAvgTestscore() {
        return classAvgTestscore;
    }

    public void setClassAvgTestscore(Double classAvgTestscore) {
        this.classAvgTestscore = classAvgTestscore;
    }

    public Double getClassSumFinalscore() {
        return classSumFinalscore;
    }

    public void setClassSumFinalscore(Double classSumFinalscore) {
        this.classSumFinalscore = classSumFinalscore;
    }

    public Double getClassAvgFinalscore() {
        return classAvgFinalscore;
    }

    public void setClassAvgFinalscore(Double classAvgFinalscore) {
        this.classAvgFinalscore = classAvgFinalscore;
    }
}