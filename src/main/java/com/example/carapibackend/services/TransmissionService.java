package com.example.carapibackend.services;

import com.example.carapibackend.models.Engine;
import com.example.carapibackend.models.Transmission;
import com.example.carapibackend.repos.EngineRepo;
import com.example.carapibackend.repos.TransmissionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransmissionService {

    @Autowired
    TransmissionRepo transmissionRepo;

    public Transmission getTransmissionByCarId(Long carId){
        return transmissionRepo.findTransmissionByCarId(carId);
    }

    public void updateTransmissionByCarId(Long carId, Transmission transmission){
        transmission.setCarId(carId);
        transmissionRepo.save(transmission);
    }
}
