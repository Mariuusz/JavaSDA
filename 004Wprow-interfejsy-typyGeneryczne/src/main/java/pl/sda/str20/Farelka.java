package pl.sda.str20;

public class Farelka implements Grzeje {

    private double tempPomieszczenia;

    public Farelka(double tempPomieszczenia) {
        this.tempPomieszczenia = tempPomieszczenia;
    }

    @Override
    public double pobierzTemp() {
        return this.tempPomieszczenia;
    }

    @Override
    public void ogrzej() {
        this.tempPomieszczenia += 2;
    }
}
