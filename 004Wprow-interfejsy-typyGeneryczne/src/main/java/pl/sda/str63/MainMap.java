package pl.sda.str63;

//      1.Napisz program do zliczania wystąpień słów w tekście, w tym celu:
//      2.Dodaj metodę zliczWystapieniaSlow(String tekst):Map<String, Integer>
//          1.Metoda pobiera tekst
//          2.Następnie rozdziela go na wystąpienia słów
//          3.Tworzy mapę ‚słowo’ ilość wystąpień
//          4.Iteruje po wszystkich słowach w zadanym tekscie
//          5.Dla każdego słowa wyciąga ilość zliczonych słów z mapy i dorzuca kolejne wystąpienie
//      3.Program wyświetla wszystkie odkryte słowa wraz z ich liczebnością
// TODO:
// 4.* Program wyświetla wszystkie odkryte słowa wraz z ich liczebnością w kolejności od
//          najczęściej występującego do najrzadziej występującego

import java.util.*;

public class MainMap {
    public static void main(String[] args) {
        System.out.println(zliczWystapieniaSlow("a a d f ggg h jj a jj"));

    }
    public static Map<String,Integer> zliczWystapieniaSlow(String tekst){
        String[] tablica = tekst.split(" ");

        Map<String,Integer> iloscWystapien = new HashMap<>();
        for (String slowo: tablica) {
            if (iloscWystapien.containsKey(slowo)){
                iloscWystapien.replace(slowo,iloscWystapien.get(slowo) + 1);
            } else {
                iloscWystapien.put(slowo,1);
            }
        }

        return iloscWystapien;
    }
}


//Collections.sort(hashSet, new Comparator<Figura>() {
//@Override
//public int compare(Figura f1, Figura f2) {
//        if (f1.obliczPole() > f2.obliczPole()) {
//        return 1;
//        } else if (f1.obliczPole() < f2.obliczPole()){
//        return -1;
//        }
//        return 0;
//        }
//        });
