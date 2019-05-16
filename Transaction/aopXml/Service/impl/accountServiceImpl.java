package com.rj.spring.Transaction.aopXml.Service.impl;

import com.rj.spring.Transaction.aopXml.Dao.AccountDao;
import com.rj.spring.Transaction.aopXml.Service.accountService;

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
