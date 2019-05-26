package pl.sda.eventDispatcher.zad2Restauracja.zdarzenia;

import pl.sda.eventDispatcher.eventDispatcher.EventDispatcher;
import pl.sda.eventDispatcher.eventDispatcher.IEvent;
import pl.sda.eventDispatcher.zad2Restauracja.interfejsy.IPowiadamialnyOWyjsciuKlienta;

import java.util.List;

public class KlientWyszedl implements IEvent {
    private String imie;

    public KlientWyszedl(String imie) {
        this.imie = imie;
    }

    @Override
    public void execute() {
        List<IPowiadamialnyOWyjsciuKlienta> powiadamialne =
                EventDispatcher.getInstance().pobierzObiektyImplementujaceInterfejs(IPowiadamialnyOWyjsciuKlienta.class);
        for (IPowiadamialnyOWyjsciuKlienta powiadamialny : powiadamialne) {
            powiadamialny.klientOpuscilLokal(imie);
        }
    }
}