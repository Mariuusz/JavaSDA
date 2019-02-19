package pl.sda.str107_Metody;

//      Napisz program, który będzie posiadał następujące metody statyczne:
//        1.drukujParzystoscLiczby
//              1.Przyjmuje pojedynczy parametr w postaci liczby całkowitej
//              2.Zwraca nic
//              3.Drukuje na ekranie wynik „liczba jest parzysta” gdy liczba jest parzysta i „liczba jest nieparzysta” dla nieparzystej liczby
//        2.czyLiczbaJestParzysta
//              1.Przyjmuje pojedynczy parametr w postaci liczby całkowitej
//              2.Zwraca typ logiczny w postaci wyniku obliczenia parzystości liczby
//              3.* Zastanów się w jaki sposób mógłbyś ułatwić sobieżycie i zminimalizować liczbę zduplikowanego kodu

import java.util.Scanner;

public class Metody {
    public static void main(String[] args) {

        System.out.println("Podaj liczbę (wprowadzenie znaku innego niż liczba całkowita zakończy działanie programu: ");
        Scanner scanner = new Scanner(System.in);
        int liczba;
        do {
            if(scanner.hasNextInt()){
                liczba = scanner.nextInt();
                drukujParzystoscLiczb(liczba);
            } else {
                System.out.println("Podany znak nie jest liczbą całkowitą!");
            }
        }while(scanner.hasNextInt());
        System.out.println("Koniec!");
    }

    private static boolean czyLiczbaJestParzysta(int liczba) {

        return liczba % 2 == 0;
    }

    private static void drukujParzystoscLiczb(int liczba) {
        if (czyLiczbaJestParzysta(liczba)) {
            System.out.println("Liczba " + liczba + " jest parzysta");

        } else System.out.println("Liczba " + liczba + " jest nieparzysta");

    }
}