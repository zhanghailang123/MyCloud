package org.example.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 测试bean
 * 远程服务调用返回bean的过程中，jackson序列化  如果不指定无参构造方法，序列化会失败，即使有其他的的构造方法
 * @author: zhanghailang
 * @date: 2021/1/12 0012 22:26
 */
@Data
public class Student implements Serializable {
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

    /**
     * 无参构造方法，远程调用需要
     */
    public Student() {
    }

    public Student(String name, String sex, String age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}