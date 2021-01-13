package org.example.controller;

import org.example.pojo.Student;
import org.example.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @description: feign控制器测试
 * @author: zhanghailang
 * @date: 2021-1-13 15:43
 */
@Controller
public class StuController {
    @Autowired
    StuService stuService;
    @RequestMapping("/students")
    public Object students(Model model){
        List<Student> stus = stuService.students();
        model.addAttribute("stus",stus);
        return "students";
    }
}