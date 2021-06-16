package com.hladchuk.lab_2.dao.impl;

import com.hladchuk.lab_2.dao.PassengerPlaneDao;
import com.hladchuk.lab_2.model.PassengerPlane;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
public class PassengerPlaneDaoImpl implements PassengerPlaneDao {
    private Map<Integer,PassengerPlane> passengerPlanes = new LinkedHashMap<>();

    public void PassengerPlaneDaoImpl(){
    }

    @Override
    public void save(PassengerPlane object) {
        passengerPlanes.put(object.getId(),object);
    }

    @Override
    public void removeById(int id) {
        passengerPlanes.remove(id);
    }

    @Override
    public PassengerPlane findById(int id) {
        return passengerPlanes.get(id);
    }

    @Override
    public List<PassengerPlane> findAll() {
        return new ArrayList<>(passengerPlanes.values());
    }
}
