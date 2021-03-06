package com.rj.spring.Transaction.HandOf.Test;

import com.rj.spring.Transaction.HandOf.Service.accountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    @Test
    public void demo01(){
        String xmlPath = "com/rj/spring/Transaction/HandOf/applicationContext1.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        accountService accountService = (accountService) applicationContext.getBean("proxyAccountService");
        accountService.transfer("rose", "jack", 1000);

    }
}
