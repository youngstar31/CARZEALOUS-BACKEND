package com.example.carapibackend.services;

import com.example.carapibackend.models.Engine;
import com.example.carapibackend.repos.EngineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EngineService {

    @Autowired
    EngineRepo engineRepo;

    public Engine getEngineByCarId(Long carId){
       return engineRepo.findEngineByCarId(carId);
    }

    public void updateEngineByCarId(Long carId, Engine engine){
        engine.setCarId(carId);
        engineRepo.save(engine);
    }
}
