package com.hladchuk.lab_2.service.impl;

import com.hladchuk.lab_2.dao.CargoPlaneDao;
import com.hladchuk.lab_2.model.CargoPlane;
import com.hladchuk.lab_2.service.CargoPlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CargoPlaneServiceImpl implements CargoPlaneService {
    CargoPlaneDao cargoPlaneDao;

    @Autowired
    CargoPlaneServiceImpl(CargoPlaneDao cargoPlaneDao){
        this.cargoPlaneDao = cargoPlaneDao;
    }
    @Override
    public void save(CargoPlane object) {
         cargoPlaneDao.save(object);
    }

    @Override
    public void removeById(int id) {
        cargoPlaneDao.removeById(id);
    }

    @Override
    public CargoPlane findById(int id) {
        return cargoPlaneDao.findById(id);
    }

    @Override
    public List<CargoPlane> findAll() {
        return cargoPlaneDao.findAll();
    }
}
