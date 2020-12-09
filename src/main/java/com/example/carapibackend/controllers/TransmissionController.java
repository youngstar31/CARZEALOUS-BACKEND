package com.example.carapibackend.controllers;

import com.example.carapibackend.models.Transmission;
import com.example.carapibackend.repos.TransmissionRepo;
import com.example.carapibackend.services.TransmissionService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8100")
@RestController
public class TransmissionController {


    @Autowired
    TransmissionService transmissionService;



    @GetMapping(value = "/cars/transmission/{carId}")
    public Transmission getTransmissionByCarId (@PathVariable Long carId) {
        return transmissionService.getTransmissionByCarId(carId);
    }


    @PutMapping(value = "/cars/transmission/{carId}")
    public void updateTransmissionByCarId (@PathVariable Long carId, @RequestBody Transmission transmission) {
        transmissionService.updateTransmissionByCarId(carId, transmission);
    }
}
