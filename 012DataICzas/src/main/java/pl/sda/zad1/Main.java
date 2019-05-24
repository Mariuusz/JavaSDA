package pl.sda.zad1;
//      1.Stwórz aplikację która w pętli przyjmuje polecenie:
//        - wpisanie ‘date’ wypisuje obecny LocalDate
//        - wpisanie ‘time’ wypisuje obecny LocalTime
//        - wpisanie ‘datetime’ wypisuje obecny LocalDateTime
//        (W wybranym przez Ciebie formacie)
//        Jeśli użytkownik wpisze 'quit' to zakoncz program.
//
//        Daty, podpowiedzi:
//        Sposób na czas (Java8):
//        LocalDateTime czasWjazd = LocalDateTime.now();
//        Timestamp tWjazd = Timestamp.valueOf(czasWjazd);
//
//        LocalDateTime czasWyjazd = LocalDateTime.now();
//        Timestamp tWyjazd = Timestamp.valueOf(czasWyjazd);
//
//        Long roznicaT = tWyjazd.getTime() - tWjazd.getTime();
//
//        Wypisywanie daty w odpowiednim formacie:
//        LocalDate data = LocalDate.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy / MM / dd"); // < - format
//        System.out.println(data.format(formatter));
//
//        Dostępne znaki dla DateTimeFormatter'a:
//        https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

//1.Napisz aplikację, która wyświetli datę sprzed 10 dni i datę za dziesięć dni.
//        Wskazówka: skorzystaj z metody plusDays() na obiekcie LocalDate.


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy : MM : dd");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("H:m : s");

        String polecenie = "d";
        while (!polecenie.equals("quit")){
            System.out.println("Podaj polecenie: (date/time/datetime/date+10dni/date-x lat)");
            polecenie = new Scanner(System.in).nextLine();
            switch (polecenie) {
                case "date":
                    System.out.println(LocalDate.now().format(formatter));
                    break;
                case "time":
                    System.out.println(LocalTime.now().format(formatter2));
                    break;
                case "datetime":
                    System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy   |   HH:mm")));
                    break;
                case "date+10dni":
                    System.out.println(LocalDate.now().plusDays(10));
                    break;
                case "date-x lat":
                    System.out.println("Podaj z przed ilu lat chcesz datę:");
                    int lata = new Scanner(System.in).nextInt();
                    System.out.println(LocalDate.now().minusYears(lata));
                case "quit":
                    break;
                default:
                    System.out.println("to nie polecenie!!!");
            }
        }
    }

}
