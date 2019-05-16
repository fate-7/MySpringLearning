package com.rj.spring.Transaction.hand.Dao;

public interface AccountDao {

    public void in(String inner, int money);

    public void out(String outer, int money);
}
