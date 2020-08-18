package com.example.demo.mappers;

import com.example.demo.entities.Car;
import com.example.demo.dto.CarDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CarMapper {

    CarDto toDto(Car car);

    Car toMap(CarDto carDto);
}
