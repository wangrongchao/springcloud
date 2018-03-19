package com.onefew.springboot.domain;

import java.io.Serializable;

/**
 * Created by lenovo on 2018/3/8.
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 2120869894112984147L;

    private int id;
    private String name;
    private String sumScore;
    private String avgScore;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSumScore() {
        return sumScore;
    }

    public void setSumScore(String sumScore) {
        this.sumScore = sumScore;
    }

    public String getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(String avgScore) {
        this.avgScore = avgScore;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
