package pl.sda.str82_PetlaWhile.zad1;

//Napisz program, który oblicza sumę wszystkich liczb poprzedzających zadaną przez użytkownika liczbę
// –dla liczby 100 będzie to suma liczb od 0 do 100 czyli 5050

import java.util.Scanner;

public class PętlaWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");

        int liczba = scanner.nextInt();
        int wynik = 0;
        int liczby = 0;

        while (liczby<=liczba){
            wynik += liczby;
            ++liczby;
        }

        System.out.println("Suma liczb do zadanej liczby " + liczba + " równa się " + wynik);
    }
}
