package com.sda.spring.demo.controller;

import com.sda.spring.demo.model.Client;
import com.sda.spring.demo.model.Computer;
import com.sda.spring.demo.model.dto.AddComputerDto;
import com.sda.spring.demo.service.ClientService;
import com.sda.spring.demo.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private ComputerService computerService;

    @GetMapping(path = "/list")
    public ResponseEntity<List<Client>> list(){
        return ResponseEntity.ok(clientService.getClientList());
    }

    @PostMapping(path = "/add")
    public ResponseEntity<Client> add(@RequestBody Client client){
        if(clientService.add(client)){
            return ResponseEntity.ok(client);
//            return ResponseEntity.ok().build();
        }

        return ResponseEntity.badRequest().build();
    }

    @RequestMapping(path = "/addComputer", method = RequestMethod.POST)
    public ResponseEntity<Client> addComputer(@RequestBody AddComputerDto dto){
        Computer computer = computerService.getComputerWithId(dto.getComputerId());

        if(computer != null) {
            if(clientService.addComputerToClient(dto.getPesel(), dto.getComputerId())){
                return ResponseEntity.ok().build();
            }
        }
        return ResponseEntity.badRequest().build();
    }
}
