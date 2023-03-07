package com.example.carshop.Service;

import com.example.carshop.Models.CarModel;
import com.example.carshop.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public CarModel createCar(CarModel carModel) {
        return carRepository.save(carModel);
    }

    public CarModel getSingleCar (String id) {
        return carRepository.findById(id).get();
    }

    public List<CarModel> getAllCars() {
        return carRepository.findAll();
    }

    public CarModel updateCar(CarModel carModel) {
        return carRepository.save(carModel);
    }

    public String deleteCar(String id) {
        carRepository.deleteById(id);
        return "car id: " + id + " has been deleted";
    }

    public List<CarModel> getCarListFromOwner(String id) {
        return carRepository.findByCarOwnerId(id);
    }
}
