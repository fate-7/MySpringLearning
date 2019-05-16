package com.rj.spring.aop.jdkTest;

public class Test {

    @org.junit.Test
    public void Demo01(){
        UserService userService = MyBeanFactory.createUserService();
        userService.addUser();
        userService.updateUser();
        userService.deleteUser();

    }
}
