package org.linsoho.Redis;

import java.util.*;

/**
 * Created by admin on 2018/4/27.
 */
public class RedisKeyJava {
    public static void main(String[] args) {
        RedisJava redis = new RedisJava();

        Set<String> set = redis.keys("*");
        set.forEach((val) -> {
            System.out.println("Set of stored key:: " + val);
        });
    }
}
