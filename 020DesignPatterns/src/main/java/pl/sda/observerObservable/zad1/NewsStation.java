package pl.sda.observerObservable.zad1;

import java.util.Observable;

public class NewsStation extends Observable {

    public void powiadomOWiadomosci(int waga, String tresc){
        Wiadomosc wiadomosc = new Wiadomosc(waga, tresc);


        setChanged();
        notifyObservers(wiadomosc);
    }
}