package pl.sda.eventDispatcher.zad1Android.models;

import pl.sda.eventDispatcher.eventDispatcher.EventDispatcher;
import pl.sda.eventDispatcher.zad1Android.events.CallEndedEvent;
import pl.sda.eventDispatcher.zad1Android.events.CallStartedEvent;
import pl.sda.eventDispatcher.zad1Android.interfaces.ICallListener;

public class AndroidSystem extends Application implements ICallListener {

    private Integer trwajacePolaczenie = null;

    public AndroidSystem() {
        new CallRecorderApplication();
        new PhoneApplication();
    }

    @Override
    public void callStarted(int callId) {
        System.out.println("AndroidSystem - > started -> " + callId);
        trwajacePolaczenie = callId;
    }

    @Override
    public void callEnded(int callId) {
        System.out.println("AndroidSystem - > ended -> " + callId);
        trwajacePolaczenie = null;
    }

    public void rozpocznijPolaczenie(int call_id) {
        if (trwajacePolaczenie == null) {
            EventDispatcher.getInstance().rozeslij(new CallStartedEvent(call_id));
        } else {
            System.out.println("Nie moge rozpoczac polaczenie, trwa polaczenie : " + trwajacePolaczenie);
        }
    }

    public void zakonczPolaczenie(int call_id) {
        if (trwajacePolaczenie != null && trwajacePolaczenie == call_id) {
            EventDispatcher.getInstance().rozeslij(new CallEndedEvent(call_id));
        } else {
            System.out.println("Nie moge zakonczyc polaczenia, trwa polaczenie: " + trwajacePolaczenie);
        }
    }
}