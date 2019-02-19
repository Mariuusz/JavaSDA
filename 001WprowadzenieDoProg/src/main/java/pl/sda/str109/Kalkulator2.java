package pl.sda.str109;

import java.util.Scanner;

public class Kalkulator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String działanie;
        int a, b, wynik;
        do {
            System.out.println("Wybierz rodzaj działana :*,+,-,/");
            System.out.println("Aby zakończyć wpisz 'piątek'");
            działanie = scanner.nextLine();
            if (działanie.equalsIgnoreCase("piątek")){
                break;
            }
            System.out.println("Podaj pierwszą cyfrę:");
            a = scanner.nextInt();
            System.out.println("Podaj drugą cyfrę:");
            b = scanner.nextInt();
            scanner.nextLine();                         // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


            System.out.println("Wynik " + pobierzNazweDzialania(działanie) + " liczb " + a + " i " + b + " wynosi: " + oblicz(a, b, działanie));
        }while (true);
    }

    private static String pobierzNazweDzialania(String działanie) {
        switch (działanie) {
            case "*":
                return "mnożenia ";
            case "+":
                return "dodawania ";
            case "-":
                return "odejmowania ";
            case "/":
                return "dzielenia ";
            default:
                return "null";
        }
    }

    private static int oblicz(int a, int b, String działanie) {
        switch (działanie) {
            case "*":
                return a * b;
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                return a / b;
            default:
                return a;

        }
    }
}