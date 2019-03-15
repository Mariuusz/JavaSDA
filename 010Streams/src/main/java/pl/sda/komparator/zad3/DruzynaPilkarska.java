package pl.sda.komparator.zad3;

public class DruzynaPilkarska {
    private String nazwa;
    private double mieisceWRankingu;
    private double silaDruzyny;

    public DruzynaPilkarska(String nazwa, int mieisceWRankingu, double silaDruzyny) {
        this.nazwa = nazwa;
        this.mieisceWRankingu = mieisceWRankingu;
        this.silaDruzyny = silaDruzyny;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getMieisceWRankingu() {
        return mieisceWRankingu;
    }

    public double getSilaDruzyny() {
        return silaDruzyny;
    }

    @Override
    public String toString() {
        return "DruzynaPilkarska{" +
                "nazwa='" + nazwa + '\'' +
                ", mieisceWRankingu=" + mieisceWRankingu +
                ", silaDruzyny=" + silaDruzyny +
                '}';
    }
}
