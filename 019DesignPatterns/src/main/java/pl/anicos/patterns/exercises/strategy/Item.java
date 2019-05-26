package pl.anicos.patterns.exercises.strategy;

public class Item {
    private String description;
    private double netPrice;

    public Item(String description, double netPrice) {
        this.description = description;
        this.netPrice = netPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getNetPrice() {
        return netPrice;
    }

}
