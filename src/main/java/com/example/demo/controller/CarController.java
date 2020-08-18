package com.example.demo.controller;

import com.example.demo.dto.CarDto;
import com.example.demo.servuce.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
public class CarController {
    private CarService service;

    @Autowired
    public CarController(CarService service) {
        this.service = service;
    }

    @PostMapping
    public CarDto save(@RequestBody CarDto carDto) {
        return service.save(carDto);
    }

    @GetMapping(value = "/{id}")
    public CarDto getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
