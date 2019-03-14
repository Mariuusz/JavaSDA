package pl.sda.zad6;

//Wykonaj polecenia:
//        a. Umieść wszystkie elementy tablicy {10,12,10,3,4,12,12,300,12,40,55} w zbiorze (HashSet) oraz:
//        b. Wypisz liczbę elementów na ekran (metoda size())
//        c. Wypisz wszystkie zbioru elementy na ekran (forEach)
//        d. Usuń elementy 10 i 12, wykonaj ponownie podpunkty a) i b)
//
//        e. Napisz metodę sprawdzającą, czy w tekście nie powtarzają się litery z wykorzystaniem zbioru. (boolean containDuplicates(String text))
//        f. Utwórz klasę ParaLiczb (int a,int b) i dodaj kilka instancji do zbioru:
//        {(1,2), (2,1), (1,1), (1,2)}.
//        g. Wyświetl wszystkie elementy zbioru na ekran. Czy program działa zgodnie z oczekiwaniem?

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> liczby = new ArrayList<>(Arrays.asList(10,12,10,3,4,12,12,300,12,40,55));
        //       Integer[] liczyTab = new Integer[]{1,2,3,4,5,6};
        Set<Integer> liczbyBezPowt = new HashSet<>(liczby);
        // Set<Integer> liczbyBezPowt2 = new HashSet<>();

        System.out.println(liczby);
        System.out.println(liczbyBezPowt.size());

        for (Integer element: liczbyBezPowt) {
            System.out.println(element);
        }



//        Iterator<Integer> iterator = liczby.iterator();
//
//        while (iterator.hasNext()) {
//            Integer licz = iterator.next();
//
//            System.out.println(licz);
//            if (licz == 12 || licz == 10) {
//                iterator.remove();
//            }
//        }
//        System.out.println(liczby);
//

        liczby.remove((Integer) 12);
        liczby.remove((Integer) 10);
        Set<Integer> liczbyBezPowt2 = new HashSet<>(liczby);
        System.out.println(liczby);

        System.out.println(liczby.size());

//        containDuplicates();





    }

    public static boolean czyZawieraDuplikaty(String slowo) {
        // odfiltrować / usunąć wszystkie spacje
        slowo = slowo.replaceAll(" ", "");
        // zmieniamy na same małe litery
//        slowo = slowo.toLowerCase();
        String[] litery = slowo.split("");
        Set<String> zbior = new HashSet<>(Arrays.asList(litery));
        // weryfikujemy czy przed dodaniem liter do zbioru i po ich dodaniu
        // mamy dalej tak samo wielkie zbiory
        // czy tablica jest tego samego rozmiaru co zbiór
        return zbior.size() == litery.length;
    }




//
//    private static boolean containDuplicates(String text) {
//
//        Set<String>  = new HashSet<>();
//
//        return false;
//    }

}
