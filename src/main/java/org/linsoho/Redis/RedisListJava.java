package org.linsoho.Redis;

import java.util.List;

/**
 * Created by admin on 2018/4/27.
 */
public class RedisListJava {
    public static void main(String[] args) {
        RedisJava redis = new RedisJava();

        redis.del("tutorial-list");
        redis.lpush("tutorial-list", "Redis");
        redis.lpush("tutorial-list", "Mongodb");
        redis.lpush("tutorial-list", "Mysql");
        List<String> list = redis.lrange("tutorial-list", 0, 5);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Stored string in redis:: " + list.get(i));
        }
    }
}
