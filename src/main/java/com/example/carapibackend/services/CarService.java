package com.example.carapibackend.services;

import com.example.carapibackend.enums.TransmissionType;
import com.example.carapibackend.models.Car;
import com.example.carapibackend.repos.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    CarRepo carRepo;



    public Optional<Car> getCarById(Long id){
        return carRepo.findById(id);
    }

    public List<Car> getAllCars(){
        List <Car> carList = new ArrayList<>();
        carRepo.findAll().forEach(carList::add);
        return carList;
    }

    public Car addCar(Car car) {
        return carRepo.save(car);
    }

    public void deleteCarById(Long carId) {
        carRepo.deleteById(carId);
    }

    public Car updateCar(Long id, Car car) {
        car.setId(id);
        return carRepo.save(car);
    }
}
