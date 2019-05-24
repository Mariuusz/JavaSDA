package pl.sda.divo.zad11;

//Zadanie polega na obsłużeniu kolejki w urzędzie.
//        Użytkownik przekarze programowi ilu użytkowników przyszło do urzedu (ilu stworzyć losowych użytkowników).
//        Następnie program wylosuje ile użytkowników opuściło urząd (usunie z kolejki losowych użytkowników)
//        Wszystko będzie powtarzane dopóki kolejka nie będzie pusta.
//
//        Przygotuj klasę:
//class Petent:
//        imię
//        nazwisko
//        pesel
//
//        Utwórz nową listę o nazwie "kolejka".
//        Wykorzystamy trzy metody z Listy:
//        add() - dodaje użytkownika na koniec kolejki
//        get(i) - pobiera użytkownika o indeksie `i`
//        remove(0) - usuwa użytkownika z początku kolejki.
//        Poproś użytkownika o podanie danych kolejnych petentów stających w kolejce.
//        Dodaj petenta do "kolejka"
//        Zapytaj się użytkownika czy chce kontynuować wprowadzanie danych.
//        Jeżeli nie przechodzimy dalej.
//
//        W pętli sprawdź czy kolejka jest pusta. Jeżeli tak wyświetl komunikat: "Kolejka pusta" i zakończ pętlę.
//        Jeżeli nie, poproś użytkownika o liczbę petentów do dodania.
//        Następnie dodaj do kolejki tylu petentów ilu wpisał użytkownik.
//        Wylosuj liczbę i usuń z początku kolejki tylu petentów ile wylosowano w liczbie.
//        Wyświetl całą kolejkę w formacie:
//        imię, nazwisko, pesel
//        Powtórz pętlę.
//
//        Rozwinięcie:
//        2. przygotuj funkcję (wygenerujLosoweZnaki), która stworzy losowy napis (imię, nazwisko)
//        Aby to osiągnąć napisz funkcję, która przetrzymuje wszystkie znaki jakie mogą być w imieniu lub nazwisku: "abcdefghijklmnopqrstuvwxyz"
//        W pętli, dopóki nie osiągniesz odpowiedniej liczby znaków:
//        wylosuj liczbę (za pomocą random)
//        pobierz literę z w/w łańcucha na podstawie wylosowanej liczby (charAt)
//        połącz wszystkie litery razem i je zwróć.
//
//        Utwórz kolejną funkcję (losowyPetent), która stworzy nowy obiekt klasy petent z losowymi danymi - wylosuje imię, nazwisko oraz pesel.
//        Zamiast wpisywać dane przez użytkownika, użyj swoich funkcji i wylosuj dane dla petentów.
//        3. Zakładając, że osoby starsze są przepuszczane bez kolejki, przy dodawaniu osób do kolejki sprawdź
//        (na podstawie pesel) czy ich wiek jest większy niż 50 lat. Jeżeli tak wypisz: "poza kolejką".

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Utwórz nową listę o nazwie "kolejka".
//                Wykorzystamy trzy metody z Listy:
//        add() - dodaje użytkownika na koniec kolejki
//        get(i) - pobiera użytkownika o indeksie `i`
//        remove(0) - usuwa użytkownika z początku kolejki.
        LinkedList<Petent> kolejka = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        Petent p = Petent.builder().build();

        while (true) {
//            Dodaj petenta do "kolejka"
            kolejka.add(pobierzPetentaOdUżytkownika());

//            Zapytaj się użytkownika czy chce kontynuować wprowadzanie danych.
            System.out.println("Czy wprowadzić kolejnego[y/n]: ");

//            Jeżeli nie przechodzimy dalej.
            if (in.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }

//        W pętli sprawdź czy kolejka jest pusta. Jeżeli tak wyświetl komunikat: "Kolejka pusta" i zakończ pętlę.
        while(!kolejka.isEmpty()) {
//            Jeżeli nie, poproś użytkownika o liczbę petentów do dodania.
            System.out.print("Ilu dodać petentów: ");
            int iluPetentow = in.nextInt();
//            Następnie dodaj do kolejki tylu petentów ilu wpisał użytkownik.
//            while(iluPetentow-- > 0) {
//                kolejka.add(pobierzPetentaOdUżytkownika());
//            }

//            Zamiast wpisywać dane przez użytkownika, użyj swoich funkcji i wylosuj dane dla petentów.
            while(iluPetentow-- > 0) {
                System.out.println(iluPetentow);
                kolejka.add(losowyPetent());
            }
//            Wylosuj liczbę i usuń z początku kolejki tylu petentów ile wylosowano w liczbie.
            int iluUsunac = rand.nextInt(5);
            while (iluUsunac-- > 0 && !kolejka.isEmpty()) {
                kolejka.poll();
            }

            System.out.println(kolejka);
        }
        System.out.println("Kolejka pusta");
    }

    private static Petent pobierzPetentaOdUżytkownika() {
        //            Poproś użytkownika o podanie danych kolejnych petentów stających w kolejce.
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj imię petenta: ");
        String imie = in.nextLine();
        System.out.print("Podaj nazwisko petenta: ");
        String nazwisko = in.nextLine();
        System.out.print("Podaj pesel petenta: ");
        int pesel = in.nextInt();
        in.nextLine();

//            Dodaj petenta do "kolejka"
        return Petent.builder()
                .imię(imie)
                .nazwisko(nazwisko)
                .pesel(pesel)
                .build();
    }

    //    przygotuj funkcję (wygenerujLosoweZnaki), która stworzy losowy napis (imię, nazwisko)
//    Aby to osiągnąć napisz funkcję, która przetrzymuje wszystkie znaki jakie mogą być w imieniu lub nazwisku: "abcdefghijklmnopqrstuvwxyz"
//    W pętli, dopóki nie osiągniesz odpowiedniej liczby znaków:
//    wylosuj liczbę (za pomocą random)
//    pobierz literę z w/w łańcucha na podstawie wylosowanej liczby (charAt)
//    połącz wszystkie litery razem i je zwróć.
    private static String wygenerujLosoweZnaki(int length) {
        Random rand = new Random();
        String napis = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(napis.charAt(rand.nextInt(26)));
        }

        return sb.toString();
    }

    //    Utwórz kolejną funkcję (losowyPetent), która stworzy nowy obiekt klasy petent z losowymi danymi - wylosuje imię, nazwisko oraz pesel.
    private static Petent losowyPetent() {
        return Petent.builder()
                .imię(wygenerujLosoweZnaki(15))
                .nazwisko(wygenerujLosoweZnaki(15))
                .pesel(new Random().nextInt(9999) + 5000)
                .build();
    }
}