package pl.sda.observerObservable.zad1;

public class Wiadomosc {
    private int waga;
    private String tresc;

    public Wiadomosc(int waga, String tresc) {
        this.waga = waga;
        this.tresc = tresc;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }
}