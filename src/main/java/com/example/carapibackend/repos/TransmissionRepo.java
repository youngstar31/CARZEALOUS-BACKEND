package com.example.carapibackend.repos;

import com.example.carapibackend.models.Transmission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransmissionRepo extends CrudRepository<Transmission, Long> {

    Transmission findTransmissionByCarId(Long carId);
}
