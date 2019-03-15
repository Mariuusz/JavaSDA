package pl.sda.komparator.zad1;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    public Osoba() {
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public Osoba(String imie, String nazwisko, int wiek) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
}
