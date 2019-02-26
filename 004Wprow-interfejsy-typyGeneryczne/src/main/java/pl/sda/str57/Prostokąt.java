package pl.sda.str57;


public class Prostokąt extends Figura {
    private int bokA;
    private int bokB;

    public Prostokąt(int bokA, int bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    double obliczPole() {
        return this.bokA*this.bokB;
    }


    @Override
    public String toString() {
        return "Prostokąt{" +
                "bokA=" + bokA +
                ", bokB=" + bokB +
                '}';
    }
}
