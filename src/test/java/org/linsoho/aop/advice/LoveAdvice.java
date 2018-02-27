package org.linsoho.aop.advice;

import org.aopalliance.intercept.MethodInvocation;
import org.linsoho.aop.entity.Love;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 2018/2/27.
 */
@Component
public class LoveAdvice extends DelegatingIntroductionInterceptor implements Love {

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        return super.invoke(mi);
    }

    @Override
    public void display(String name) {
        System.out.println("You are my heart:" + name);
    }
}
