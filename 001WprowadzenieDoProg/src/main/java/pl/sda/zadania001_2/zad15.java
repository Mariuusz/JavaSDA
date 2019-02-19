package pl.sda.zadania001_2;

//      15. Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie
//        sprawdza, czy podany ciąg jest palindromem.

import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wyraz:");
        String wyraz = scanner.nextLine();

        char[] tablica = wyraz.toLowerCase().toCharArray();

        int palindrom = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] == tablica[tablica.length - 1 - i])
                palindrom++;
        }
        if (palindrom == tablica.length) {
            System.out.println("Wyraz jest palindromem.");
        } else System.out.println("Wyraz nie jest palindromem.");


    }
}
