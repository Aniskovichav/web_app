package com.example.demowebapp.dao;

import com.example.demowebapp.model.User;

public interface UserDAO {

    User findUserByEmail(String email);
    boolean createUser(User user);

}
