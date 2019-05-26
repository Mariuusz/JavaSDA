package pl.sda.eventDispatcher.zad3ZTM;

public abstract class AbstractRegistrable {
    public AbstractRegistrable() {
        EventDispatcher.getInstance().register(this);
    }
}