package com.ssm.test.entity;

import java.io.Serializable;

public class PUser implements Serializable {
    private static final long serialVersionUID = 1L;

    /**用户ID*/
    private String id;
    /**用户名*/
    private String username;
    /**密码*/
    private String password;
    public PUser() {
    }

    public PUser(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "PUser{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
