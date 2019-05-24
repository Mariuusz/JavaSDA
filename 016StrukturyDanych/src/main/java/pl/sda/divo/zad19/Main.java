package pl.sda.divo.zad19;

//Napisz metodę, która zliczy ile jest unikalnych znaków w napisie i zwróci ich ilość.
// Jako, że do metody mogą trafiać kilka razy takie same napisy,
// dodaj HashMapę w celu cacheowania wywołań.

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> znaki = zliczZnaki("mateusz ma ma ma");
        for (Map.Entry<Character, Integer> entry : znaki.entrySet()) {
            if (entry.getValue().equals(1)) {
                System.out.println(entry);
            }
        }
    }

    public static Map<Character, Integer> zliczZnaki(String napis) {
        Map<Character, Integer> znaki = new HashMap<>();

        for (int i = 0; i < napis.length(); i++) {
            Character litera = napis.charAt(i);
//            if (znaki.containsKey(litera)) {
//                Integer iloscWystapien = znaki.get(litera);
//                znaki.put(litera, iloscWystapien + 1);
//            } else {
//                znaki.put(litera, 1);
//            }
            znaki.putIfAbsent(litera, 0);
            znaki.put(litera, znaki.get(litera) + 1);
        }

        return znaki;
    }
}