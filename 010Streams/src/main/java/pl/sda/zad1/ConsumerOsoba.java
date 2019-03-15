package pl.sda.zad1;

import java.util.function.Consumer;

public class ConsumerOsoba implements Consumer<Osoba> {
    @Override
    public void accept(Osoba osoba) {
        System.out.println(osoba);
    }
}