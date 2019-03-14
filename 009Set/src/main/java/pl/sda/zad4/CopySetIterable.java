package pl.sda.zad4;

import java.util.*;

public class CopySetIterable {
    public static void main(String[] args) {
        List<String> elementy = new ArrayList<String >(Arrays.asList("slowo 1", "slowo 2", "slowo 3", "el1", "el2", "el3"));
        Set<String> stringSet = new HashSet<String>(elementy);
        // el2 el1
//        Object[] tablica = stringSet.toArray();
//        for (Object o : tablica) {
//            if (o instanceof String) {
//                String rzutowany = (String) o;
//            }
//        }
        // przygotowuję sobie tablicę
        String[] tablica = new String[stringSet.size()];
        // następnie wywołuję metodę toArray która kopiuje elementy ze zbioru do tablicy
        tablica = stringSet.toArray(tablica);
        // Iteruję tablicę (nie zbiór - dzięki czemu nie wystąpi ConcurrentModificationException)
        for (String element: tablica) {
            if(element.equals("el1") || element.equals("el2")){
                // usuwam ze zbioru
                stringSet.remove(element);
            }
        }
    }
}