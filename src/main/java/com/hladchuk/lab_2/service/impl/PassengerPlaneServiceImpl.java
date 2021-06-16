package com.hladchuk.lab_2.service.impl;

import com.hladchuk.lab_2.dao.PassengerPlaneDao;
import com.hladchuk.lab_2.model.PassengerPlane;
import com.hladchuk.lab_2.service.PassengerPlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PassengerPlaneServiceImpl implements PassengerPlaneService {
    PassengerPlaneDao passengerPlaneDao;

    @Autowired
    PassengerPlaneServiceImpl(PassengerPlaneDao passengerPlaneDao){
        this.passengerPlaneDao = passengerPlaneDao;
    }
    @Override
    public void save(PassengerPlane object) {
         passengerPlaneDao.save(object);
    }

    @Override
    public void removeById(int id) {
        passengerPlaneDao.removeById(id);
    }

    @Override
    public PassengerPlane findById(int id) {
        return passengerPlaneDao.findById(id);
    }

    @Override
    public List<PassengerPlane> findAll() {
        return passengerPlaneDao.findAll();
    }
}
