package org.linsoho.aop.entity;

import org.springframework.stereotype.Component;

/**
 * Created by admin on 2018/2/27.
 */
@Component
public interface Greeting {

    void sayHello(String name);
}
