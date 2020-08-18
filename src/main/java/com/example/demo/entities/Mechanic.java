package com.example.demo.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Mechanic {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String city;

    @OneToMany(targetEntity = Car.class)
    private List<Car> carList;

    public Mechanic() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
}
