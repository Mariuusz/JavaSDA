package pl.sda.zad3;

import java.util.*;

public class SetIterable {
    public static void main(String[] args) {
        List<String> elementy = new ArrayList<String>(Arrays.asList("slowo 1", "slowo 2", "slowo 3", " el1 ", "el2", "el3"));
        Set<String> stringSet = new HashSet<String>(elementy);
//        for (String element : stringSet) {
//            System.out.println(element);
//            if(element.equals("slowo 1") || element.equals("el3")) {
//                // w tym miejscu wyrzuci się nam ConcurrentModificationException
//                stringSet.remove(element);
//            }
//        }
        Iterator<String> iterator = stringSet.iterator();
        // dopóki istnieje jakiś element w zbiorze
        while (iterator.hasNext()){
            // wyciągam element z iteratora
            // oraz przechodzę do następnego
            String element = iterator.next();
            System.out.println(element);
            if(element.equals("el2") || element.equals("el3")){
                iterator.remove();
            }
        }
        System.out.println(stringSet);
    }
}
