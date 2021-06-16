package com.hladchuk.lab_2.controller;

import com.hladchuk.lab_2.model.Airport;
import com.hladchuk.lab_2.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:9191")
@RestController
@RequestMapping("/api")
public class AirportController {
    AirportService airportService;

    @Autowired
    public AirportController(AirportService airportService){
        this.airportService = airportService;
    }

    @GetMapping("/getAllAirports")
    public List<Airport> getAirport() {
        return airportService.findAll();
    }

    @GetMapping("/getAirportById/{id}")
    public Airport getAirportById(@PathVariable(value = "id") int id) {
        return airportService.findById(id);
    }

    @PostMapping("/addAirport")
    public void addAirport(@RequestBody Airport airport) {
        airportService.save(airport);
    }

    @PutMapping("/updateAirport/{id}")
    public void updateAirport(@PathVariable(value = "id") int id, @RequestBody Airport airport) {
        Airport newAirport = airportService.findById(id);
        newAirport.setPlanes(airport.getPlanes());
        airportService.save(newAirport);
    }

    @DeleteMapping("/deleteAirport/{id}")
    public void deleteAirport(@PathVariable(value = "id") int id) {
        airportService.removeById(id);
    }
}
