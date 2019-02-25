package pl.sda.str118;

public class Okreg extends Figura {
    protected static final double PI = 3.14;

    protected double promien;

    public Okreg(double promien) {
        this.promien = promien;
    }

    @Override
    public double obliczObwod() {
        return 2 * PI * promien;
    }

    @Override
    public double obliczPole() {
        return PI*promien*promien;
    }
}
