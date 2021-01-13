package org.example.hystrix;

import org.example.config.StuFeignClient;
import org.example.pojo.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 断路器hystrix
 * @author: zhanghailang
 * @date: 2021/1/13 0013 21:58
 */
@Component
public class StuFeignClientHystrix implements StuFeignClient {

    @Override
    public List<Student> studentList() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("0","学生数据服务暂不可用","0","0"));
        return students;
    }
}