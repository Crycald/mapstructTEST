package com.example.demo.mappers;

import com.example.demo.dto.MechanicDto;
import com.example.demo.entities.Car;
import com.example.demo.entities.Mechanic;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
@Mapper(componentModel = "spring", uses = {CarMapper.class})
public interface MechanicMapper {

    @Mapping(target = "carList")
    MechanicDto toDto(Mechanic mechanic);

    @InheritInverseConfiguration
    Mechanic toMap(MechanicDto mechanicDto);


}