package pl.sda.str109;

//Metody statyczne -zadanie
//1.Utwórz program ‚Kalkulator’
//    1.Nadpisz punkt wejścia, tak aby wyświetlał następującą instrukcję po uruchomieniu:
//      „Podaj rodzaj działania : *,+,-,/”„Podaj pierwszą liczbę”„Podaj druga liczbę”„Otrzymany wynik {działanie} wynosi: {wynik}”
//    2.Użyj switcha do wybrania rodzaju metody
//    3.Użyj switcha do wydrukowania końcowego wyniku (np. ‚+’ ’dodawania’)
//      np. po wpisaniu przez użytkownika ‚+’, ‚2’, ‚3’ wyświetlony zostanie tekst:Wynik dodawania liczb 2 i 3 wynosi: 5

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Podaj rodzaj działania:");
        do {

            String rodzajDział = scanner.nextLine();
            System.out.println("Podaj pierwszą liczbę:");
            double pierwszLiczba = scanner.nextDouble();
            System.out.println("Podaj drugą liczbę:");
            double drugaLiczba = scanner.nextDouble();

            System.out.println("Wynik " + rodzajDziałania(rodzajDział) + " liczb " + pierwszLiczba
                    + " i " + drugaLiczba + " wynosi: " + działanie(rodzajDział,pierwszLiczba,drugaLiczba));
            System.out.println("Podaj rodzaj działania lub wciśnij 0 aby zakończyć");

        }while (scanner.nextInt() != 0);

    }

    private static double działanie(String rodzajDział, double pierwszLiczba, double drugaLiczba){
        switch (rodzajDział){
            case "+":
                return pierwszLiczba + drugaLiczba;
            case "-":
                return pierwszLiczba - drugaLiczba;
            case "*":
                return pierwszLiczba * drugaLiczba;
            case "/":
                return pierwszLiczba / drugaLiczba;
        }return 666;
    }

    private static String rodzajDziałania(String rodzajDział){
        String działanie;
        switch (rodzajDział){
            case "+":
                działanie = "dodawania";
                return działanie;
            case "-":
                działanie  = "odejmowania";
                return działanie;
            case "*":
                działanie = "mnożenia";
                return działanie;
            case "/":
                działanie = "dzielenia";
                return działanie;
        }return "Nieprawidłowy rodzaj działania";
    }
}
