package com.example.carapibackend.controllers;

import com.example.carapibackend.models.Engine;
import com.example.carapibackend.services.EngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8100")
@RestController
public class EngineController {

    @Autowired
    EngineService engineService;


    @GetMapping(value = "/cars/engine/{carId}")
    public Engine getEngineByCarId (@PathVariable Long carId){
        return engineService.getEngineByCarId(carId);
    }

    @PutMapping(value = "/cars/engine/{carId}")
    public void updateEngineByCarId (@PathVariable Long carId, @RequestBody Engine engine){
        engineService.updateEngineByCarId(carId,engine);
    }



}
