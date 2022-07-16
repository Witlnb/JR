package com.Javarecruit.pojo;

public class Hr {
    //公司号
    private Integer companyid;
    //公司信息
    private String cshow;
    //公司名称
    private String company;
    //手机号
    private String phone;
    //地址
    private String caddress;
    //预计薪资
    private int hmoney;
    //hr密码
    private String cpwd;

    public String getCpwd() {
        return cpwd;
    }

    public void setCpwd(String cpwd) {
        this.cpwd = cpwd;
    }

    public int getHmoney() {
        return hmoney;
    }

    public void setHmoney(int hmoney) {
        this.hmoney = hmoney;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getCshow() {
        return cshow;
    }

    public void setCshow(String cshow) {
        this.cshow = cshow;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }
}
