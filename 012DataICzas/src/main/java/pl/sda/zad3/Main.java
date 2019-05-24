package pl.sda.zad3;

//  3.Napisz aplikację, która wyświetli "różnicę" dwóch PODANYCH PRZEZ UŻYTKOWNIKA dat w formacie: "years: , months: , days: "
//         Wskazówka: skorzystaj z DateTimeFormatter oraz metody:
//         LocalDateTime.parse(ciag_znakow, formatter).
//
//         Do wypisania dni/lat/miesięcy z Period, wykorzystaj jego gettery.

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
        LocalDate teraz = LocalDate.now();
        LocalDate wydarzenie = LocalDate.of(1989,03,03);



        Period period = Period.between(wydarzenie,teraz);
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("y-M-d H:m");

        String dzien = String.valueOf(period.getDays());
        String miesiac = String.valueOf(period.getMonths());
        String rok = String.valueOf(period.getYears());
        String roznica = rok+"-"+miesiac+"-"+dzien+" 12:30";
//        System.out.println(roznica);
        System.out.println(LocalDateTime.parse(roznica, formatter));
    }
}

//    String str = "1986-04-08 12:30";
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//    LocalDateTime dateTime = LocalDateTime.parse(str, formatter);