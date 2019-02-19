package pl.sda.zadania001_2;

//      9. Gra w ”Za dużo, za mało”. Komputer losuje liczbę z zakresu 1 . . . 100, a gracz
//        (użytkownik) ma za zadanie odgadnąć, co to za liczba poprzez podawanie kolejnych
//        wartości. Jeżeli podana wartość jest:
//        a. większa – wyświetlany jest komunikat „Podałeś za dużą wartość”,
//        b. mniejsza – wyświetlany jest komunikat „Podałeś za małą wartość”,
//        c. identyczna z wylosowaną – wyświetlany jest komunikat „Gratulacje” i gra się
//        kończy.

import java.util.Random;
import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

    int liczba = random.nextInt(100) + 1;
    int wytypuj = 0;
    int licznik = 0;
        do {
                System.out.println("Masz " + (5-licznik) + " próby.");
                System.out.println("Podaj liczbę od 1 do 100:");
                wytypuj = scanner.nextInt();
                if (wytypuj < 1 || wytypuj > 100) {
        System.out.println("Zły zakres, podaj liczbę od 1 do 100:");
        } else if (wytypuj > liczba) {
        System.out.println("Podana liczba jest większa od zgadywanej.");
        } else if (wytypuj < liczba) {
        System.out.println("Podana liczba jest mniejsza od zgadywanej.");
        }
        licznik++;
        } while (liczba != wytypuj && licznik != 5);
        if (liczba == wytypuj) {
        System.out.println("Gratulacje, szukana liczba to " + liczba);
        } else System.out.println("Porażka, szukana liczba to " + liczba);

    }
}
