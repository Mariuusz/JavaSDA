package pl.sda.zapis.zad2;

//Napisz aplikację w której:
//        - wczytaj od użytkownika jedną linię tekstu
//        - po wczytaniu linii otwórz plik o nazwie 'output_2.txt'
//        - zapisz do pliku linię pobraną od użytkownika
//        - zamknij plik
//
//        stara treść:
//        Napisz aplikację która otwiera plik 'output_2.txt', następnie czyta jedną linię tekstu od użytkownika i wpisuje tą linię do pliku. Po tej czynności plik ma się zamknąć, a następnie program ma się zakończyć.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String linia = scanner.nextLine();
//        File plik = new File("output_2.txt");
        PrintWriter zapis = new PrintWriter("output_2.txt");
        zapis.println(linia);
        zapis.close();
    }
}
