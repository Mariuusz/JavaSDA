package pl.sda.zad1;

//Stwórz listę Integerów. Wykonaj zadania:
//        - dodaj do listy 5 elementów ze scannera
//        - dodaj do listy 5 elementów losowych
//        - wypisz elementy
//        Sprawdź działanie aplikacji.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();

        System.out.println("Write 5 numbers:");
        for (int i=0;i<5;i++){
            Integer number = new Scanner(System.in).nextInt();
            numbers.add(number);
        }
        for (int i=0;i<5;i++){
            numbers.add(new Random().nextInt());
        }
        System.out.println(numbers);
    }
}
