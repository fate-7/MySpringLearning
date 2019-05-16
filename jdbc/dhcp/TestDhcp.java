package com.rj.spring.jdbc.dhcp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDhcp {
    public static void main(String[] args) {

        String xmlPath= "com/rj/spring/jdbc/dhcp/mySpringDhcp.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        UserDao userDao = (UserDao) applicationContext.getBean("UserDaoId");
        userDao.update();


    }
}
