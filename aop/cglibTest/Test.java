package com.rj.spring.aop.cglibTest;

public class Test {

    @org.junit.Test
    public void Demo01(){
        UserServiceImp userService = MyBeanFactory.createUserService();
        userService.addUser();
        userService.updateUser();
        userService.deleteUser();

    }
}
