package pl.sda.strategy.zad1;

public class Samochód {
    public int predkosc, iloscPaliwa, poziomNaladowaniaAku;
    private INaped silnik;

    public Samochód(int iloscPaliwa, int poziomNaladowaniaAku, INaped silnik) {
        this.iloscPaliwa = iloscPaliwa;
        this.poziomNaladowaniaAku = poziomNaladowaniaAku;
        this.silnik = silnik;
    }

    private double getPrzyspieszenie() {
        return silnik.getMocSilnika() * 0.1;
    }

    public void przyspiesz() {
        predkosc += getPrzyspieszenie();
        iloscPaliwa -= silnik.getPoborPaliwa();
        poziomNaladowaniaAku -= silnik.getPoborPraduSilnika();
    }

    public void zwolnij() {
        if (predkosc >= 10) {
            predkosc -= 10;
        } else {// predkosc <10
            predkosc = 0;
        }

        poziomNaladowaniaAku += silnik.getPoborPraduSilnika() * 0.5;
    }

    public int getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(int predkosc) {
        this.predkosc = predkosc;
    }

    public int getIloscPaliwa() {
        return iloscPaliwa;
    }

    public void setIloscPaliwa(int iloscPaliwa) {
        this.iloscPaliwa = iloscPaliwa;
    }

    public int getPoziomNaladowaniaAku() {
        return poziomNaladowaniaAku;
    }

    public void setPoziomNaladowaniaAku(int poziomNaladowaniaAku) {
        this.poziomNaladowaniaAku = poziomNaladowaniaAku;
    }

    public INaped getSilnik() {
        return silnik;
    }

    public void setSilnik(INaped silnik) {
        this.silnik = silnik;
    }

    @Override
    public String toString() {
        return "Samochód{" +
                "predkosc=" + predkosc +
                ", iloscPaliwa=" + iloscPaliwa +
                ", poziomNaladowaniaAku=" + poziomNaladowaniaAku +
                '}';
    }
}