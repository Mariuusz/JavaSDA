package pl.sda.zestawSprawdzajacy;

//        Zestaw sprawdzający :
//        1. Zadeklaruj zmienną tekstową 'text' (przyjmij ją z wejścia od użytkownika), a następnie:
//        a) sprawdź czy w tekście występuje słowo “ania”
//        b) sprawdź czy tekst zaczyna się od słowa “ania”
//        c) sprawdź czy tekst kończy się słowem “ania”
//        d) sprawdź czy tekst równa się słowu “ania”
//        e) sprawdź czy tekst (niezależnie od wielkości liter) zawiera słowo “ania”
//        f) zwróć indeks (numer znaku/litery) pierwszego wystąpienia słowa “ania” w tekście
//        Wypisuj odpowiedni komunikat w poszczególnych podpunktach powyższego zadania.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj text: ");
        String text = scanner.nextLine();

        System.out.println("a)" + text.contains("ania"));
        System.out.println("b)" + text.startsWith("ania"));
        System.out.println("c)" + text.endsWith("ania"));
        System.out.println("d)" + text.equals("ania"));
        System.out.println("e)" + text.toLowerCase().contains("ania"));
        System.out.println("f)" + text.indexOf("ania"));

    }
}
