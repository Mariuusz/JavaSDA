package pl.sda.divo.zad7;

//Przygotuj program sprawdzający szybkość działania linkedList i arrayList.
//        Każdej z tych list wylosuj kilkaset tysięcy elementów.
//        Dodaj te elementy w kilku pętlach, najpierw jako pierwszy element listy,
//        później w środku, później na końcu. Sprawdź czasy wykonania programu

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> linkedList = new ArrayList<>();
        Random random = new Random();
        long start = new Date().getTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(random.nextInt());
        }
        System.out.println("Dodaj na końcu: " + (new Date().getTime() - start) + "ms");

        linkedList = new ArrayList<>();
        start = new Date().getTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(0, random.nextInt());
        }
        System.out.println("Dodaj na początku: " + (new Date().getTime() - start) + "ms");
    }
}