package pl.sda.zad1;

import java.util.function.Function;

public class OsobaKonwerter implements Function<Osoba, Pracownik>{
    @Override
    public Pracownik apply(Osoba osoba) {
        Pracownik pracownik = new Pracownik(osoba.getImie(), 2300.0);
        return pracownik;
    }
}