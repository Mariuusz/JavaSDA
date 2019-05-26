package pl.sda.decorator.zad2;

import java.util.List;

public abstract class AbstractPizza {
    int price;
    List<String> ingr;

    public AbstractPizza(int price, List<String> ingr) {
        this.price = price;
        this.ingr = ingr;
    }
}
