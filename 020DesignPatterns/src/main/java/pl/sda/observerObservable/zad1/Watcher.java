package pl.sda.observerObservable.zad1;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {
    private String imie;
    private int progZainteresowania;

    public Watcher(String imie, int progZainteresowania) {
        this.imie = imie;
        this.progZainteresowania = progZainteresowania;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Wiadomosc) {
            Wiadomosc wiadomosc = (Wiadomosc) arg;
            if (wiadomosc.getWaga() >= progZainteresowania) {
                System.out.println("Panika! " + imie + " panikuje na wiadomość o:" + wiadomosc.getTresc());
            } else {
                System.out.println("A mnie (" + imie + ") to nie robi...");
            }
        }
    }
}