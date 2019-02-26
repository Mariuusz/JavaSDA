package pl.sda.str20;

public class Klimatyzacja implements Chlodzi,Grzeje{

    private double tempPomieszczenia;

    public Klimatyzacja(double tempPomieszczenia) {
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

    @Override
    public void schlodz() {
        this.tempPomieszczenia -= 2;
    }

    @Override
    public void wyswietlTemp() {
        System.out.println("Aktualna temperatura w pomieszczeniu wynosi:" + pobierzTemp() + " stopni Celsjusza");

    }

}