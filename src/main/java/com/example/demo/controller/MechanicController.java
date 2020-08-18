package com.example.demo.controller;

import com.example.demo.dto.MechanicDto;
import com.example.demo.servuce.MechanicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mechanic")
public class MechanicController {
    private MechanicService service;

    @Autowired
    public MechanicController(MechanicService service) {
        this.service = service;
    }

    @PostMapping
    public MechanicDto save(@RequestBody MechanicDto mechanicDto) {
        return service.save(mechanicDto);
    }

    @GetMapping(value = "/{id}")
    public MechanicDto getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
