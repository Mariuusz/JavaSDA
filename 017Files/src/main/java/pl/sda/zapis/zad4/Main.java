package pl.sda.zapis.zad4;

// Napisz program, a w tym programie wczytaj jedną linię ze skanera od użytkownika.
// Poproś użytkownika o 'adres pliku'. Po wpisaniu zweryfikuj czy wybrany plik/katalog istnieje,
// czy jest plikiem/katalogiem, jaki jest jego: rozmiar, czas ostatniej modyfikacji i czy mamy prawa
// do odczytu/zapisu do tego pliku/katalogu.


import java.io.File;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nazwaPliku = scanner.nextLine();

        File plik = new File(nazwaPliku);
        if (plik.exists()) {
            System.out.println("Plik istnieje");
            if (plik.isDirectory()) {
                System.out.println("Katalog");
            } else if (plik.isFile()) {
                System.out.println("Plik");
            }

//            Timestamp timestamp = new Timestamp(plik.lastModified());
//            LocalDateTime localDateTime = LocalDateTime.from(timestamp.toInstant());
//            System.out.println("Last modified: " + localDateTime);

            System.out.println("Rozmiar: " + plik.length());

            System.out.println("Zapis: " +plik.canWrite());
            System.out.println("Odczyt: " +plik.canRead());
            System.out.println("Wykonanie: " +plik.canExecute());
        } else {
            System.out.println("Plik nie istnieje");
        }
    }
}