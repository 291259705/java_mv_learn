package com.mv.service;

import java.util.List;

public interface UserService {

    public void addUser();

    public Object getUser(String name);

    public void updateUser();

    public void deleteUser();

    public List<String> getUserList();
}
