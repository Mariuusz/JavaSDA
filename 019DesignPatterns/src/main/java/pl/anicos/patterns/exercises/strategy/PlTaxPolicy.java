package pl.anicos.patterns.exercises.strategy;

public class PlTaxPolicy implements TaxPolicy {
    @Override
    public double calculateFinalPrice(double netPrice) {
        return netPrice * 1.23;
    }
}
