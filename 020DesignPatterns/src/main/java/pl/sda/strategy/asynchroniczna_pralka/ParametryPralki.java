package pl.sda.strategy.asynchroniczna_pralka;

public class ParametryPralki {
    private int predkoscWirnika;
    private int poziomWody;
    private String nazwaEtapu;
    private long czasPracyEtapu;

    public ParametryPralki(int predkoscWirnika, int poziomWody, String nazwaEtapu, long czasPracyEtapu) {
        this.predkoscWirnika = predkoscWirnika;
        this.poziomWody = poziomWody;
        this.nazwaEtapu = nazwaEtapu;
        this.czasPracyEtapu = czasPracyEtapu;
    }

    public int getPredkoscWirnika() {
        return predkoscWirnika;
    }

    public void setPredkoscWirnika(int predkoscWirnika) {
        this.predkoscWirnika = predkoscWirnika;
    }

    public int getPoziomWody() {
        return poziomWody;
    }

    public void setPoziomWody(int poziomWody) {
        this.poziomWody = poziomWody;
    }

    public String getNazwaEtapu() {
        return nazwaEtapu;
    }

    public void setNazwaEtapu(String nazwaEtapu) {
        this.nazwaEtapu = nazwaEtapu;
    }

    @Override
    public String toString() {
        return "ParametryPralki{" +
                "predkoscWirnika=" + predkoscWirnika +
                ", poziomWody=" + poziomWody +
                ", nazwaEtapu='" + nazwaEtapu + '\'' +
                '}';
    }

    public long getCzasPracyEtapu() {
        return czasPracyEtapu;
    }

    public void setCzasPracyEtapu(long czasPracyEtapu) {
        this.czasPracyEtapu = czasPracyEtapu;
    }
}