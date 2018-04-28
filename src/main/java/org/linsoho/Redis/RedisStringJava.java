package org.linsoho.Redis;

import redis.clients.jedis.Jedis;

/**
 * Created by admin on 2018/4/27.
 */
public class RedisStringJava {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server successfully");
        jedis.set("tutorial-name", "Redis tutorial");
        System.out.println("Stored string in redis:: " + jedis.get("tutorial-name"));
    }
}
