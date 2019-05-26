package pl.sda.eventDispatcher.zad1Android.models;

import pl.sda.eventDispatcher.eventDispatcher.EventDispatcher;

public abstract class Application {
    public Application() {
        EventDispatcher.getInstance().register(this);
    }
}
