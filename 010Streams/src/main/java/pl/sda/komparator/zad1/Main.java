package pl.sda.komparator.zad1;

//1.
//  Stwórz klasę Osoba (String imie, String nazwisko, int wiek),
// a następnie stwórz dla niego Comparator, który sortuje osoby po wieku.
//  W mainie stwórz kilka instancji klasy osoba i dodaj je do Listy.
// Po dodaniu posortuj listę i na ekran wypisz  wynik przed sortowaniem, oraz po sortowaniu.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Osoba> osoby = new ArrayList<>();
        osoby.add(new Osoba("Ania", "Kowalska", 37));
        osoby.add(new Osoba("A", "Kowska", 38));
        osoby.add(new Osoba("Ani", "Koka", 98));
        osoby.add(new Osoba("An", "Kowal", 45));

        ComparatorOsob comparatorOsob = new ComparatorOsob();
        System.out.println(osoby);
        Collections.sort(osoby, comparatorOsob);
        System.out.println(osoby);
    }

    public static class ComparatorOsob implements Comparator<Osoba> {
        // -1 o1>o2
        // 0 o1 == o2
        // 1 o1<o2
        @Override
        public int compare(Osoba o1, Osoba o2) {
            if (o1.getWiek() > o2.getWiek()) {
                return 1;
            } else if (o1.getWiek() < o2.getWiek()){
                return -1;
            }
            return 0;
        }

    }
}