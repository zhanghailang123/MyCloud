package org.example.server;

import com.netflix.loadbalancer.AbstractLoadBalancer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import org.example.constants.Consts;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description: netty客户端
 * @author: zhanghailang
 * @date: 2021/1/28 0028 22:23
 */
public class NettyServer {
    private EventLoopGroup bossGroup;
    private EventLoopGroup workerGroup;
    private String host;
    private int port;


    public void init(){
        host = Consts.SERVER_HOST;
        port = Consts.SERVER_PORT;
        bossGroup = new NioEventLoopGroup();
        workerGroup = new NioEventLoopGroup();
    }
    public void start(){
        init();
        ServerBootstrap b = new ServerBootstrap();
//        k
        b.group(bossGroup,workerGroup)
                .handler(new LoggingHandler(LogLevel.INFO))
                .channel(NioServerSocketChannel.class);
    }

}