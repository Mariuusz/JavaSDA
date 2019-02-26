package pl.sda.str38_TypyGeneryczne;

public class Samochod {
            private Marka marka;
            private String model;
            private String kolor;

    public Samochod(Marka marka, String model, String kolor) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
    }

    public void zmieńKolor(String kolor){
        this.kolor = kolor;
    }


    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", kolor='" + kolor + '\'' +
                '}';
    }
}
