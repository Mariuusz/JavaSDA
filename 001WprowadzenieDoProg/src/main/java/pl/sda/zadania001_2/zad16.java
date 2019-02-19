package pl.sda.zadania001_2;

//      16. Napisać program, który sumuje cyfry w tekście podanym przez użytkownika.
//        Przykład:
//        "Ala ma 1 psa i 2 koty. Jola ma 10 rybek i 2 papugi."
//        Wynik:
//        6

import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Poadaj zdanie: ");
        String zdanie = scanner.nextLine();

        int wynik = 0;
        for (int i = 0; i < zdanie.length(); i++){
            char c = zdanie.charAt(i);
            if(c >= 48 && c <= 57){
                wynik += c - 48;
            }
        }
        System.out.println("Suma cyfr w tekście wynosi: " + wynik);

    }
}