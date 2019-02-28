package pl.sda.zad1;

public class Pies {
    private String imie;
    private int wiek;
    private String kolorSiersci;

    public Pies(String imie, int wiek, String kolorSiersci) {
        this.imie = imie;
        this.wiek = wiek;
        this.kolorSiersci = kolorSiersci;
    }

    @Override
    public String toString() {
        return "Pies{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", kolorSiersci='" + kolorSiersci + '\'' +
                '}';
    }
}
