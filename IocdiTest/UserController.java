package com.rj.spring.IocdiTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("UserControllerId")
public class UserController {

    @Autowired
    private UserService userService;

    public void addUser() {
        System.out.println("I'm a Controller!!!");
        userService.addUserService();
    }

}
