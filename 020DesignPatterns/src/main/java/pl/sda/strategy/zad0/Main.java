package pl.sda.strategy.zad0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Printer drukarka = new Printer();

        Scanner scanner = new Scanner(System.in);
        boolean isWorking = true;

        while (isWorking) {
            String linia = scanner.nextLine();
            String[] kolumny = linia.split(" ", 2);

            if (kolumny[0].equalsIgnoreCase("zmien")) {
                if (kolumny[1].equalsIgnoreCase("inverter")) {
                    drukarka.setFormatterCzcionki(new FormatterInverter());
                } else if (kolumny[1].equalsIgnoreCase("splitter")) {
                    drukarka.setFormatterCzcionki(new FormatterSplitter());
                } else if (kolumny[1].equalsIgnoreCase("upper")) {
                    drukarka.setFormatterCzcionki(new FormatterUpper());
                } else if (kolumny[1].equalsIgnoreCase("lower")) {
                    drukarka.setFormatterCzcionki(new FormatterLower());
                } else if (kolumny[1].equalsIgnoreCase("trim")) {
                    drukarka.setFormatterCzcionki(new FormatterTrim());
                }
            } else if (kolumny[0].equalsIgnoreCase("formatuj")) {
                String wynik = drukarka.formatuj(kolumny[1]);
                System.out.println(wynik);
            } else {
                System.out.println("Zła komenda");
            }
        }
    }
}
