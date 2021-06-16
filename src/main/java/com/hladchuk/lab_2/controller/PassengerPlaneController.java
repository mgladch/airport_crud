package com.hladchuk.lab_2.controller;

import com.hladchuk.lab_2.model.PassengerPlane;
import com.hladchuk.lab_2.service.PassengerPlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:9191")
@RestController
@RequestMapping("/api")
public class PassengerPlaneController {
    PassengerPlaneService passengerPlaneService;

    @Autowired
    public PassengerPlaneController(PassengerPlaneService passengerPlaneService) {
        this.passengerPlaneService = passengerPlaneService;
    }

    @GetMapping("/getAllPassengerPlanes")
    public List<PassengerPlane> getPassengerPlane() {
        return passengerPlaneService.findAll();
    }

    @GetMapping("/getPassengerPlaneById/{id}")
    public PassengerPlane getPlaneById(@PathVariable(value = "id") int id) {
        return passengerPlaneService.findById(id);
    }

    @PostMapping("/addPassengerPlane")
    public void addPlane(@RequestBody PassengerPlane passengerPlane) {
        passengerPlaneService.save(passengerPlane);
    }

    @PutMapping("/updatePassengerPlane/{id}")
    public void updatePlane(@PathVariable(value = "id") int id, @RequestBody PassengerPlane passengerPlane) {
        PassengerPlane newPlane = passengerPlaneService.findById(id);
        newPlane.setConsumption(passengerPlane.getConsumption());
        newPlane.setStaff(passengerPlane.getStaff());
        newPlane.setLengthFlight(passengerPlane.getLengthFlight());
        newPlane.setNumSeats(passengerPlane.getNumSeats());
        passengerPlaneService.save(newPlane);
    }

    @DeleteMapping("/deletePassengerPlane/{id}")
    public void deletePlane(@PathVariable(value = "id") int id) {
        passengerPlaneService.removeById(id);
    }

}
