package org.example.config;

import org.example.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @description: ribbon配置
 * @author: zhanghailang
 * @date: 2021/1/12 0012 22:46
 */
@Component
public class StuRibbonClient {
    @Autowired
    RestTemplate restTemplate;
    public List<Student> studentList(){
        return restTemplate.getForObject("",List.class);
    }
}