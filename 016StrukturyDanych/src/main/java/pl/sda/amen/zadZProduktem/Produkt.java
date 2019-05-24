package pl.sda.amen.zadZProduktem;


public class Produkt {
    private String nazwa;
    private double cenaNetto;
    private PodatekProduktu typPodatku;

    public Produkt(String nazwa, double cenaNetto, PodatekProduktu typPodatku) {
        this.nazwa = nazwa;
        this.cenaNetto = cenaNetto;
        this.typPodatku = typPodatku;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCenaNetto() {
        return cenaNetto;
    }

    public void setCenaNetto(double cenaNetto) {
        this.cenaNetto = cenaNetto;
    }

    public PodatekProduktu getTypPodatku() {
        return typPodatku;
    }

    public void setTypPodatku(PodatekProduktu typPodatku) {
        this.typPodatku = typPodatku;
    }

    //podajCeneBrutto():double
    public double podajCeneBrutto() {
        return cenaNetto + (cenaNetto * typPodatku.getProcentPodatku()) / 100.0;
    }
}