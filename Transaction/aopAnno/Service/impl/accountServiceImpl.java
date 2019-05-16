package com.rj.spring.Transaction.aopAnno.Service.impl;

import com.rj.spring.Transaction.aopAnno.Dao.AccountDao;
import com.rj.spring.Transaction.aopAnno.Service.accountService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
public class accountServiceImpl implements accountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(String outer, String inner, int money) {
        accountDao.out(outer, money);
        //断电
        //int i = 1/0;
        accountDao.in(inner, money);

    }

}
