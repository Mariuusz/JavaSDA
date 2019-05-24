package pl.sda.divo.zad4;

//Napisz program zamieniający liczby naturalne podawane z klawiatury w postaci dziesiętnej
// na liczby zapisane w systemie rzymskim. Warunkiem zakończenia programu powinno by podanie liczby 0

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Wpisz liczbę w postaci dziesiętnej: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println("Liczba w formacie rzymskim: " + NumberConverter.toRoman(number));
    }
}
