package pl.sda.eventDispatcher.zad2Restauracja.modele;


import pl.sda.eventDispatcher.zad2Restauracja.interfejsy.IPowiadamialnyOZamowieniu;

import java.util.List;

public class Kucharz extends AbstractRegistrable implements IPowiadamialnyOZamowieniu {
    @Override
    public void zlozylZamowienie(String imie, List<String> zamowienia) {
        System.out.println("Już robię zamówienie klienta: " + imie + ", jest to : " + zamowienia);
    }
}