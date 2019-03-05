package pl.sda.zad4;

//Stwórz oddzielnego maina, a w nim kolejną listę String'ów. Wykonaj zadania:
//        - dodaj do listy losowe 100 elementów z zakresu 0-100. (konwersja int na string to String.valueOf())
//        - oblicz średnią liczb
//        - usuń wszystkie liczby powyżej średniej
//        - wypisz wszystkie liczby
//        - wykonaj kopię listy do tablicy
//
//
//        Sprawdź działanie aplikacji.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            lista.add(String.valueOf(new Random().nextInt(101)));
        }
        System.out.println(lista);

        double srednia = 0;
        for (String string : lista) {
            srednia += Integer.valueOf(string);
        }
        srednia /= lista.size();
        System.out.println(srednia);
        List<String> kopia = new ArrayList<String>(lista);

        for (int i=0; i<lista.size()-1;i++) {
            if (Integer.valueOf(lista.get(i)) > srednia){
                kopia.remove(lista.get(i));
            }
        }
        System.out.println(kopia);
    }
}
