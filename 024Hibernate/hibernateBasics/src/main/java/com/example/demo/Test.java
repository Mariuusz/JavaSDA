package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class Test {

    @Autowired
    CarRepo carRepo;

    @GetMapping("/cokolwiek")
    public void addCar()
    {
        Car c = new Car();
        c.setEngine(1D);
        c.setMark("Fiar");
        c.setModel("126P");
        c.setTank(20);
        c.setYear(LocalDate.of(1991, 1,1));
        carRepo.save(c);
    }

}
