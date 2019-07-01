package com.sda.spring.demo.service;

import com.sda.spring.demo.model.Computer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComputerService {
    private List<Computer> computerList = new ArrayList<>();
    private int computerIdCounter = 0;

    public boolean addComputer(Computer computer) {
        // jeśli model lub marka (brand) nie jest podany
        // to zwróć false - nie pozwalaj dodawać komputera bez marki
        //
        if (computer.getModel() == null ||
                computer.getModel().isEmpty()) {
            return false;
        } else if (computer.getBrand() == null ||
                computer.getBrand().isEmpty()) {
            return false;
        }

        // nadajemy id komputerowi który tego identyfikatora nie ma.
        computer.setId(computerIdCounter++);

        return computerList.add(computer);
    }

    public boolean addComputer(String name,
                               String brand,
                               String model,
                               double price,
                               int benchmark) {
        Computer computer = new Computer(computerIdCounter++, name, brand, model, price, benchmark);
        return addComputer(computer);
    }

    public List<Computer> getComputerList() {
        return computerList;
    }

    public Computer getComputerWithId(String computerId) {
        int idInteger = Integer.parseInt(computerId);
        for (int i = 0; i < computerList.size(); i++) {
            if(computerList.get(i).getId() ==idInteger){
                return computerList.get(i);
            }
        }
        return null;
    }
}
