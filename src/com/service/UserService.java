package com.service;

import org.springframework.stereotype.Service;

/**
 * Created by Elivs on 2017/3/13.
 */
@Service
public class UserService {
    public void addUser() {
//        int a = 10/0;
//        System.out.println("add user");
    }

    public void delUser() {
        System.out.println("delete user");
    }
    public void updateUser() {
        System.out.println("update user");
    }
    public void findUser() {
        System.out.println("find user");
    }
    public String login(String userName) {
//        System.out.println("用户登陆了!");
//        System.out.println(userName);
        return userName;
    }
}
