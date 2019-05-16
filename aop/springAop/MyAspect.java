package com.rj.spring.aop.springAop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.JoinPoint;

public class MyAspect implements MethodInterceptor {

    public void before() {
        System.out.println("----之前----");
    }

    public void after() {
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
