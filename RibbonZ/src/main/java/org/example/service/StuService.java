package org.example.service;

import org.example.config.StuRibbonClient;
import org.example.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: zhanghailang
 * @date: 2021/1/12 0012 23:05
 */
@Service
public class StuService {
    @Autowired
    StuRibbonClient stuRibbonClient;
    public List<Student> studentList(){
        return stuRibbonClient.studentList();
    }
}