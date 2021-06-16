package com.hladchuk.lab_2.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CargoPlane extends Plane {
    private  int capacity;
    @Builder(builderMethodName = "cargoPlaneBuilder")
    public CargoPlane(int id, int lengthFlight, int staff, int consumption,int capacity) {
        super(id, lengthFlight,staff,consumption);
        this.capacity = capacity;
    }
}