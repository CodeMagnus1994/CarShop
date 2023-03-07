package com.example.carshop.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "Cars")
public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(targetEntity = UserModel.class)
    @JoinColumn(name = "owner", referencedColumnName = "id")
    private UserModel carOwner;

    private String brand;
    private String model;

    public CarModel(int id, UserModel carOwner, String brand, String model) {
        this.id = id;
        this.carOwner = carOwner;
        this.brand = brand;
        this.model = model;
    }

    public CarModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserModel getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(UserModel carOwner) {
        this.carOwner = carOwner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
