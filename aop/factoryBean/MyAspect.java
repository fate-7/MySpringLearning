package com.rj.spring.aop.factoryBean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

    public void before(){
        System.out.println("----之前----");
    }

    public void after(){
        System.out.println("----之后----");
    }

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        before();
        //手动执行目标方法
        methodInvocation.proceed();
        after();
        return null;
    }
}
