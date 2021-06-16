package com.hladchuk.lab_2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Airport {
    private int id;
    private List<Plane> planes;
}
