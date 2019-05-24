package pl.sda.amen.dijkstra;


import java.util.ArrayList;
import java.util.List;

public class Wierzcholek {
    private int identyfikator;
    private String nazwa;
    private Double dystans;

    private String trasa = "";

    // i-ty sasiad ma i-tą krawędź
    private List<Integer> sasiedzi = new ArrayList<>();
    private List<Krawedz> krawedzie = new ArrayList<>();

    public Wierzcholek(int identyfikator, String nazwa) {
        this.identyfikator = identyfikator;
        this.nazwa = nazwa;
        this.dystans = Double.POSITIVE_INFINITY;
    }

    public void dodajSasiada(int idSasiada, int waga) {
        sasiedzi.add(idSasiada);
        krawedzie.add(new Krawedz(identyfikator, idSasiada, waga));
    }

    public int getIdentyfikator() {
        return identyfikator;
    }

    public void setIdentyfikator(int identyfikator) {
        this.identyfikator = identyfikator;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Double getDystans() {
        return dystans;
    }

    public void setDystans(Double dystans) {
        this.dystans = dystans;
    }

    public List<Integer> getSasiedzi() {
        return sasiedzi;
    }

    public void setSasiedzi(List<Integer> sasiedzi) {
        this.sasiedzi = sasiedzi;
    }

    public List<Krawedz> getKrawedzie() {
        return krawedzie;
    }

    public void setKrawedzie(List<Krawedz> krawedzie) {
        this.krawedzie = krawedzie;
    }

    public String getTrasa() {
        return trasa;
    }

    public void setTrasa(String trasa) {
        this.trasa = trasa;
    }
}
