package com.mv.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Integer id;
    private String name;
    private Integer age;

    public User(Integer id,String name) {
        this.id = id;
        this.name = name;
        users.add(this);
    }

    public User(String name,Integer age) {
        this.name = name;
        this.age = age;
        users.add(this);
    }

    public String getName() {
        return name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users.addAll(users);
    }

    public List<User> users=new ArrayList<>();

}
