package pl.sda.observerObservable.zad5;

//Stworzymy imitację aplikacji webowej.
//        Zakładamy istnienie systemu dużej korporacji. Zaprojektuj aplikację która posiada klasę Database, która służy do zapisywania i odczytywania danych z pliku. Stwórz enuma DatabaseName który posiada trzy wartości DB_USERS(NIE PRZECHOWUJE SAMYCH UŻYTKOWNIKÓW, TYLKO KOLEKCJĘ JEGO ZGŁOSZEŃ SERWISOWYCH), DB_ORDER, DB_REQUESTS. Klasa ma posiadać funkcję dopisywania rekordów do bazy danych oraz ich czytania (musi mieć metody, które przyjmują w/w enuma i na podstawie tego, jaki enum został przekazany, mają czytać/zapisywać inny plik).
//
//        - Stwórz klasę Request - zlecenie które podaje użytkownik. Są różne typy requestów (można je podzielić przez dziedziczenie lub enuma).
//
//        - Stwórz klasę Order - to zamówienie. Na pewien typ Requestu (ktoś zgłasza do naszej firmy request żeby kupić sprzęt) wytwarza się order i jest logowany do bazy danych.
//
//        - Stwórz dodatkowo klasę Marketing, która rozpatruje requesty, ale tylko te, które są typu zamówieniowego (ktoś chce kupić sprzęt). Po otrzymaniu takiego Requestu marketing tworzy order oraz umieszcza go w bazie danych (+ wypisuje na ekran).
//
//        - Stwórz klasę ServiceDepartment która rozpatruje requesty, ale tylko te, które są typu serwisowego. Ludzie którzy zgłaszają że coś nie działa. Ta klasa po rozpatrzeniu robi sout danego requestu oraz dopisuje do bazy danych do db_users(NIE PRZECHOWUJE SAMYCH UŻYTKOWNIKÓW, TYLKO KOLEKCJĘ JEGO ZGŁOSZEŃ SERWISOWYCH) wpis o tym jaki użytkownik dokonał zgłoszenia serwisowego. Jeden użytkownik może mieć więcej niż jedno zgłoszenie serwisowe.
//
//        - Stwórz klasę FinanceDepartment - który rozpatruje wszystkie zgłoszenia i po otrzymaniu zgłoszeń robi i utrzymuje statystykę. Posiada również metodę getStatistics który zwraca obiekt klasy statistics z wyliczeniem typów zgłoszeń jakie zostały przyjęte.
//
//        - Stwórz klasę WebService który jest Observable. On przyjmuje zgłoszenia (ze skanera wywołujemy jego metody zgłaszania requestów). Po otrzymaniu zgłoszenia rozsyła je modelem Observer-Observable do klas Marketing, ServiceDepartment, FinanceDepartment. Instancje tych klas tworzą się w konstruktorze i w  tym miejscu inicjalizuje się dodanie observer/observable.

//import com.sun.org.apache.regexp.internal.RE;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: parse request
        Scanner sc = new Scanner(System.in);
        WebService service = new WebService();

        String line = null;
        do {
            line = sc.nextLine();
            Optional<Request> newRequest = RequestParser.parseRequest(line);
            newRequest.ifPresent((req)->{
                System.out.println(newRequest);
                service.handleRequest(newRequest.get());
            });
//            if (newRequest.isPresent()) {
//                System.out.println(newRequest);
//                service.handleRequest(newRequest.get());
//            } else {
//                System.out.println("Couldn't parse that request.");
//            }
        } while (!line.equals("quit"));
    }
}