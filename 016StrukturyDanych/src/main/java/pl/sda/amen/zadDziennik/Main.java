package pl.sda.amen.zadDziennik;

//Stworzymy klasę DziennikSzkolny, który wewnątrz posiada informacje dotyczące uczniów oraz ich oceny.
// Stworzymy dwie MAPY, w których (w obu przypadkach) kluczem będzie numer indeksu studenta.
//
//        Stworzymy na początku klasę DaneStudenta, która jako pola posiada:
//        imie, nazwisko, numer indeksu (String)
//
//        Stwórzmy enuma, który będzie reprezentował wszystkie przedmioty z których student może posiadać oceny.
//        Nazwijmy enuma: Przedmiot i dodajmy do niego kilka opcji:
//        MATEMATYKA, FIZYKA, INFORMATYKA, J_ANGIELSKI, J_POLSKI
//
//        Stwórzmy kolejną klasę, która reprezentuje zbiór ocen studenta. Niech klasa nazywa się OcenyStudenta
//        i posiada (jako pole):
//        - mapę ocen studenta, w której kluczem do mapy jest Przedmiot, a wartością jest Lista ocen (double).
//
//        Stwórzmy klasę DziennikSzkolny która posiada dwa pola:
//        - mapę studentów (w której kluczem jest numer indeksu, a wartością jest instancja klasy DaneStudenta)
//        - mapę ocen studentów (w której kluczem jest numer indeksu, a wartością jest instancja klasy OcenyStudenta)
//
//        Stwórz w klasie DziennikSzkolny metody:
//        - dodajStudenta(String nrIndeksu, String imie, String nazwisko):void
//        - dodajOcenęDlaStudenta(String nrIndeksu, Przedmiot przedmiot, Double ocena):void
//        - wypiszSredniaStudenta(String nrIndeksu):void
//        - wypiszOcenyStudenta(String nrIndeksu):void
//        - zaproponuj inną architekturę aplikacji (czy musimy informację o ocenach studentów trzymać
//          w oddzielnych mapach/kolekcjach?)

public class Main {
    public static void main(String[] args) {
        DziennikSzkolny dziennikSzkolny = new DziennikSzkolny();

        dziennikSzkolny.dodajStudenta("1234", "Paweł", "Gaweł");
        dziennikSzkolny.dodajOcenęDlaStudenta("1234", Przedmiot.MATEMATYKA, 3.0);
        dziennikSzkolny.dodajOcenęDlaStudenta("1234", Przedmiot.MATEMATYKA, 3.1);
        dziennikSzkolny.dodajOcenęDlaStudenta("1234", Przedmiot.MATEMATYKA, 3.2);
        dziennikSzkolny.dodajOcenęDlaStudenta("1234", Przedmiot.MATEMATYKA, 3.3);
        dziennikSzkolny.dodajOcenęDlaStudenta("1234", Przedmiot.MATEMATYKA, 3.4);
        dziennikSzkolny.dodajOcenęDlaStudenta("1234", Przedmiot.INFORMATYKA, 3.5);
        dziennikSzkolny.dodajOcenęDlaStudenta("1234", Przedmiot.INFORMATYKA, 3.2);
        dziennikSzkolny.dodajOcenęDlaStudenta("1234", Przedmiot.INFORMATYKA, 3.3);
        dziennikSzkolny.dodajOcenęDlaStudenta("1234", Przedmiot.INFORMATYKA, 3.4);
        dziennikSzkolny.dodajOcenęDlaStudenta("1234", Przedmiot.INFORMATYKA, 3.5);


        dziennikSzkolny.wypiszOceny("1234");
        dziennikSzkolny.wypiszSrednia("1234");
    }
}