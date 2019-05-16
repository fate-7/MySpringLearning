package com.rj.spring.jdbc.c3p0;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestC3P0 {
    public static void main(String[] args) {

        String xmlPath= "com/rj/spring/jdbc/c3p0/mySpringC3P0.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        UserDao userDao = (UserDao) applicationContext.getBean("UserDaoId");
        userDao.update();

    }
}
