package pl.sda.eventDispatcher.zad1Android.interfaces;

public interface ICallListener {
    void callStarted(int callId);

    void callEnded(int callId);
}