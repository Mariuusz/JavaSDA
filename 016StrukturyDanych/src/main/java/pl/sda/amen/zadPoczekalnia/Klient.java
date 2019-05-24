package pl.sda.amen.zadPoczekalnia;


import java.time.LocalTime;

public class Klient implements Comparable<Klient> {
    protected String imie;
    protected LocalTime czasPrzybycia;
    protected boolean czyPriorytet;

    public Klient(String imie, LocalTime czasPrzybycia, boolean czyPriorytet) {
        this.imie = imie;
        this.czasPrzybycia = czasPrzybycia;
        this.czyPriorytet = czyPriorytet;
    }

    @Override
    public int compareTo(Klient o) {
        if (czyPriorytet && !o.czyPriorytet) {
            return -1;
        } else if (!czyPriorytet && o.czyPriorytet) {
            return 1;
        }

        if (czasPrzybycia.isBefore(o.czasPrzybycia)) {
            return -1;
        } else if (czasPrzybycia.isAfter(o.czasPrzybycia)) {
            return 1;
        }

        return 0;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public LocalTime getCzasPrzybycia() {
        return czasPrzybycia;
    }

    public void setCzasPrzybycia(LocalTime czasPrzybycia) {
        this.czasPrzybycia = czasPrzybycia;
    }

    public boolean isCzyPriorytet() {
        return czyPriorytet;
    }

    public void setCzyPriorytet(boolean czyPriorytet) {
        this.czyPriorytet = czyPriorytet;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "imie='" + imie + '\'' +
                ", czasPrzybycia=" + czasPrzybycia +
                ", czyPriorytet=" + czyPriorytet +
                '}';
    }
}