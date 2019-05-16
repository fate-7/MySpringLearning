package com.rj.spring.Transaction.aopXml.Dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    public void in(String inner, int money) {
        this.getJdbcTemplate().update("update account set money = money + ? where username = ?", money, inner);
    }

    public void out(String outer, int money) {
        this.getJdbcTemplate().update("update account set money = money - ? where username = ?", money, outer);
    }
}
