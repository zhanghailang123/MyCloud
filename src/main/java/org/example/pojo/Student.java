package org.example.pojo;

import lombok.Data;

/**
 * @description: 测试bean
 * @author: zhanghailang
 * @date: 2021/1/12 0012 22:26
 */
@Data
public class Student {
    private String name;
    private String sex;
    private String age;
    private String score;

    public Student(String name, String sex, String age, String score) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
    }
}