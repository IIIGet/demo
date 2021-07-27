package com.example.entity;

/**
 * @Author LJM
 * @Date 2021/7/26 20:07
 * @Version 1.0
 */
public class Pr_User {
    private  int pr_userid;
    private String pr_username;
    private String pr_password;
    private String pr_realName;
    private String business;

    public int getPr_userid() {
        return pr_userid;
    }

    public void setPr_userid(int pr_userid) {
        this.pr_userid = pr_userid;
    }

    public String getPr_username() {
        return pr_username;
    }

    public void setPr_username(String pr_username) {
        this.pr_username = pr_username;
    }

    public String getPr_password() {
        return pr_password;
    }

    public void setPr_password(String pr_password) {
        this.pr_password = pr_password;
    }

    public String getPr_realName() {
        return pr_realName;
    }

    public void setPr_realName(String pr_realName) {
        this.pr_realName = pr_realName;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }
}
