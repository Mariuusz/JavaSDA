package pl.sda.str88;

//Program sumuje liczby wprowadzane przez użytkownika i wyświetla sumę wszystkich wprowadzonych dotychczas liczb.
// Aby przerwać wprowadzanie liczb użytkownikwpisuje:
//        1.0
//        2.**Dowolną nie-liczbę

import java.util.Scanner;

public class SumaLiczb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int liczba, liczba2 = 0;

        do {
            System.out.println("Podaj liczbe:");
            if (scanner.hasNextInt()) {
                liczba = scanner.nextInt();
                liczba2 += liczba;
                System.out.println(liczba2);
            }
        }while(scanner.hasNextInt());
    }
}