package com.hladchuk.lab_2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plane {
    private int id;
    private int lengthFlight;
    private int staff;
    private int consumption;
}
