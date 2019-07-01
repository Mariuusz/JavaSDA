package com.sda.spring.demo.service;

import com.sda.spring.demo.model.Client;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {
    private List<Client> clientList = new ArrayList<>();

    public boolean add(Client client) {
        if (!validate(client)) {
            return false;
        }

        return clientList.add(client);
    }

    private boolean validate(Client client) {
        if(client.getPesel() == null ||
                client.getMiesiac() == null ||
                client.getRok() == null){
            return false;
        }

        String peselYear = client.getPesel().substring(0, 2);
        String peselMonth = client.getPesel().substring(2, 4);

        if (!peselYear.equals(client.getRok())) {
            return false;
        } else if (!peselMonth.equals(client.getMiesiac())) {
            return false;
        }

        return true;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public boolean addComputerToClient(String pesel, String computerId) {
        for (Client client : clientList) {
            if(client.getPesel().equals(pesel)){
                addComputerToClient(client, Integer.parseInt(computerId));
                return true;
            }
        }
        return false;
    }

    private void addComputerToClient(Client client, int i) {
        if(client.getComputerList() == null){
            client.setComputerList(new ArrayList<>());
        }
        client.getComputerList().add(i);
    }
}
