package com.hladchuk.lab_2.dao.impl;

import com.hladchuk.lab_2.dao.CargoPlaneDao;
import com.hladchuk.lab_2.model.CargoPlane;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CargoPlaneDaoImpl implements CargoPlaneDao {
    private Map<Integer,CargoPlane> cargoPlanes =  new LinkedHashMap<>();

    public void CargoPlaneDaoImpl(){

    }

    @Override
    public void save(CargoPlane object) {
        cargoPlanes.put(object.getId(), object);
    }

    @Override
    public void removeById(int id) {
        cargoPlanes.remove(id);
    }

    @Override
    public CargoPlane findById(int id) {
        return cargoPlanes.get(id);
    }

    @Override
    public List<CargoPlane> findAll() {
        return new ArrayList<>(cargoPlanes.values());

    }
}
