package com.example.carshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.carshop.Models.CarModel;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository <CarModel, String> {

    List<CarModel> findByCarOwnerId(String id);

}
