package pl.sda.zad3;

public class KontoBankowe {
    private Double bilans;

    public KontoBankowe() {
        this.bilans = 0.0;
    }

    public void dodajDoKonta(double kwota) {
        bilans = bilans + kwota;
    }

    public void odejmijZKonta(double kwota) {
        bilans = bilans - kwota;
    }

    public Double getBilans() {
        return bilans;
    }
}