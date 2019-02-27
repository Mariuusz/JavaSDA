package pl.sda.zad2;

public class SumEquation implements ICalculable {
    private double liczba1;
    private double liczba2;

    public SumEquation(double liczba1, double liczba2) {
        this.liczba1 = liczba1;
        this.liczba2 = liczba2;
    }
    @Override
    public double Calculate() {
        return liczba1+liczba2;
    }
}
