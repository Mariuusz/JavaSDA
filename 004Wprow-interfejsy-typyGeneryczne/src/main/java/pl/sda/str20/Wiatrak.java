package pl.sda.str20;

public class Wiatrak implements Chlodzi {
    private double tempPomieszczenia;

    public Wiatrak(double tempPomieszczenia) {
        this.tempPomieszczenia = tempPomieszczenia;
    }

    @Override
    public double pobierzTemp() {
        return this.tempPomieszczenia;
    }

    @Override
    public void schlodz() {
        this.tempPomieszczenia -= 1;
    }
}
