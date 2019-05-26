package pl.anicos.patterns.exercises.strategy;

public class AndoraTaxPolicy implements TaxPolicy {
    @Override
    public double calculateFinalPrice(double netPrice) {
        return netPrice;
    }
}
