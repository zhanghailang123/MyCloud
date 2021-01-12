package org.example;

import cn.hutool.core.net.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description: eureka服务端
 * @author: zhanghailang
 * @date: 2021-1-12 17:43
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {

        int port = 8761;
        if (!NetUtil.isUsableLocalPort(port)){
            System.err.printf("端口%d被占用了，无法启动%n",port);
            System.exit(1);
        }
        new SpringApplicationBuilder(EurekaApplication.class).properties("server.port=" + port).run(args);
    }

//    public static void main(String[] args) {
//        //8761 这个端口是默认的，就不要修改了，后面的子项目，都会访问这个端口。
//        int port = 8761;
//        if(!NetUtil.isUsableLocalPort(port)) {
//            System.err.printf("端口%d被占用了，无法启动%n", port );
//            System.exit(1);
//        }
//        new SpringApplicationBuilder(EurekaApplication.class).properties("server.port=" + port).run(args);
//    }

}