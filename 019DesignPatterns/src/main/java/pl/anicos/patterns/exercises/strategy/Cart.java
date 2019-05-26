package pl.anicos.patterns.exercises.strategy;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> lineItems = new ArrayList<>();

    public void addLineItem(Item item) {
        lineItems.add(item);
    }

    public void removeLineItem(Item item) {
        lineItems.remove(item);
    }

    public double getCostInCents() {
        return lineItems.stream().mapToDouble(item -> item.getNetPrice()).sum();
    }

    public double calculateFinalPrice(TaxPolicy method) {
        return method.calculateFinalPrice(getCostInCents());
    }
}
