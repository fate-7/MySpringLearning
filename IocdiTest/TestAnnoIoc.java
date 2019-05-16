package com.rj.spring.IocdiTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnoIoc {

    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/rj/spring/IocdiTest/MySpring.xml");

        UserController userController = (UserController) applicationContext.getBean("UserControllerId");

        userController.addUser();

    }


}
