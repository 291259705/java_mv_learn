package com.mv.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

// @Component("userServiceId")
public class UserServiceImpl implements UserService {

    public List<String> _userList = new ArrayList<>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Value("老王")
    private String userName;


    @Override
    public void addUser() {

        _userList.add(getUserName());

        System.out.println("添加用户成功");
    }

    @Override
    public Object getUser(String name) {
        for (String s : getUserList()) {
            if (s.equals(name)) {
                return s;
            }
        }
        return null;
    }


    @Override
    public void updateUser() {
        System.out.println("updateUser");
    }

    @Override
    public void deleteUser() {
        System.out.println("deleteUser");
    }

    @Override
    public List<String> getUserList() {
        return _userList;
    }

    @PostConstruct
    public void init() {
        System.out.println("初始化");
        if (userName != null) this.addUser();
    }

    @PreDestroy
    public void destory(){
        System.out.println("销毁");
    }

}