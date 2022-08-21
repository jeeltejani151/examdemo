package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

   @Id
    private Integer Id;

   private String name;

    public Student() {
    }

    public Integer getId() {
        return Id;
    }

    public Student(Integer id, String name) {
        Id = id;
        this.name = name;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
