package com.sda.spring.demo.controller;

import com.sda.spring.demo.model.Computer;
import com.sda.spring.demo.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/computer")
public class ComputerController {

    @Autowired
    private ComputerService computerService;

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public ResponseEntity add(@RequestBody Computer computer) {
        boolean success = computerService.addComputer(computer);

        // jeśli uda się dodać zwróć ok! - 200
        if (success) {
            return ResponseEntity.ok(computer);
        }

        // jeśli nie uda się dodać komputera, zwróć bad request 400
        return ResponseEntity.badRequest().build();
    }

    /**
     * Metoda listowania obiektów z serwisu
     *
     * @return - zwraca listę komputerów
     */
    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<Computer>> list() {
        return ResponseEntity.ok(computerService.getComputerList());
    }

    //    @GetMapping(path = "/metoda")
//    @RequestMapping(path = "/metoda", method = RequestMethod.GET)
//    public ResponseEntity<String> metoda() {
//        return ResponseEntity.ok("Hello World!");
//    }
//
//    @RequestMapping(path = "/metodaComputerTest", method = RequestMethod.GET)
//    public ResponseEntity<Computer> metodaComputer() {
//        Computer computer = new Computer("Szybki", "Dell", "INSPIRON", 20000.0, 2);
//
//        return ResponseEntity.ok(computer);
//    }
}
