package com.example.demowebapp.test;

import com.example.demowebapp.dao.ProductsDao;
import com.example.demowebapp.dao.impl.EmployeeDao;
import com.example.demowebapp.db.JPAService;
import com.example.demowebapp.db.config.JpaConfiguration;
import com.example.demowebapp.entity.Employee;
import com.example.demowebapp.entity.Product;

import java.util.Arrays;
import java.util.List;

public class NewHiberTest {

    public static void main(String[] args) {

        JPAService.initialize();

        ProductsDao productsDao = new ProductsDao();

        List<Product> products = productsDao.findAll("name = 'ps 5'");
        System.out.println(products.size());
    }
}
