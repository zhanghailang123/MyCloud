package org.example.controller;

import org.example.pojo.Student;
import org.example.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: 测试A
 * @author: zhanghailang
 * @date: 2021-1-13 14:12
 */
@RestController
public class StuControllerA {
    @Autowired
    StuService stuService;
    @RequestMapping("/students")
    public Object students(){
        List<Student> stus = stuService.studentList();
        return stus;
    }
}