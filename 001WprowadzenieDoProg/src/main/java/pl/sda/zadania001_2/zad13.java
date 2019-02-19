package pl.sda.zadania001_2;

//      12. Napisać program, który sprawdza, czy podana liczba całkowita N jest większa od
//        zera, a następnie sprawdzająca czy liczba jest liczbą pierwszą.

import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");

        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++){
            System.out.println(i + " x " + number + " = " + i * number);
        }
    }
}
