package pl.sda.eventDispatcher.zad2Restauracja.zdarzenia;

import pl.sda.eventDispatcher.eventDispatcher.EventDispatcher;
import pl.sda.eventDispatcher.eventDispatcher.IEvent;
import pl.sda.eventDispatcher.zad2Restauracja.interfejsy.IPowiadamialnyOPrzybyciuKlienta;

import java.util.List;

public class KlientPrzyszedl implements IEvent {

    private String imieKlienta;

    public KlientPrzyszedl(String imieKlienta) {
        this.imieKlienta = imieKlienta;
    }

    @Override
    public void execute() {
        List<IPowiadamialnyOPrzybyciuKlienta> powiadamialne = EventDispatcher.getInstance().pobierzObiektyImplementujaceInterfejs(IPowiadamialnyOPrzybyciuKlienta.class);
        for (IPowiadamialnyOPrzybyciuKlienta powiadamialny : powiadamialne) {
            powiadamialny.przybylKlient(imieKlienta);
        }
    }
}