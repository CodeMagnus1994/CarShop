package com.example.carshop.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "theUser")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String password;
    private String message;

    public UserModel(int id, String name, String password, String message) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.message = message;
    }

    public UserModel(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public UserModel() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
