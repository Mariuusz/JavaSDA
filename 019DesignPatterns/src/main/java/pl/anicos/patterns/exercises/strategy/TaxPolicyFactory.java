package pl.anicos.patterns.exercises.strategy;

public class TaxPolicyFactory {

    public static TaxPolicy getTaxPolicy(String country) {
        switch (country) {
            case "Poland":
                return new PlTaxPolicy();
            case "Germany":
                return new DeTaxPolicy();
            case "Andora":
                return new AndoraTaxPolicy();
        }
        throw new IllegalArgumentException();
    }
}