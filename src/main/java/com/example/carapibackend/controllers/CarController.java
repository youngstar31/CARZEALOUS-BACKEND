package com.example.carapibackend.controllers;

import com.example.carapibackend.models.Car;
import com.example.carapibackend.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8100")
@RestController
public class CarController {

    @Autowired
    CarService carService;


    @GetMapping(value = "/cars")
    public List<Car> getAllCars(){
        return carService.getAllCars();

    }

    @GetMapping(value = "/cars/{id}")
    public Optional<Car> getCarById(@PathVariable Long id){
        return carService.getCarById(id);
    }

    @PostMapping(value = "/cars")
    public void addCar (@RequestBody Car car) {
        carService.addCar(car);
    }

    @DeleteMapping(value = "/cars/{id}")
    public void deleteACarById (@PathVariable Long id) {
        carService.deleteCarById(id);
    }

    @PutMapping(value = "/cars/{id}")
    public void updateCarById (@PathVariable Long id, @RequestBody  Car car) {
        carService.updateCar(id,car);
    }
}
