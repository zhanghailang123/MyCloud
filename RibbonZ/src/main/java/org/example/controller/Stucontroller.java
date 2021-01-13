package org.example.controller;

import org.example.pojo.Student;
import org.example.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @description: student控制器
 * @author: zhanghailang
 * @date: 2021-1-13 9:52
 */
@Controller
public class Stucontroller {
    @Autowired
    StuService stuService;
    @RequestMapping("/students")
    public Object students(Model model){
       List<Student> stus =  stuService.studentList();
       model.addAttribute("stus",stus);
       return "students";

    }
}