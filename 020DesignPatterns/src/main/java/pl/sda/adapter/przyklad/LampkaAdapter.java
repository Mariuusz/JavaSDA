package pl.sda.adapter.przyklad;

public class LampkaAdapter implements ISwichable {
    private Lampka lampka;

    public LampkaAdapter(Lampka lampka) {
        this.lampka = lampka;
    }

    @Override
    public void switch_on() {
        lampka.switchOn();
    }

    @Override
    public void switch_off() {
        lampka.switchOff();
    }
}