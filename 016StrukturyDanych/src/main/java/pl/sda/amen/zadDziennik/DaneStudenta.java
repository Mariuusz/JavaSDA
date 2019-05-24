package pl.sda.amen.zadDziennik;


public class DaneStudenta {
    private String imie;
    private String nazwisko;
    private String index;

    public DaneStudenta() {
    }

    public DaneStudenta(String imie, String nazwisko, String index) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.index = index;
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

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "DaneStudenta{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", index='" + index + '\'' +
                '}';
    }
}