package pl.sda.zadania001_1;

//    13. Napisz aplikację która pobiera od użytkownika N a nastepnie:
//        a. losuje N liczb całkowitych (dowolny zakres) i wypisuje je na ekran
//        b. losuje N liczb zmiennoprzecinkowych i wypisuje je na ekran
//        c. losuje N razy wartość boolean i wypisuje je na ekran
//        d. pobiera kolejne dwa parametry poczatekZakresu i koniecZakresu i losuje N
//        liczb całkowitych z tego zakresu, a następnie wypisuje je na ekran
//        e. pobiera kolejne dwa parametry poczatekZakresu i koniecZakresu i losuje N
//        liczb zmiennoprzecinkowych z tego zakresu, a następnie wypisuje je na ekran

import java.util.Random;
import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Podaj liczbę całkowitą:");
        int liczba = scanner.nextInt();

        for (int i=0; i<liczba; i++){
        System.out.print(random.nextInt() + " ");
        }
        System.out.println();
        for (int i=0; i<liczba; i++){
            System.out.print(random.nextFloat() + " ");
        }
        System.out.println();
        for (int i=0; i<liczba; i++){
            System.out.print(random.nextBoolean() + " ");
        }
        System.out.println("Podaj początek zakresu");
        int początek = scanner.nextInt();
        System.out.println("Podaj koniec zakresu");
        int koniec = scanner.nextInt();
        for (int i=0; i<liczba; i++){
            System.out.print(random.nextInt(koniec-początek) + początek + " ");
        }

        System.out.println("Podaj początek zakresu");
        int pocz = scanner.nextInt();

        for (int i=0; i<liczba; i++){
            System.out.print((random.nextFloat() + pocz) + " ");
        }


    }
}
