package pl.sda.str82_PetlaWhile.zad2;

//Napisz program, który oblicza silnię dla zadanej liczby przez użytkownika (do n=12) korzystając z pętli while

import java.util.Scanner;

public class PetlaWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę mniejszą od 13 dla której chcesz obliczyć silnię");
        int liczba = scanner.nextInt();
        int wynik = 1;
        int a =1;
        while (a<=liczba){
            wynik *=a;
            a++;
        }

        System.out.println("Silnie liczby "+liczba+" wynosi " + wynik);
    }
}
