package com.example.carapibackend.repos;

import com.example.carapibackend.models.Engine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EngineRepo extends CrudRepository<Engine, Long> {
    Engine findEngineByCarId(Long carId);
}
