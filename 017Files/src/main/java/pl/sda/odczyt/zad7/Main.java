package pl.sda.odczyt.zad7;

//Stwórz aplikację która pyta użytkownika o ścieżkę do pliku i  (drugi raz zapytaj użytkownika o)
//wyszukiwane słowo. Następnie sprawdź czy podany plik istnieje, a jeśli istnieje to zlicz
//wystąpienia podanego słowa w pliku.

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ścieżkę pliku:");
        String sciezka = scanner.nextLine();

        File plik = new File(sciezka);
        if (plik.exists()) {
            System.out.println("Plik istnieje, podaj szukane słowo:");
        } else {
            System.out.println("Plik nie istnieje");
        }

        String slowo = scanner.nextLine();
        try {
            BufferedReader czytaj = new BufferedReader(new FileReader(sciezka));
            int licznik = 0;
            String linia;
            while ((linia = czytaj.readLine()) != null) {

                String[] slowa = linia.split(" ");
                for (String s:slowa){
                    if (s.equals(slowo)){
                        licznik++;
                    }
                }

            }
            System.out.println("Słowo " + slowo + " wystąpiło w pliku: " + licznik + " razy.");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
