package com.rj.spring.aspectTest.annoTest;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    //切入点当前有效
    //@Before("com.rj.spring.aspectTest.annoTest.UserServiceImp.*(..))")
    public void myBefore(JoinPoint joinPoint){
        System.out.println("前置通知 ： " + joinPoint.getSignature().getName());
    }

    //声明公共切入点
    @Pointcut("execution(* com.rj.spring.aspectTest.annoTest.UserServiceImp.*(..))")
    private void myPointCut(){
    }

    //@AfterReturning(value="myPointCut()" ,returning="ret")
    public void myAfterReturning(JoinPoint joinPoint,Object ret){
        System.out.println("后置通知 ： " + joinPoint.getSignature().getName() + " , -->" + ret);
    }

    //@Around(value = "myPointCut()")
    public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("前");
        //手动执行目标方法
        Object obj = joinPoint.proceed();

        System.out.println("后");
        return obj;
    }

    //@AfterThrowing(value="execution(* com.itheima.d_aspect.b_anno.UserServiceImpl.*(..))" ,throwing="e")
    public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
        System.out.println("抛出异常通知 ： " + e.getMessage());
    }

    @After("myPointCut()")
    public void myAfter(JoinPoint joinPoint){
        System.out.println("最终通知");
    }

}

