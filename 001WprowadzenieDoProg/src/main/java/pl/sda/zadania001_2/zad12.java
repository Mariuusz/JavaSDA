package pl.sda.zadania001_2;

//      12. Napisać program, który sprawdza, czy podana liczba całkowita N jest większa od
//        zera, a następnie sprawdzająca czy liczba jest liczbą pierwszą.

import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Podaj liczbę:");
        int liczba = scanner.nextInt();
        int liczbaDzielników = 0;
        if (liczba>0){
            for (int i = 2; i<liczba; i++){
                if (liczba % i == 0){
                    liczbaDzielników++;
                }
            }
        }
        if (liczbaDzielników>0){
            System.out.println("Podana liczba nie jest liczbą pierwszą i posiada " + (liczbaDzielników+2) + " dzielników.");
        } else System.out.println("Podana liczba jest liczbą pierwszą.");

    }
}
