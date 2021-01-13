package org.example.service;

import org.example.pojo.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: zhanghailang
 * @date: 2021-1-13 14:07
 */
@Service
public class StuService {
    @Value("${server.port}")
    String port;
    public List<Student> studentList(){
        List<Student> ps = new ArrayList<>();
        ps.add(new Student("张言","ann + 大沙北：" +port,"23","88"));
        ps.add(new Student("lisi","ann+ 端口号：" +port,"26","99"));
        ps.add(new Student("wangwu","ann+ 端口号：" +port,"29","100"));
        System.out.println("服务被调用！！！！！！！！！！！！！！");
        return ps;
    }
}