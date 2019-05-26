package pl.sda.decorator.zad2;

import java.util.*;

public class CustomPizza implements IPizza {
    private IPizza pizza;
    private List<String> additionalIngredients = new ArrayList<>();

    public CustomPizza(IPizza pizza, String... additionalIngredients) {
        this.pizza = pizza;
        this.additionalIngredients.addAll(Arrays.asList(additionalIngredients));
    }

//    public CustomPizza addIngredient(String ingredient) {
//        additionalIngredients.add(ingredient);
//        return this;
//    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + additionalIngredients.size() * 3;
    }

    @Override
    public List<String> getIngredients() {
        List<String> newList = new ArrayList<>(additionalIngredients);
        newList.addAll(pizza.getIngredients());
        return newList;
//        return Stream.concat(
//                pizza.getIngredients().stream(), additionalIngredients.stream())
//                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "CustomPizza{" +
                "pizza=" + pizza +
                ", additionalIngredients=" + additionalIngredients +
                '}';
    }
}
