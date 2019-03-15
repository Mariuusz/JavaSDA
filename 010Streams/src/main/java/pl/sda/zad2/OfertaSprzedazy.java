package pl.sda.zad2;

public class OfertaSprzedazy {
    private Komputer komputer;
    private double rabatProcentowo;
    private double ostatecznaCena;

    public OfertaSprzedazy(Komputer komputer, double rabatProcentowo) {
        this.komputer = komputer;
        this.rabatProcentowo = rabatProcentowo;
        this.ostatecznaCena = komputer.getCena() * (((100.0 - rabatProcentowo)) / 100.0);
    }

    public Komputer getKomputer() {
        return komputer;
    }

    public void setKomputer(Komputer komputer) {
        this.komputer = komputer;
    }

    public double getRabatProcentowo() {
        return rabatProcentowo;
    }

    public void setRabatProcentowo(double rabatProcentowo) {
        this.rabatProcentowo = rabatProcentowo;
    }

    public double getOstatecznaCena() {
        return ostatecznaCena;
    }

    public void setOstatecznaCena(double ostatecznaCena) {
        this.ostatecznaCena = ostatecznaCena;
    }

    @Override
    public String toString() {
        return "OfertaSprzedazy{" +
                "komputer=" + komputer +
                ", rabatProcentowo=" + rabatProcentowo +
                ", ostatecznaCena=" + ostatecznaCena +
                '}';
    }
}