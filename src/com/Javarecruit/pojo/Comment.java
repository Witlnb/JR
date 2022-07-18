package com.Javarecruit.pojo;

import java.util.Date;

public class Comment {
    private Integer uid ;//用户编号
    private String cmtscontent;//评论内容
    private Integer cmtstime; //发布时间

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

    public Integer getCmtstime() {
        return cmtstime;
    }

    public void setCmtstime(Integer cmtstime) {
        this.cmtstime = cmtstime;
    }
}
