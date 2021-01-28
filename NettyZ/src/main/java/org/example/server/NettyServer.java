package org.example.server;

import io.netty.channel.EventLoopGroup;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description: netty客户端
 * @author: zhanghailang
 * @date: 2021/1/28 0028 22:23
 */
public class NettyServer {
    @Autowired
    private EventLoopGroup bossGroup;

}