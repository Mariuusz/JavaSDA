package pl.sda.divo.zad3;

import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

interface SideCalculator {
    double calculate();

}

@AllArgsConstructor
class SquareSide implements SideCalculator {
    private final double field;

    @Override
    public double calculate() {
        return Math.sqrt(field);
    }
}

@AllArgsConstructor
class TriangleSide implements SideCalculator {
    private final double field;

    @Override
    public double calculate() {
        return Math.sqrt(4 * field / Math.sqrt(3));
    }
}

@AllArgsConstructor
class CircleRadius implements SideCalculator {
    private final double field;

    @Override
    public double calculate() {
        return Math.sqrt(field / Math.PI);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Main m = new Main();

        System.out.print("Podaj pole: ");
        int field = s.nextInt();

        Map<String, SideCalculator> calculators = new HashMap<>();
        calculators.put("Bok kwadratu wynosi", new SquareSide(field));
        calculators.put("Bok trójkąta wynosi", new TriangleSide(field));
        calculators.put("Promień koła wynosi", new CircleRadius(field));

        calculators.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}