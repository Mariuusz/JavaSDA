package pl.sda.zad2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Stwórz klasę Osoba która posiada imie, nazwisko i wiek.
//        Stwórz kilka instancji klasy osoba i dodaj je do zbioru.
//        Iteruj zbiór posługując się Iterator'em.
//        *Spróbuj usunąć ze zbioru osoby których wiek jest niższy niż 18 lat.
public class Main {
    public static void main(String[] args) {
        Osoba andrzej = new Osoba("Andzrej", 25);
        Osoba konrad = new Osoba("Konrad", 26);
        Osoba joanna = new Osoba("Joanna", 17);
        Osoba anna = new Osoba("Anna", 17);

        Set<Osoba> set = new HashSet<Osoba>();
        set.add(andrzej);
        set.add(konrad);
        set.add(joanna);
        set.add(anna);

        Iterator<Osoba> iterator = set.iterator();
        // dopóki istnieje jakiś element w zbiorze
        while (iterator.hasNext()){
            // wyciągam element z iteratora
            // oraz przechodzę do następnego
            Osoba osoba = iterator.next();
            System.out.println(osoba);
            if(osoba.getWiek()<18){
                iterator.remove();
            }
        }
        System.out.println(set);

    }
}
