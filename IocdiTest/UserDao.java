package com.rj.spring.IocdiTest;

import org.springframework.stereotype.Repository;

@Repository("UserDaoId")
public class UserDao {
    public void addUserDao() {
        System.out.println("than I find a Dao!!!");
    }
}
