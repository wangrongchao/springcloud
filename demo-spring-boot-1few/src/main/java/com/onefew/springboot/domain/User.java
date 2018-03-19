package com.onefew.springboot.domain;

/**
 * Created by lenovo on 2018/3/8.
 */
public class User {
    private int id;
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
