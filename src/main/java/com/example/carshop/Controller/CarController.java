package com.example.carshop.Controller;

import com.example.carshop.Models.CarModel;
import com.example.carshop.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars/")
public class CarController {

    @Autowired
    CarService carService;

    @PostMapping("createcar")
    public CarModel createSingleCar(@RequestBody CarModel carModel) {
        return carService.createCar(carModel);
    }

    @GetMapping("getsinglecar/{id}")
    public CarModel getSingleCar(@PathVariable String id) {
        return carService.getSingleCar(id);
    }

    @GetMapping("allcars")
    public List<CarModel> getAllCars() {
        return carService.getAllCars();
    }

    @PostMapping("updatecar")
    public CarModel updateCar(@RequestBody CarModel carModel) {
        return carService.updateCar(carModel);
    }

    @DeleteMapping("deletecar/{id}")
    public String deleteCar(@PathVariable String id) {
        return carService.deleteCar(id);
    }

    @GetMapping("owndcars/{id}")
    public List<CarModel> getCarsByOwnerId(@PathVariable String id) {
        return carService.getCarListFromOwner(id);
    }

}
