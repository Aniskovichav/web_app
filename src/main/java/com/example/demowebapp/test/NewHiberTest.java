package com.example.demowebapp.test;

import com.example.demowebapp.dao.impl.EmployeeDao;
import com.example.demowebapp.db.JPAService;
import com.example.demowebapp.db.config.JpaConfiguration;
import com.example.demowebapp.entity.Employee;

public class NewHiberTest {
    public static void main(String[] args) {
        JpaConfiguration configuration = new JpaConfiguration();
        configuration.setUserName("root");
        configuration.setPassword("");
        configuration.setDriver("com.mysql.jdbc.Driver");
        configuration.setUrl("jdbc:mysql://localhost:3308/j1023_db");
        configuration.setPersistentUnit(Employee.class.getName());

        JPAService.initialize(configuration);
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.findAll().forEach(employee -> {
            System.out.println(employee);
        });
    }
}
