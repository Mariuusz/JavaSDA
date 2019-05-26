package pl.sda.decorator.zad2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IPizza pizza = PizzeriaFactory.createPineapplePizza();
        IPizza zBoczkiem = new CustomPizza(pizza, "BOCZEK");


        IPizza nowiutka = new SimplePizza();

        List<String> lista = Arrays.asList("Ciasto", "Ser");
//        List<String> kopia = new ArrayList<>();
//
//        Collections.copy(kopia, lista);

        System.out.println(zBoczkiem);
    }
}