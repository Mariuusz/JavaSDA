package pl.sda.divo.zad12;

//Utwórz klasę student mającą pola:
//class Student:
//        imię
//        nazwisko
//        numerIndeksu
//
//        Nadpisz metody:
//        equals() - która porówna studentów po numerze indeksu, nazwisku i imieniu.
//        hashCode() - która zwróci numer indeksu
//
//        Rozwinięcie:
//        2. Przygotuj dwóch studentów z różnymi danymi i porównaj ich przez equals oraz sprawdź ich hashCode
//        3. Przygotuj dwóch studentów którzy mają różne imiona i nazwiska, ale ten sam numer indeksu i porównaj ich przez equals oraz sprawdź ich hashCode
//        4.  Przygotuj program, który pobierze od użytkownika studentów i zapisze ich do listy.
//        Następnie poprosi użytkownika o podanie numeru indexu i wpisywanie ilości godzin, które student opuścił.
//        Program wyszuka na liście studenta, następnie doda go do mapy jako klucz i doda opuszczone godziny.
//        Na końcu program wypisze sumę godzin opuszczonych przez studenta, wraz z imieniem i nazwiskiem.

//5. Otwórz dwie mapy, do których dodasz studentów jako klucze z dowolnymi wartościami.
//        Część tych studentów niech powtarza się w obu mapach, część powinna być unikalna dla każdej mapy.
//        Dodaj (poprzez metodę putAll) wszystkie wartości z drugiej mapy do pierwszej. Wylistuj pierwszą mapę.
//6. Otwórz dwie mapy, do których dodasz studentów jako klucze z dowolnymi wartościami.
//    Część tych studentów niech powtarza się w obu mapach, część powinna być unikalna dla każdej mapy.
//    Dodaj (poprzez metodę putIfAbsent) wszystkie wartości z drugiej mapy do pierwszej. Wylistuj pierwszą mapę.

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ala", "Kowalska", 11);
        Student student2 = new Student("Ala", "Nowacka", 11);

        Map<Student, Integer> studentIntegerMap = new HashMap<>();
        studentIntegerMap.put(student1, 10);
        studentIntegerMap.put(student2, 20);

        for (Map.Entry<Student, Integer> paraStrudentGodzina : studentIntegerMap.entrySet()) {
            System.out.println(
                    "Imie: " + paraStrudentGodzina.getKey().getImie() +
                            ", nazwisko: " + paraStrudentGodzina.getKey().getNazwisko() +
                            ", numer indeksu: " + paraStrudentGodzina.getKey().getNrIndeksu() +
                            ": " + paraStrudentGodzina.getValue());
        }

        for (Student s : studentIntegerMap.keySet()) {
            System.out.println(s.getImie());
        }

        for (Integer i : studentIntegerMap.values()) {
            System.out.println(i);
        }
    }
}
