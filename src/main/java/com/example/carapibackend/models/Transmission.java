package com.example.carapibackend.models;

import com.example.carapibackend.enums.TransmissionType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transmission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String transmissionType;
    private Integer numOfSpeeds;
    private Long carId;


    public Transmission() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public Integer getNumOfSpeeds() {
        return numOfSpeeds;
    }

    public void setNumOfSpeeds(Integer numOfSpeeds) {
        this.numOfSpeeds = numOfSpeeds;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }
}
