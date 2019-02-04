package com.atguigu.atcrowdfunding.bean;

/**
 * 数据模型，用来封装数据，主要用于从前端获取到的登录用户信息，
 * 避免增加字段的时候多个地方需要同时修改，那样可拓展性差
 */
public class User {
    private Integer id;
    private String loginacct;
    private String userpswd;
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginacct() {
        return loginacct;
    }

    public void setLoginacct(String loginacct) {
        this.loginacct = loginacct;
    }

    public String getUserpswd() {
        return userpswd;
    }

    public void setUserpswd(String userpswd) {
        this.userpswd = userpswd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
