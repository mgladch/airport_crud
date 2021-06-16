package com.hladchuk.lab_2.dao.impl;

import com.hladchuk.lab_2.dao.AirportDao;
import com.hladchuk.lab_2.model.Airport;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AirportDaoImpl implements AirportDao {
    private Map<Integer,Airport> airports = new LinkedHashMap<>();

    public void AirportDaoImpl() {
    }

    @Override
    public void save(Airport object) {
        airports.put(object.getId(),object);
    }


    @Override
    public void removeById(int id) {
        airports.remove(id);
    }

    @Override
    public Airport findById(int id) {
        return airports.get(id);
    }

    @Override
    public List<Airport> findAll() {
        return new ArrayList<>(airports.values());
    }
}
