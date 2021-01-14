package org.example;

import cn.hutool.core.net.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @description: zuul网关启动类
 * 过滤、拦截、权限校验
 * @author: zhanghailang
 * @date: 2021-1-14 15:18
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ZuulZApplication {
    public static void main(String[] args) {
        int port = 8040;
        if(!NetUtil.isUsableLocalPort(port)) {
            System.err.printf("端口%d被占用了，无法启动%n", port );
            System.exit(1);
        }
        new SpringApplicationBuilder(ZuulZApplication.class).properties("server.port=" + port).run(args);
    }
}