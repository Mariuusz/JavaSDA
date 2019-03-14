package pl.sda.zad1;

//1. Stwórz aplikację a w niej Zbiór (Set) słów (String).
//        - dodaj kilka słów ze scannera do zbioru.
//        - spróbuj dodać drugi raz taki sam string (czy uda się dodać obiekt?)
//        - dodaj do zbioru obiekt null (2 razy)
//        - wypisz zbiór (czy obiekt null występuje w zbiorze? ile razy?)

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        String a = new Scanner(System.in).nextLine();
        set.add(a);
        String b= a;
        set.add(b);
        set.add(null);
        set.add(null);


        System.out.println(set);

    }
}
