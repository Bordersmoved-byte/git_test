package com.yz.xuliehua;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = -4392658638228508589L;
    private String name;
    private Integer age;
    private Integer score;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(final Integer age) {
        this.age = age;
    }

    public Integer getScore() {
        return this.score;
    }

    public void setScore(final Integer score) {
        this.score = score;
    }
}
