package org.example;

import cn.hutool.core.net.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @description: turbine监控微服集群的熔断情况
 * @author: zhanghailang
 * @date: 2021-1-14 13:59
 */
@SpringBootApplication
@EnableTurbine
public class TurbineZApplication {
    public static void main(String[] args) {
        int port = 8021;
        if(!NetUtil.isUsableLocalPort(port)) {
            System.err.printf("端口%d被占用了，无法启动%n", port );
            System.exit(1);
        }
        new SpringApplicationBuilder(TurbineZApplication.class).properties("server.port=" + port).run(args);

    }
}