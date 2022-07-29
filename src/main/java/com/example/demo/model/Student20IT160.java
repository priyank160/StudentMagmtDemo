package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Student20IT160 { // POJO class or Bean Class
    @Id
    private Integer id;
    private String firstName;

    public Student20IT160(Integer id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public Student20IT160() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
