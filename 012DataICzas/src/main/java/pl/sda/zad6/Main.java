package pl.sda.zad6;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        Scanner scanner = new Scanner(System.in);
        LocalDate dataUr = null;
        do {
            System.out.println("Podaj datę urodzenia (yyyy/MM/dd):");
            String dataUrodzenia = scanner.next();

            try {
                dataUr = LocalDate.parse(dataUrodzenia, formatter);
            } catch (DateTimeParseException pe) {
                System.out.println("Niepoprawny format daty");
                // w przypadku błędu powtórz pętlę
                continue;
            }
        } while (dataUr == null);

        LocalDate dataSmierci = dataUr.plusYears(100);

        System.out.println("Podaj płeć [k, m]:");
        String plec = scanner.next();
        if (plec.toLowerCase().equals("m")) {
            dataSmierci = dataSmierci.minusYears(10);
        }

        System.out.println("Czy palisz papierosy [t/n] ?");
        String papierosy = scanner.next();
        if (papierosy.toLowerCase().equals("t")) {
            dataSmierci = dataSmierci.minusYears(9).minusMonths(3);
        }

        System.out.println("Czy zyjesz w stresie [t/n] ?");
        String stres = scanner.next();
        if (stres.toLowerCase().equals("t")) {
            Random generator = new Random();
            int prawdopodobienstwo = generator.nextInt(100);

            if (prawdopodobienstwo < 10) {
//                dataSmierci = dataSmierci.minusYears(40);
                dataSmierci = dataUr.plusYears(60);
            }
        }

        String sformatowanaDataSmierci = dataSmierci.format(formatter);
        System.out.println("Umrzesz : " + sformatowanaDataSmierci);
    }
}
