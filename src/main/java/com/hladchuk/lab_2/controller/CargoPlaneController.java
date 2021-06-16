package com.hladchuk.lab_2.controller;

import com.hladchuk.lab_2.model.CargoPlane;
import com.hladchuk.lab_2.service.CargoPlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:9191")
@RestController
@RequestMapping("/api")
public class CargoPlaneController {
    CargoPlaneService cargoPlaneService;

    @Autowired
    public CargoPlaneController(CargoPlaneService cargoPlaneService) {
        this.cargoPlaneService = cargoPlaneService;
    }

    @GetMapping("/getAllCargoPlanes")
    public List<CargoPlane> getCargoPlane() {
        return cargoPlaneService.findAll();
    }

    @GetMapping("/getCargoPlaneById/{id}")
    public CargoPlane getPlaneById(@PathVariable(value = "id") int id) {
        return cargoPlaneService.findById(id);
    }

    @PostMapping("/addCargoPlane")
    public void addPlane(@RequestBody CargoPlane cargoPlane) {
        cargoPlaneService.save(cargoPlane);
    }

    @PutMapping("/updateCargoPlane/{id}")
    public void updatePlane(@PathVariable(value = "id") int id, @RequestBody CargoPlane cargoPlane) {
        CargoPlane newPlane = cargoPlaneService.findById(id);
        newPlane.setConsumption(cargoPlane.getConsumption());
        newPlane.setStaff(cargoPlane.getStaff());
        newPlane.setLengthFlight(cargoPlane.getLengthFlight());
        newPlane.setCapacity(cargoPlane.getCapacity());
        cargoPlaneService.save(newPlane);
    }

    @DeleteMapping("/deleteCargoPlane/{id}")
    public void deletePlane(@PathVariable(value = "id") int id) {
        cargoPlaneService.removeById(id);
    }
}


