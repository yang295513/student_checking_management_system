package com.qs304.student_checking_management_system.entity;

public class CurInfo {
    private Integer curId;

    private String curName;

    private Integer curLearntime;

    private Integer curScore;

    public Integer getCurId() {
        return curId;
    }

    public void setCurId(Integer curId) {
        this.curId = curId;
    }

    public String getCurName() {
        return curName;
    }

    public void setCurName(String curName) {
        this.curName = curName == null ? null : curName.trim();
    }

    public Integer getCurLearntime() {
        return curLearntime;
    }

    public void setCurLearntime(Integer curLearntime) {
        this.curLearntime = curLearntime;
    }

    public Integer getCurScore() {
        return curScore;
    }

    public void setCurScore(Integer curScore) {
        this.curScore = curScore;
    }
}