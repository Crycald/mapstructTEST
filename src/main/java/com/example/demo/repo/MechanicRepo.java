package com.example.demo.repo;

import com.example.demo.entities.Mechanic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MechanicRepo extends CrudRepository<Mechanic, Long> {

    @Override
    Mechanic save(Mechanic mechanic);

    @Override
    Optional<Mechanic> findById(Long id);
}
