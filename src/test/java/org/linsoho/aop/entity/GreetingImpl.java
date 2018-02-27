package org.linsoho.aop.entity;

import org.springframework.stereotype.Component;

/**
 * Created by admin on 2018/2/27.
 */
@Component("myGreetingImpl")
public class GreetingImpl implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello:" + name);
    }
}
