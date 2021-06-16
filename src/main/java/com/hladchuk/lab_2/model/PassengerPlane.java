package com.hladchuk.lab_2.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassengerPlane extends Plane{
    private int numSeats;
    @Builder(builderMethodName = "passengerPlaneBuilder")
    public PassengerPlane(int id, int lengthFlight, int staff, int consumption,int numSeats) {
        super(id, lengthFlight,staff,consumption);
        this.numSeats = numSeats;
    }
}
