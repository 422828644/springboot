package org.linsoho.Redis;

import redis.clients.jedis.Jedis;

/**
 * Created by admin on 2018/4/27.
 */
public class RedisJava extends Jedis {
    public static void main(String[] args) {
        RedisJava redisJava = new RedisJava();
    }

    public RedisJava() {
        super("localhost");
        System.out.println("Connection to server sucessfully");
        System.out.println("Server is running: " + this.ping());
    }
}
