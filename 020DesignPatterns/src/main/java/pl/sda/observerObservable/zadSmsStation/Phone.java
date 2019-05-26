package pl.sda.observerObservable.zadSmsStation;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Phone implements Observer {
    private String phoneNumber;
    private List<String> inbox = new ArrayList<>();

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
//
//    public void notifySMS(String numerDoKogo, String tresc) {
//        if (numerDoKogo.equals(phoneNumber)) {
//            inbox.add(tresc);
//        }
//    }
//
//    public void notifyMMS(String numerDoKogo, String tresc) {
//        if (numerDoKogo.equals(phoneNumber)) {
//            inbox.add(tresc);
//        }
//    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Message) {
            Message wiadomosc = (Message) arg;
            if (wiadomosc.getNumer().equals(phoneNumber)) {
                inbox.add(wiadomosc.getTresc());
                System.out.println("To tresc do mnie " + this);
            } else {
                System.out.println("To nie do mnie : " + phoneNumber);
            }
        }
        if (arg instanceof MMSMessage){
            MMSMessage mms = (MMSMessage)arg;
            if (mms.getDoKogo().equals(phoneNumber)) {
                inbox.add(mms.getCo());
                System.out.println("To MMS do mnie " + this);
            } else {
                System.out.println("To MMS nie do mnie : " + phoneNumber);
            }
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", inbox=" + inbox +
                '}';
    }
}