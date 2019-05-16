package com.rj.spring.Transaction.aopAnno.Service;

public interface accountService {
    public void transfer(String outer, String inner, int money);
}
