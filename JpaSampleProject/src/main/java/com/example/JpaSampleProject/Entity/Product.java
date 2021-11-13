package com.example.JpaSampleProject.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "sampletable")
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    private String gender;
}
