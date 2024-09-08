package com.example.demowebapp.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name="Product")
@Table(name="Products_v2") //  uniqueConstraints={@UniqueConstraint(columnNames={"ID"})}
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(nullable=false, unique=true, length=11)
    private int id;

    @Column(name="NAME", length=20, nullable=true)
    private String name;

    @Column(name="descr", length=20, nullable=true)
    private String descr;

    @Column(name="insert_time", nullable=true)
    private Date insertTime;
}
