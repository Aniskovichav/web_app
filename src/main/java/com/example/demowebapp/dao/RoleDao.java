package com.example.demowebapp.dao;

import com.example.demowebapp.model.Role;
import com.example.demowebapp.model.User;

public interface RoleDao {
    Role findById(int id);
    Role findByUser(User user);
}
