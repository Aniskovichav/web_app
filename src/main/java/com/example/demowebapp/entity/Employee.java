package com.example.demowebapp.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name="Employee")
@Table(name="Employee") //  uniqueConstraints={@UniqueConstraint(columnNames={"ID"})}
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(nullable=false, unique=true, length=11)
    private int id;

    @Column(name="NAME", length=20, nullable=true)
    private String name;

    @Column(name="ROLE", length=20, nullable=true)
    private String role;

    @Column(name="insert_time", nullable=true)
    private Date insertTime;
}
