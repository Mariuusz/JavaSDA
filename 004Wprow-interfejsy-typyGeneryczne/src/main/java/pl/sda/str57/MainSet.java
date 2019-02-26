package pl.sda.str57;

//      1.Utwórz klasę abstrakcyjną Figura
//      2.Dodaj metodę abstrakcyjną obliczPole():double
//      3.Zaimplementuj interfejs Comparable tak aby sortować względem wielkości pola
//    4.Nadpisz metodę .toString() aby zwracać wielkość pola
//      5.Napisz klasy Kwadrat oraz Prostokąt dziedziczące po Figurze
//      6.Utwórz kilka obiektów typu Kwadrat i Prostokąt i umieść w Secie przechowującym typ Figura
//      7.Wydrukuj wszystkie obiekty
//      8.Podmień implementację seta i zaobserwuj różnice
//        1.HashSet
//        2.LinkedHashSet
//        3.TreeSet

import java.util.*;

public class MainSet {
    public static void main(String[] args) {
        Figura kwadrat = new Kwadrat(3);
        Figura kwadrat2 = new Kwadrat(4);
        Figura prostokąt = new Prostokąt(2, 3);
        Figura prostokąt2 = new Prostokąt(3, 6);

        Set<Figura> hashSet = new HashSet<Figura>();
        hashSet.add(kwadrat);
        hashSet.add(kwadrat2);
        hashSet.add(prostokąt);
        hashSet.add(prostokąt2);
        System.out.println(hashSet);
        for (Figura f : hashSet) {
            System.out.println(f.obliczPole());
        }


        Set<Figura> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(kwadrat);
        linkedHashSet.add(kwadrat2);
        linkedHashSet.add(prostokąt);
        linkedHashSet.add(prostokąt2);
//        Set<Figura> linkedHashSet = new LinkedHashSet<>(hashSet);
        System.out.println(linkedHashSet);


//        Set<Figura> treeSet = new TreeSet<Figura>();
//        Set<Figura> treeSet = new TreeSet<>(hashSet);
//        treeSet.add(kwadrat);
//        treeSet.add(kwadrat2);
//        treeSet.add(prostokąt);
//        treeSet.add(prostokąt2);
//
//        System.out.println(treeSet);
//        for (Figura f : treeSet) {
//            System.out.println(f.obliczPole());
//        }

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
//
//