package com.cloudPost.entity;

import java.util.Date;

public class Notify {
    private Integer notifyid;

    private String userid;

    private Date time;

    private Integer iscomment;

    private String source;

    private Integer letterid;

    private Integer readed;

    public Integer getNotifyid() {
        return notifyid;
    }

    public void setNotifyid(Integer notifyid) {
        this.notifyid = notifyid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getIscomment() {
        return iscomment;
    }

    public void setIscomment(Integer iscomment) {
        this.iscomment = iscomment;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getLetterid() {
        return letterid;
    }

    public void setLetterid(Integer letterid) {
        this.letterid = letterid;
    }

    public Integer getReaded() {
        return readed;
    }

    public void setReaded(Integer readed) {
        this.readed = readed;
    }
}