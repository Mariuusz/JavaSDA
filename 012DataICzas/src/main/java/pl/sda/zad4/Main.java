package pl.sda.zad4;

//  4.Napisz aplikację, która obliczy twój wiek.

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        System.out.println("Podaj datę:");
        String dataPierwsza = scanner.next();
        LocalDate dateStart = LocalDate.parse(dataPierwsza, formatter);

        System.out.println("Podaj datę:");
        String dataDruga = scanner.next();
        LocalDate dateStop = LocalDate.parse(dataDruga, formatter);

        Period okres = Period.between(dateStart, dateStop);

        System.out.println("Lat: " + okres.getYears() + " Miesiecy: " + okres.getMonths() + " Dni: " + okres.getDays());
    }
}