package org.example.service;

import org.example.config.StuFeignClient;
import org.example.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 测试feign服务
 * @author: zhanghailang
 * @date: 2021-1-13 15:36
 */
@Service
public class StuService {
    @Autowired
    StuFeignClient stuFeignClient;
    public List<Student> students(){
        return stuFeignClient.studentList();
    }
}