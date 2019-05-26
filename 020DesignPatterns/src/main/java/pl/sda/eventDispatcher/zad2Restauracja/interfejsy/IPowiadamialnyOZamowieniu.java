package pl.sda.eventDispatcher.zad2Restauracja.interfejsy;

import java.util.List;

public interface IPowiadamialnyOZamowieniu {
    void zlozylZamowienie(String imie, List<String> zamowienia);
}