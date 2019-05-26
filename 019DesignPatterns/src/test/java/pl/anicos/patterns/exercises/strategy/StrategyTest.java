package pl.anicos.patterns.exercises.strategy;

import org.junit.Test;

public class StrategyTest {

    @Test
    public void runStrategy() {
        Cart cart = new Cart();
        cart.addLineItem(new Item("Milk", 3.0));
        cart.addLineItem(new Item("Water", 2.0));

        double polandPrice = cart.calculateFinalPrice(TaxPolicyFactory.getTaxPolicy("Poland"));
        System.out.println("Final price in poland id " + polandPrice);

        double germanPrice = cart.calculateFinalPrice(TaxPolicyFactory.getTaxPolicy("Germany"));
        System.out.println("Final price in Germany id " + germanPrice);

        double andoreaPrice = cart.calculateFinalPrice(TaxPolicyFactory.getTaxPolicy("Andora"));
        System.out.println("Final price in Andora id " + andoreaPrice);

    }
}