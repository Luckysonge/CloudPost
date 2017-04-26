package com.cloudPost.entity;

import java.util.Date;

public class RecentLetters {
    private String userid;

    private Integer letterid;

    private Date readtime;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getLetterid() {
        return letterid;
    }

    public void setLetterid(Integer letterid) {
        this.letterid = letterid;
    }

    public Date getReadtime() {
        return readtime;
    }

    public void setReadtime(Date readtime) {
        this.readtime = readtime;
    }
}