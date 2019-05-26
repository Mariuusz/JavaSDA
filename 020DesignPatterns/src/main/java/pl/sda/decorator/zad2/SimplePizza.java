package pl.sda.decorator.zad2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class SimplePizza implements IPizza {
    private List<String> ingredients = new ArrayList<>(Arrays.asList("DOUGH", "SAUCE", "CHEESE"));
    private int price = 15;

    public SimplePizza(int price){
        this.price = price;
    }

    public SimplePizza(List<String> ingredients) {
        this.ingredients.addAll(ingredients);
    }

    public SimplePizza(String... ingredients){
//        this.ingredients.addAll(Arrays.asList(ingredients));
        this(Arrays.asList(ingredients));
    }

    public SimplePizza(int price, String... ingredients) {
        this(price, Arrays.asList(ingredients));
    }

    public SimplePizza(int price, List<String> ingredients) {
        this(ingredients);
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "SimplePizza{" +
                "ingredients=" + ingredients +
                ", price=" + price +
                '}';
    }
}