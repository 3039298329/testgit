package com.baizhi.entity;

import java.io.Serializable;

/**
 * Created by wyx on 2018/7/11.
 */
public class User implements Serializable{
    private String name;
    private String password;
    private Double salary;

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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public User() {
    }

    public User(String name, String password, Double salary) {
        this.name = name;
        this.password = password;
        this.salary = salary;
    }
}
