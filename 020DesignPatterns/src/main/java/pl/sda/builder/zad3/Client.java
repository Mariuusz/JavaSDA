package pl.sda.builder.zad3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {

    private String name;
    private List<Mail> lista = new ArrayList<Mail>();

    public Client(String name) {
        this.name = name;
    }

    public void readMail (Mail m){
        lista.add(m);
        System.out.println("Klient " + name + " otrzymał maila: " + m.getTresc());
    }
}