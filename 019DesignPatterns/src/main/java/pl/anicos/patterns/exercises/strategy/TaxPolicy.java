package pl.anicos.patterns.exercises.strategy;

public interface TaxPolicy {
    double calculateFinalPrice(double netPrice);
}
