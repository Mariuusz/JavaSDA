package pl.sda.observerObservable.zad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NewsStation stacjaWiadomosci = new NewsStation();

        stacjaWiadomosci.addObserver(new Watcher("Marian", 5));
        stacjaWiadomosci.addObserver(new Watcher("Ania", 3));
        stacjaWiadomosci.addObserver(new Watcher("Franek", 2));
        stacjaWiadomosci.addObserver(new Watcher("Michau", 8));
        stacjaWiadomosci.addObserver(new Watcher("Waldek", 9));
        stacjaWiadomosci.addObserver(new Watcher("Paweł", 3));

        boolean praca = true;
        while (praca) {
            String linia = scanner.nextLine().trim().toLowerCase();
            String[] podzielonaLinia = linia.split(" ", 2);

            int waga = Integer.parseInt(podzielonaLinia[0]);
            String tresc = podzielonaLinia[1];
            stacjaWiadomosci.powiadomOWiadomosci(waga, tresc);
        }
    }
}