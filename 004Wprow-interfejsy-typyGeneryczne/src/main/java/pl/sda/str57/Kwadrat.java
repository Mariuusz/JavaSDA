package pl.sda.str57;


public class Kwadrat extends Figura{
    private int bok;

    public Kwadrat(int bok) {
        this.bok = bok;
    }

    @Override
    double obliczPole() {
        return this.bok*this.bok;
    }

    @Override
    public String toString() {
        return "Kwadrat{" +
                "bok=" + bok +
                '}';
    }
}
