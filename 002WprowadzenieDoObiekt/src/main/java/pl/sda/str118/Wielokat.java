package pl.sda.str118;

public abstract class Wielokat extends Figura {
    @Override
    public double obliczObwod() {
        double[] boki = zwrocBoki();
        double obwod = 0;
        for (double bok: boki){
            obwod+=bok;
        }
        return obwod;
    }

    protected abstract double[] zwrocBoki();
}
