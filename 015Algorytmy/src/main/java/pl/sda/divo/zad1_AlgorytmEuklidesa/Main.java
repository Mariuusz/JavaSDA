package pl.sda.divo.zad1_AlgorytmEuklidesa;
//Algorytm Euklidesa
//        Mając dane dwie liczby naturalne a i b znaleźć ich największy wspólny dzielnik.
//
//        1. Przedstaw opis słowny problemu
//        2. Przedstaw schemat blokowy
//        3. Zaimplementuj algorytm.
//
//        Rozwinięcie:
//        2. Pobierz dane od użytkownika.
//        3. Jeżeli użytkownik wpisze ujemną liczbę wyświetl błąd.
//        4. Pobieraj błędne dane dopóki użytkownik nie wpisze poprawnego wyniku.
//        5. Zrób z tego grę:
//        - Komputer losuje dwie duże liczby (10000 < n < 50000)
//        - Użytkownik wpisuje NWD
//        - Komputer oblicza NWD, a następnie wyświetla czy użytkownik zgadł liczbę czy nie
//
//        Pobieramy pierwszą liczbę i trzymamy ją jako tymczasową.
//        dopóki nie uda się podzielić bez reszty, to dziel z resztą
//        Jeżeli uda się podzielić liczbę bez resztą przejdź do kolejnej liczby
//
//        mamy liczbę 5 i trzymamy ją w zmiennej tymczasowej
//        dopóki nie uda się podzielić bez reszty, to dziel z resztą
//        Jeżeli uda się podzielić liczbę bez resztą przejdź do kolejnej liczby
//
//        Sprawdzamy kiedy dzielnik jest równy liczbie
//        Jeżeli jest równy liczbie sprawdzamy czy pierwszą liczbę podzielić przez dzielnik.
//***************************************************************************************************************

// 1. Przedstaw opis słowny problemu
// 1a. Dane są dwie liczby a i b;
// 1b. Jeśli a jest równe b, to NWD jest równe a,
// 1c. W przeciwnym wypadku, jeżeli a jest większe od b, to zmień a na równe a - b, a jeżeli a jest mniejsze od b to zmień b na b - a;
// 1d. Zacznij od początku.

import java.util.Random;
import java.util.Scanner;

public class Main {
    private int getNWD_1(int a, int b) {
        int NWD = -1;
        for (; a > 0 && b > 0;) {
            if (a == b) {
                NWD = a;
                break;
            } else if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return NWD;
    }
//        2. Pobierz dane od użytkownika.
    private int getIntFromUser(String valueName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pobierz " + valueName + ": ");
        return scanner.nextInt();
    }

    private int getNWD_2() {
        int a = getIntFromUser("a");
        int b = getIntFromUser("b");

        return getNWD_1(a, b);
    }
//        3. Jeżeli użytkownik wpisze ujemną liczbę wyświetl błąd.
    private int getNWD_3() {
        int a = getIntFromUser("a");
        int b = getIntFromUser("b");

        if (a < 0 || b < 0) {
            System.out.println("Ujemna liczba! Błąd!");
            return -1;
        }

        return getNWD_1(a, b);
    }
//        4. Pobieraj błędne dane dopóki użytkownik nie wpisze poprawnego wyniku.
    private int getNWD_4() {
        for (; ;) {
            int wynik = getNWD_3();
            if (wynik > -1) {
                return wynik;
            }
        }
    }
//        5. Zrób z tego grę:
    private void getNWD_5() {
        Random rand = new Random();

        int MIN = 10;
        int MAX = 100;

        int a = (Math.abs(rand.nextInt()) % MAX) + MIN, b = (Math.abs(rand.nextInt()) % MAX) + MIN;
        System.out.println("A: " + a + ", B: " + b);

        int nwd;
        do {
            nwd = getIntFromUser("NWD");

            if (nwd == getNWD_1(a, b)) {
                System.out.println("Wygrałeś!");
            } else {
                System.out.println("Przegrałeś. Spróbuj jeszcze raz!");
            }
        } while(!(nwd == getNWD_1(a, b)));

    }

    public static void main(String[] args) {
        Main m = new Main();

        int a = 51;
        int b = 11;

//        System.out.println("=============== NWD 1 ===============");
//        System.out.println("NWD 1: " + m.getNWD_1(a, b));
//        System.out.println("=============== NWD 2 ===============");
//        System.out.println("NWD 2: " + m.getNWD_2());
//        System.out.println("=============== NWD 3 ===============");
//        System.out.println("NWD 3: " + m.getNWD_3());
//        System.out.println("=============== NWD 4 ===============");
//        System.out.println("NWD 4: " + m.getNWD_4());
        System.out.println("=============== NWD 5 ===============");
        System.out.println("Podaj NWD wylosowanych liczb");
        m.getNWD_5();
    }
}