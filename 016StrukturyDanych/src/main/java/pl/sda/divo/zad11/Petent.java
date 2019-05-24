package pl.sda.divo.zad11;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
class Petent {
    private final String imię;
    private final String nazwisko;
    private final int pesel;

    @Override
    public String toString() {
        return imię +
                ", " + nazwisko +
                ", " + pesel;
    }
}