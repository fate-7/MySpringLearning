package com.rj.spring.Transaction.aopXml.Dao;

public interface AccountDao {

    public void in(String inner, int money);

    public void out(String outer, int money);
}
