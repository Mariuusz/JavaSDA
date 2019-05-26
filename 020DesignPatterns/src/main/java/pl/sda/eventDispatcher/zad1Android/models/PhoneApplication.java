package pl.sda.eventDispatcher.zad1Android.models;

import pl.sda.eventDispatcher.zad1Android.interfaces.ICallListener;

public class PhoneApplication extends Application implements ICallListener {
    @Override
    public void callStarted(int callId) {
        System.out.println("PhoneApplication - > started -> " + callId);
    }

    @Override
    public void callEnded(int callId) {
        System.out.println("PhoneApplication - > ended -> " + callId);
    }
}