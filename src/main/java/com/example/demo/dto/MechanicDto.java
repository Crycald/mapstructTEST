package com.example.demo.dto;

import java.util.List;

public class MechanicDto {
    private Long id;
    private String name;
    private String city;
    private Long carList;

    public MechanicDto() {
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

    public Long getCarList() {
        return carList;
    }

    public void setCarList(Long carList) {
        this.carList = carList;
    }
}
