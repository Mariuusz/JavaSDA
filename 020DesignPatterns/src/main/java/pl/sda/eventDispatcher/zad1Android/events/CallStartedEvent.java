package pl.sda.eventDispatcher.zad1Android.events;

import pl.sda.eventDispatcher.eventDispatcher.EventDispatcher;
import pl.sda.eventDispatcher.eventDispatcher.IEvent;
import pl.sda.eventDispatcher.zad1Android.interfaces.ICallListener;

import java.util.List;

public class CallStartedEvent implements IEvent {
    private int callId;

    public CallStartedEvent(int callId) {
        this.callId = callId;
    }

    @Override
    public void execute() {
        List<ICallListener> list =
                EventDispatcher.getInstance().pobierzObiektyImplementujaceInterfejs(ICallListener.class);
        for (ICallListener listener : list) {
            listener.callStarted(callId);
        }
    }
}
