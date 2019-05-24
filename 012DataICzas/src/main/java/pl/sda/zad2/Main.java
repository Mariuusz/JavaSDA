package pl.sda.zad2;

//      2.Napisz aplikację, która wyświetli "różnicę" dwóch dat w formacie: "years: , months: , days: "
//        Wskazówka: skorzystaj z klasy Period:
//        Period period = Period.between(data_start, data_stop);

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate teraz = LocalDate.now();
        LocalDate grunwald = LocalDate.of(1410, 7, 15);

        Period okres = Period.between(grunwald, teraz);

        System.out.println(okres.getYears());

//        LocalTime time = LocalTime.now();
//        Duration czasTrwania = Duration.between(time, LocalTime.now());
    }
}