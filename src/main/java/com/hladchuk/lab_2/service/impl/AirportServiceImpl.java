package com.hladchuk.lab_2.service.impl;

import com.hladchuk.lab_2.dao.AirportDao;
import com.hladchuk.lab_2.model.Airport;
import com.hladchuk.lab_2.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportServiceImpl implements AirportService {
    AirportDao airportDao;

    @Autowired
    AirportServiceImpl(AirportDao airportDao) {
        this.airportDao = airportDao;
    }

    @Override
    public void save(Airport object) {
        airportDao.save(object);
    }

    @Override
    public void removeById(int id) {
        airportDao.removeById(id);
    }

    @Override
    public Airport findById(int id) {
        return airportDao.findById(id);
    }

    @Override
    public List<Airport> findAll() {
        return airportDao.findAll();
    }
}
