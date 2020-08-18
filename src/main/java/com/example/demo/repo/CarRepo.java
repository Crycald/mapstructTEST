package com.example.demo.repo;

import com.example.demo.entities.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepo extends CrudRepository<Car, Long> {
    @Override
    Optional<Car> findById(Long id);

    @Override
    Car save(Car car);
}
