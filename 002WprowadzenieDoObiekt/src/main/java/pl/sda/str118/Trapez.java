package pl.sda.str118;

public class Trapez extends Czworokat{
    protected double h;
    protected double a;
    protected double b;
    protected double c;

    public Trapez(double a, double b, double h, double c) {
        super(a,b,c,h);
        this.a = a;
        this.b =b ;
        this.h =h ;
        this.c =c ;
    }

    @Override
    public double obliczPole() {
        return ((a+b)*h)/2;
    }
}
