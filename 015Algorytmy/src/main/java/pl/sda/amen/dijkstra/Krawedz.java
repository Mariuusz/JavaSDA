package pl.sda.amen.dijkstra;

public class Krawedz {
    private int identyfikatorWierzcholkaA;
    private int identyfikatorWierzcholkaB;
    private double waga;

    public Krawedz(int identyfikatorWierzcholkaA, int identyfikatorWierzcholkaB, double waga) {
        this.identyfikatorWierzcholkaA = identyfikatorWierzcholkaA;
        this.identyfikatorWierzcholkaB = identyfikatorWierzcholkaB;
        this.waga = waga;
    }

    public int getIdentyfikatorWierzcholkaA() {
        return identyfikatorWierzcholkaA;
    }

    public void setIdentyfikatorWierzcholkaA(int identyfikatorWierzcholkaA) {
        this.identyfikatorWierzcholkaA = identyfikatorWierzcholkaA;
    }

    public int getIdentyfikatorWierzcholkaB() {
        return identyfikatorWierzcholkaB;
    }

    public void setIdentyfikatorWierzcholkaB(int identyfikatorWierzcholkaB) {
        this.identyfikatorWierzcholkaB = identyfikatorWierzcholkaB;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }
}