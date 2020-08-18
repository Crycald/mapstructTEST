package com.example.demo.servuce;

import com.example.demo.dto.CarDto;
import com.example.demo.entities.Car;
import com.example.demo.mappers.CarMapper;
import com.example.demo.repo.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarService {
    private CarMapper mapper;
    private CarRepo repo;

    @Autowired
    public CarService(CarMapper mapper, CarRepo repo) {
        this.mapper = mapper;
        this.repo = repo;
    }

    public CarDto save(CarDto carDto) {
        return mapper.toDto(repo.save(mapper.toMap(carDto)));
    }

    public CarDto getById(Long id) {
        Optional<Car> car = repo.findById(id);

        return mapper.toDto(car.orElseThrow(null));
    }
}
