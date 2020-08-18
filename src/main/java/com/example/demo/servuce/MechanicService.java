package com.example.demo.servuce;

import com.example.demo.dto.MechanicDto;
import com.example.demo.entities.Car;
import com.example.demo.entities.Mechanic;
import com.example.demo.mappers.MechanicMapper;
import com.example.demo.repo.CarRepo;
import com.example.demo.repo.MechanicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MechanicService {

    private MechanicRepo repo;
    private MechanicMapper mechanicMapper;
    private CarRepo carRepo;

    @Autowired
    public MechanicService(MechanicRepo repo, MechanicMapper mechanicMapper, CarRepo carRepo) {
        this.repo = repo;
        this.mechanicMapper = mechanicMapper;
        this.carRepo = carRepo;
    }

    public MechanicDto save(final MechanicDto mechanicDto) {
        //carRepo.findById(mechanicDto.getCarId()).orElseThrow(() -> new RuntimeException("NOT FOUND BROOOOO: " + mechanicDto.getCarId()));
        return mechanicMapper.toDto(repo.save(mechanicMapper.toMap(mechanicDto)));
    }

    public MechanicDto getById(Long id) {
        Optional<Mechanic> mechanic = repo.findById(id);

        return mechanicMapper.toDto(mechanic.orElseThrow(null));
    }
}
