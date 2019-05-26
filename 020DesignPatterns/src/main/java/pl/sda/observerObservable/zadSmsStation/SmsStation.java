package pl.sda.observerObservable.zadSmsStation;

import java.util.Observable;

public class SmsStation extends Observable{

    public void addPhone(Phone p) {
        addObserver(p);
    }

    public void removePhone(Phone p) {
        deleteObserver(p);
    }

    public void sendSms(String numerDoKogo, String tresc) {
        Message wiadomosc = new Message(numerDoKogo, tresc);

        setChanged();
        notifyObservers(wiadomosc);
    }

    public void sendMms(String numerDoKogo, String tresc, boolean costam) {
        MMSMessage wiadomosc = new MMSMessage(numerDoKogo, tresc, costam);

        setChanged();
        notifyObservers(wiadomosc);
    }
}