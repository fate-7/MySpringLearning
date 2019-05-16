package com.rj.spring.Transaction.hand.Test;

import com.rj.spring.Transaction.hand.Service.accountService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    @Test
    public void demo01(){
        String xmlPath = "com/rj/spring/Transaction/hand/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        accountService accountService = (accountService) applicationContext.getBean("accountServiceId");
        accountService.transfer("jack", "rose", 1000);

    }
}
