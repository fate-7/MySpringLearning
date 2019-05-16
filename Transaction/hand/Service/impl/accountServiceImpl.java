package com.rj.spring.Transaction.hand.Service.impl;

import com.rj.spring.Transaction.hand.Dao.AccountDao;
import com.rj.spring.Transaction.hand.Service.accountService;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class accountServiceImpl implements accountService {

    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    //需要spring注入模板
    private TransactionTemplate transactionTemplate;
    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }


    public void transfer(final String outer, final String inner, final int money) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {

            @Override
            protected void doInTransactionWithoutResult(TransactionStatus arg0) {
                accountDao.out(outer, money);
                //断电
//				int i = 1/0;
                accountDao.in(inner, money);
            }
        });
    }
}
