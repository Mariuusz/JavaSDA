package pl.sda.divo.zad3;

//Algorytm ma obliczać długość boku kwadratu o polu P.
//
//        1. Przedstaw opis słowny problemu
//        2. Przedstaw schemat blokowy
//        3. Zaimplementuj algorytm.
//
//        Rozwinięcie:
//        2. Napisz funkcję, która obliczy bok trójkąta równobocznego na podstawie pola.
//        3. Napisz funkcję, która obliczy promień koła.
//        4. W `main` użyj każdej funkcji.
//        5. W `main` pobierz od użytkownika jaką funkcję ma wywołać oraz pole.
//           Następnie wywołaj odpowiednią funkcję i wyświetl odpowiednią informację (bok lub promień)

import java.util.Scanner;

public class Main {
    private double getSquareSide(int field) {
        return Math.sqrt(field);
    }
    private double getTriangleSide(int field) {
        return Math.sqrt(4 * field / Math.sqrt(3));
    }
    private double getRadius(int field) {
        return Math.sqrt(field / Math.PI);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Main m = new Main();

        System.out.print("Podaj pole: ");
        int field = s.nextInt();

        System.out.println("Bok kwadratu wynosi: " + m.getSquareSide(field));
        System.out.println("Bok trójkąta wynosi: " + m.getTriangleSide(field));
        System.out.println("Promień koła wynosi: " + m.getRadius(field));
    }
}