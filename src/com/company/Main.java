package com.company;

import com.service.UserService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ac.getBean("userService");
//        userService.findUser();
//        userService.addUser();
        userService.login("zhang3");
    }
}
