package org.example.config;

import org.example.hystrix.StuFeignClientHystrix;
import org.example.pojo.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @description: feign客户端写死的配置
 * @author: zhanghailang
 * @date: 2021-1-13 15:06
 */
@FeignClient(value = "EurekaClientA",fallback = StuFeignClientHystrix.class)
public interface StuFeignClient {
    @GetMapping("/students")
    public List<Student> studentList();
}