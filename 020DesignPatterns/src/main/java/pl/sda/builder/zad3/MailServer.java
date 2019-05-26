package pl.sda.builder.zad3;

import java.util.ArrayList;
import java.util.List;

public class MailServer {

    private List<Client> listaKlientow = new ArrayList<Client>();

    public void connect (Client c){
        listaKlientow.add(c);
    }

    public void disconnect (Client c){
        if (listaKlientow.contains(c)){
            listaKlientow.remove(c);
        }
    }

    public void sendMessage (Mail m, Client sender){
        for (Client client : listaKlientow){
            if (!client.equals(sender)){
                client.readMail(m);
            }
        }
    }
}