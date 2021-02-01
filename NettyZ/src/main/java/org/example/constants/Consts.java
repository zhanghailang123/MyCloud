package org.example.constants;

import io.netty.util.AttributeKey;

/**
 * @description:
 * @author: zhanghailang
 * @date: 2021-1-29 10:11
 */
public class Consts {
    public static final String SERVER_HOST = "127.0.0.1";
    public static final int SERVER_PORT = 8099;
    public static AttributeKey<String> playerKey =AttributeKey.newInstance("player_key");
}