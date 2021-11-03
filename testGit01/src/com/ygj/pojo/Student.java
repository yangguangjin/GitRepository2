package com.ygj.pojo;

import java.io.Serializable;

/**
 * @Auther: ygj
 * @Date: 2021/11/3 - 11 - 03 - 10:31
 */
public class Student implements Serializable {
    private String name;
    private String address;
    private Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }
}
