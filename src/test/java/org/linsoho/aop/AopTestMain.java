package org.linsoho.aop;

import org.junit.Test;
import org.linsoho.aop.advice.GreetingAroundAdvice;
import org.linsoho.aop.advice.GreetingBeforeAndAfterAdvice;
import org.linsoho.aop.entity.Greeting;
import org.linsoho.aop.entity.GreetingImpl;
import org.linsoho.aop.entity.Love;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 2018/2/27.
 */
public class AopTestMain {

    @Test
    public void client1() {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new GreetingImpl());
        proxyFactory.addAdvice(new GreetingBeforeAndAfterAdvice());
        proxyFactory.addAdvice(new GreetingAroundAdvice());

        Greeting greeting = (Greeting) proxyFactory.getProxy();
        greeting.sayHello("编程式增强");
    }

    @Test
    public void client2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Greeting greeting = (Greeting) context.getBean("myGreeting");
        greeting.sayHello("声明式增强");
    }

    @Test
    public void client3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        GreetingImpl greeting = (GreetingImpl) context.getBean("myGreeting");
        greeting.sayHello("jack");

        Love love = (Love) greeting;
        love.display("jack");
    }

}
