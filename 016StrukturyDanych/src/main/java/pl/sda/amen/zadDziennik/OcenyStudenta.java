package pl.sda.amen.zadDziennik;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OcenyStudenta {
    private Map<Przedmiot, List<Double>> mapaOcen = new HashMap<>();

    public OcenyStudenta() {
    }

    public Map<Przedmiot, List<Double>> getMapaOcen() {
        return mapaOcen;
    }

    public void setMapaOcen(Map<Przedmiot, List<Double>> mapaOcen) {
        this.mapaOcen = mapaOcen;
    }

    public void dodajOcenę(Przedmiot przedmiot, Double ocena) {
        List<Double> listaOcen = null;                          // deklaracja
        if (mapaOcen.containsKey(przedmiot)) {
            // pod podanym przedmiotem widnieją już jakieś oceny
            listaOcen = mapaOcen.get(przedmiot);                // przypisanie
        } else {
            // nie ma ocen - czyli nie ma listy ocen
            listaOcen = new ArrayList<>();                      // przypisanie
        }
        listaOcen.add(ocena);
        mapaOcen.put(przedmiot, listaOcen);
    }

    public void wypiszOceny() {
        System.out.println("Oceny: ");
        for (Przedmiot przedmiot : Przedmiot.values()) {
            wypiszOceny(przedmiot);
        }
    }

    private void wypiszOceny(Przedmiot przedmiot) {
        if (mapaOcen.containsKey(przedmiot)) {
            System.out.println(przedmiot + " -> " + mapaOcen.get(przedmiot));
        }
    }

    public void wypiszSrednia() {
        System.out.println("Srednie z przedmiotow: ");

        double sumaSrednichZPrzedmiotow = 0.0;
        int licznikSumowanychPrzedmiotów = 0;

        for (Przedmiot przedmiot : Przedmiot.values()) {
            double sredniaZPrzedmiotu = obliczSredniaZPrzedmiotu(przedmiot);
            if (sredniaZPrzedmiotu != 0.0) {
                System.out.println("Średnia (" + przedmiot + "): " + sredniaZPrzedmiotu);
                sumaSrednichZPrzedmiotow += sredniaZPrzedmiotu;
                licznikSumowanychPrzedmiotów++;
            }
        }

        double sredniaZWszystkichPrzedmiotow = sumaSrednichZPrzedmiotow / licznikSumowanychPrzedmiotów;

        System.out.println("Średnia (ogółem): " + sredniaZWszystkichPrzedmiotow);
    }

    private double obliczSredniaZPrzedmiotu(Przedmiot przedmiot) {
        if (!mapaOcen.containsKey(przedmiot)) {
            // brak ocen!
            return 0;
        }

        // pobieram oceny
        List<Double> listaOcen = mapaOcen.get(przedmiot);

        // obliczam sumę ocen (stream)
        double średniaOcenZPrzedmiotu = listaOcen.stream().mapToDouble(o -> o).sum();

        // dzielę sumę na ilość (średnia)
        średniaOcenZPrzedmiotu /= listaOcen.size();

        // zwracam średnią
        return średniaOcenZPrzedmiotu;
    }
}