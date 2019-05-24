package pl.sda.amen.zadDziennik;


import java.util.HashMap;
import java.util.Map;

public class DziennikSzkolny {
    private Map<String, DaneStudenta> mapaDanych = new HashMap<>();
    private Map<String, OcenyStudenta> mapaOcen = new HashMap<>();

    public DziennikSzkolny() {
        Integer wartosc = 4;
    }

    public void dodajStudenta(String nrIndexu, String imie, String nazwisko) {
        DaneStudenta daneStudenta = new DaneStudenta(imie, nazwisko, nrIndexu);

        if (mapaDanych.containsKey(nrIndexu)) {
            System.out.println("Uwaga! Nadpisuję dane studenta!");
        }
        mapaDanych.put(nrIndexu, daneStudenta);
    }

    public void dodajOcenęDlaStudenta(String nrIndexu, Przedmiot przedmiot, Double ocena) {
        OcenyStudenta ocenyStudenta = null;
        if (mapaOcen.containsKey(nrIndexu)) {
            // to znaczy że w mapie ocen są już oceny
            ocenyStudenta = mapaOcen.get(nrIndexu);
        } else {
            // oznacza to że w mapie nie ma pod podanym kluczem żadnej oceny
            ocenyStudenta = new OcenyStudenta();
        }
        ocenyStudenta.dodajOcenę(przedmiot, ocena);
        mapaOcen.put(nrIndexu, ocenyStudenta);
    }

    public void wypiszSrednia(String nrIndexu) {
        if (!mapaOcen.containsKey(nrIndexu)) {
            System.out.println("Nie posiadam ocen tego studenta!");
            return;
        }

        mapaOcen.get(nrIndexu).wypiszSrednia();
    }

    public void wypiszOceny(String nrIndexu) {
        if (!mapaOcen.containsKey(nrIndexu)) {
            System.out.println("Nie posiadam ocen tego studenta!");
            return;
        }

        // wywołaj metodę wypiszOceny() z klasy OcenyStudenta
        mapaOcen.get(nrIndexu).wypiszOceny();
    }
}