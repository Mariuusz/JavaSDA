package pl.sda.adapter.przyklad;

public final class PralkaAdapter extends Pralka implements ISwichable {
    @Override
    public void switch_on() {
        super.turn_on();
    }

    @Override
    public void switch_off() {
        super.turn_off();
    }
}