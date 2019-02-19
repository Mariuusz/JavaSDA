package pl.sda.zadania001_2;

//      6. Napisać program, który wczytuje od użytkownika liczbę całkowitą dodatnią n, a
//        następnie wyświetla na ekranie wszystkie potęgi liczby 2 nie większe, niż podana
//        liczba. Przykładowo, dla liczby 71 program powinien wyświetlić:
//        1 2 4 8 16 32 64

import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int n = scanner.nextInt();

        for (int i = 0; Math.pow(2, i) > n; i++) {
            System.out.print(Math.pow(2, i) + " ");
        }
//        int potęga = 1;
//        System.out.print(" " + potęga);
//        for (int b = 0; potęga * 2 < n; b++) {
//            potęga *= 2;
//            System.out.print(" " + potęga);
//
//        }
    }
}
