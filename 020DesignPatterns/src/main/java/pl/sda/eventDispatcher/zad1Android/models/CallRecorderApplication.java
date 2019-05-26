package pl.sda.eventDispatcher.zad1Android.models;

import pl.sda.eventDispatcher.zad1Android.interfaces.ICallListener;

public class CallRecorderApplication extends Application implements ICallListener {
    @Override
    public void callStarted(int callId) {
        System.out.println("CallRecorderApplication - > started -> " + callId);
    }

    @Override
    public void callEnded(int callId) {
        System.out.println("CallRecorderApplication - > ended -> " + callId);
    }
}