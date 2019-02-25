package pl.sda.str118_Abstrakcja_Polimorfizm;

public class Prostokat extends Czworokat{

    protected double a;
    protected double b;

    public Prostokat(double a, double b) {
        super(a,b,a,b);
        this.a = a;
        this.b =b ;
    }

    @Override
    public double obliczPole() {
        return a*b;
    }
}
