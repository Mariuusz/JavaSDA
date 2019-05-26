package pl.sda.adapter.przyklad;

public class CzajnikAdapter implements ISwichable {
    private Czajnik czajnik;

    public CzajnikAdapter(Czajnik czajnik) {
        this.czajnik = czajnik;
    }

    @Override
    public void switch_on() {
        czajnik.włącz();
    }

    @Override
    public void switch_off() {
        czajnik.wyłącz();
    }
}