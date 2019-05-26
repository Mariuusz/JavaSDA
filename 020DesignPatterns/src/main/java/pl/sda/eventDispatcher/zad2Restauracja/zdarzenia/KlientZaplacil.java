package pl.sda.eventDispatcher.zad2Restauracja.zdarzenia;

import pl.sda.eventDispatcher.eventDispatcher.EventDispatcher;
import pl.sda.eventDispatcher.eventDispatcher.IEvent;
import pl.sda.eventDispatcher.zad2Restauracja.interfejsy.IPowiadamialnyOZaplacieZaPosilek;

import java.util.List;

public class KlientZaplacil implements IEvent {
    private String imieKlienta;

    public KlientZaplacil(String imieKlienta) {
        this.imieKlienta = imieKlienta;
    }

    @Override
    public void execute() {
        List<IPowiadamialnyOZaplacieZaPosilek> powiadamialne = EventDispatcher.getInstance().pobierzObiektyImplementujaceInterfejs(IPowiadamialnyOZaplacieZaPosilek.class);
        for (IPowiadamialnyOZaplacieZaPosilek powiadamialny : powiadamialne) {
            powiadamialny.klientZaplacil(imieKlienta);
        }
    }
}