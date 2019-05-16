package com.rj.spring.aop.factoryBean;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void Demo01(){
        String xmlPath = "com/rj/spring/aop/factoryBean/MySpring.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        UserService userService = (UserService) applicationContext.getBean("proxyServiceId");
        userService.addUser();
        userService.updateUser();
        userService.deleteUser();

    }
}
