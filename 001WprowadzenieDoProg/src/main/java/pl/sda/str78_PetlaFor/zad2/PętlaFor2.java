package pl.sda.str78_PetlaFor.zad2;

import java.util.Scanner;

//Napisz program wyznaczający potęgę liczby n i m –obie zadane przez użytkownika
// i drukujący w czytelny sposób wynik na ekranie konsoli

public class PętlaFor2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę");
        int liczba = scanner.nextInt();
        System.out.println("Podaj potęgę");
        int potęga = scanner.nextInt();

        int wynik = 1;
        for (int i=0;i<potęga;i++ ){
            wynik *= liczba;
        }

        System.out.println("Liczba " + liczba + " podniesiona do potęgi " + potęga + " równa się " + wynik);
    }
}
