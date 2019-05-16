package com.rj.spring.IocdiTest;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    private UserDao userDao;

    @Resource(name = "UserDaoId")
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void addUserService() {
        System.out.println("I find a Service!!!");
        userDao.addUserDao();
    }
}
