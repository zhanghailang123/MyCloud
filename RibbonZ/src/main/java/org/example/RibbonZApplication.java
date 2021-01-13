package org.example;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.net.NetUtil;
import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.NumberUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @description: Ribbon启动类
 * @author: zhanghailang
 * @date: 2021-1-13 10:14
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonZApplication {
    public static void main(String[] args) {
        int port = 0;
        int defaultPort = 8010;
        Future<Integer> future = ThreadUtil.execAsync(() ->{
            int p = 0;
            System.out.println("请于5秒内输入端口号，超过5秒将默认使用 8010");
            Scanner scanner = new Scanner(System.in);
            while (true){
                String strPort = scanner.nextLine();
                if (!NumberUtil.isNumber(strPort)){
                    System.err.println("只能是数字");
                    continue;
                }else {
                    p = Convert.toInt(strPort);
                    scanner.close();
                    break;
                }
            }
            return p;
        });
        try{
            port = future.get(5, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            port = defaultPort;
        }
        if (!NetUtil.isUsableLocalPort(port)){
            System.err.println("端口被占用");
            System.exit(1);
        }
        new SpringApplicationBuilder(RibbonZApplication.class).properties("server.port=" + port).run(args);
    }
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}