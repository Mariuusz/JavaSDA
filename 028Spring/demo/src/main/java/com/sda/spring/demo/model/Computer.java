package com.sda.spring.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Computer {
    private int id;

    private String name;
    private String brand;
    private String model;
    private double price;
    private int benchmarkPoints;

}
