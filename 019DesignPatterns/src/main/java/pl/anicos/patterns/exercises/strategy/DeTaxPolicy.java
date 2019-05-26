package pl.anicos.patterns.exercises.strategy;

public class DeTaxPolicy implements TaxPolicy {
    @Override
    public double calculateFinalPrice(double netPrice) {
        return netPrice * 1.19;
    }
}
