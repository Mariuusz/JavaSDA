package pl.sda.eventDispatcher.zad3ZTM;

import java.util.ArrayList;
import java.util.List;

public class Informator extends AbstractRegistrable implements IPowiadamialnyOAutobusie {
    /**
     * Lista wyświetlonych (zbliżających się) autobusów.
     */
    private List<Autobus> autobuses = new ArrayList<>();

    public Informator() {
    }

    public List<Autobus> getAutobuses() {
        return autobuses;
    }

    public void setAutobuses(List<Autobus> autobuses) {
        this.autobuses = autobuses;
    }

    @Override
    public void powiadomOAutobusie(Autobus o) {
        System.out.println("Informator powiadomiony o autobusie: " + o);
    }
}