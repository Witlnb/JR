package com.Javarecruit.pojo;

import java.util.Date;

public class Comment {
    private Integer uid ;
    private String cmtscontent;
    private Date cmtstime;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getCmtscontent() {
        return cmtscontent;
    }

    public void setCmtscontent(String cmtscontent) {
        this.cmtscontent = cmtscontent;
    }

    public Date getCmtstime() {
        return cmtstime;
    }

    public void setCmtstime(Date cmtstime) {
        this.cmtstime = cmtstime;
    }
}
