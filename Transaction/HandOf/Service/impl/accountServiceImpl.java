package com.rj.spring.Transaction.HandOf.Service.impl;

import com.rj.spring.Transaction.HandOf.Dao.AccountDao;
import com.rj.spring.Transaction.HandOf.Service.accountService;

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
