package pl.sda.zad1;

import java.util.function.Predicate;

public class FilterAgeOsoba implements Predicate<Osoba> {
    @Override
    public boolean test(Osoba osoba) {
        return osoba.getWiek() > 18;
    }
}