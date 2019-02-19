package pl.sda.str78_PetlaFor.zad1;

import java.util.Scanner;

//Napisz program, który przyjmuje od użytkownika dzielnik oraz liczbę,
// a następnie drukuje na ekranie wszystkie liczby mniejsze
// od zadanej liczby podzielne przez zadany dzielnik
public class PętlaFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dzielnik");
        int dzielnik = scanner.nextInt();

        System.out.println("Podaj liczbę");
        int liczba = scanner.nextInt();

        for (int i=0; i<liczba; i++){
            if (i % dzielnik == 0){
            System.out.println(i);
            }

        }

    }
}
