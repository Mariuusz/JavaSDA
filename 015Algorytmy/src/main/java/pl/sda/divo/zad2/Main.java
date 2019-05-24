package pl.sda.divo.zad2;

//Algorytm ma wczytywać z klawiatury wartości dwóch liczb oraz wyświetlać w kolejnych liniach następujące wyniki:
//        1. Wykorzystując TYLKO dodawanie pomnożyć pierwszą liczbę przez drugą.
//        2. Wykorzystując TYLKO dodawanie spotęgować pierwszą liczbę przez drugą.
//
//        1. Przedstaw opis słowny problemu
//        2. Przedstaw schemat blokowy
//        3. Zaimplementuj algorytm.
//
//        do zmiennej tymczasowej przechowuj wynik mnozenia
//        dopóki counter mniejszy od drugiej liczby
//        dodaj pierwsza liczbe do sumy
//
//        podprogram multiply (a, b)
//        c := 0
//        dopóki i < b
//        c += a
//
//                zwróć c
//***************************************************************************************************************
// 1.  Wykorzystując TYLKO dodawanie pomnożyć pierwszą liczbę przez drugą.
// 1a. Pobierz od użytkownika wartość zmiennej a
// 1b. Pobierz od użytkownika wartość zmiennej b
// 1c. Dopóki nie osiągnęliśmy wartości a dodawaj b i przypisz do zmiennej suma
// 1d. Wyświetl sumę

// 2.  Wykorzystując TYLKO dodawanie spotęgować pierwszą liczbę przez drugą.
// 2a. Pobierz od użytkownika wartość zmiennej a
// 2b. Pobierz od użytkownika wartość zmiennej b
// 2c. Przypisz do zmiennej pomocniczej liczbę b
// 2d. Dopóki nie osiągnęliśmy wartości b dodawaj zmienną pomocniczą
// 2e. Dopóki nie osiągnęliśmy wartości a wykonuj krok c oraz d
// 2f. Wyświetl zmienną pomocniczą.

import java.util.Scanner;

public class Main {
    private int multiply(int a, int b) {
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum += b;
        }

        return sum;
    }
    private int getIntFromUser(String valueName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pobierz " + valueName + ": ");
        return scanner.nextInt();
    }
    private int multiplyNumbersFromUser() {
        int a = getIntFromUser("a");
        int b = getIntFromUser("b");

        return multiply(a, b);
    }
    private int powerFromUser() {
        int a = getIntFromUser("a");
        int b = getIntFromUser("b");

        int power = a;
        for (int i = 0; i < b - 1; i++) {
            power = multiply(a, power);
        }

        return power;
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println("--- Multiply");
        System.out.println("Wynik: " + m.multiplyNumbersFromUser());
        System.out.println("--- Power");
        System.out.println("Wynik: " + m.powerFromUser());
    }
}