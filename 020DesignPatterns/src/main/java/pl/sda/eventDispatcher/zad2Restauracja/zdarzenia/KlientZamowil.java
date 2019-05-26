package pl.sda.eventDispatcher.zad2Restauracja.zdarzenia;


import pl.sda.eventDispatcher.eventDispatcher.EventDispatcher;
import pl.sda.eventDispatcher.eventDispatcher.IEvent;
import pl.sda.eventDispatcher.zad2Restauracja.interfejsy.IPowiadamialnyOZamowieniu;

import java.util.ArrayList;
import java.util.List;

public class KlientZamowil implements IEvent {
    private String imie;

    public KlientZamowil(String imie) {
        this.imie = imie;
    }

    @Override
    public void execute() {
        List<IPowiadamialnyOZamowieniu> powiadamialne = EventDispatcher.getInstance().pobierzObiektyImplementujaceInterfejs(IPowiadamialnyOZamowieniu.class);
        for (IPowiadamialnyOZamowieniu powiadamialny : powiadamialne) {
            powiadamialny.zlozylZamowienie(imie, new ArrayList<String>());
        }
    }
}