package pl.sda.str118_Abstrakcja_Polimorfizm;

public abstract class Czworokat extends Wielokat {

    private double[] boki;

    public Czworokat(double a, double b, double c, double d){
        boki = new double[]{a,b,c,d};
    }

    @Override
    protected double[] zwrocBoki() {
        return boki;
    }
}
