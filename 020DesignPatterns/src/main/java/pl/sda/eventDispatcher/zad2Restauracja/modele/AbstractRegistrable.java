package pl.sda.eventDispatcher.zad2Restauracja.modele;

import pl.sda.eventDispatcher.eventDispatcher.EventDispatcher;

public abstract class AbstractRegistrable {
    public AbstractRegistrable() {
        EventDispatcher.getInstance().register(this);
    }
}