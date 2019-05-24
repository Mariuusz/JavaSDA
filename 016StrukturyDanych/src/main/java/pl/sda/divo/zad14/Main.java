package pl.sda.divo.zad14;

//Przygotuj program zarządzający magazynem produktów w sklepie. Produkty będą podzielone na kilka kategorii (nabial, owoce, warzywa, pieczywo). Zastosuj enumy żeby trzymać kategorie.
//
//        Utwórz klasę magazyn z metodami dodającymi produkty do odpowiedniej kategorii oraz sprawdzającą czy produkt jest z danej kategorii
//class Magazyn:
//        produktyZKategorii
//
//        dodajProdukt
//        usunProdukt
//        usunProduktyNieSwieze
//        sprawdzCzyProduktWKategorii
//
//        Każdy produkt powinien mieć unikalną wartość, nazwę, cenę, kategorię i klasę cenową (jeżeli cena < 10 - klasa niska, jeżeli >= 10 - klasa wysoka; użyj enum).
//class Produkt:
//        unique_id
//        dataSpozycia
//        nazwa
//        cena
//        kategoria
//        klasa
//
//        Napisz metodę, w klasie produkt, która doda odpowiednią klasę w zależności od ceny
//
//        Utwórz klasę Zarzadca, która będzie zarzadzac magazynem. W mapie zarzadca przechowa różne magazyny, w kluczu trzymając ich nazwę. Jeżeli zarządca popełni błąd i spróbuje dodać magazyn z nazwą która już istnieje powinniśmy mu to uniemożliwić.
//        Zarzadca powinien mieć metodę, która pozwoli mu wyrzucić produkty, ze złą datą spożycia
//class Zarzadca:
//        magazyny
//
//        dodajMagazyn
//        wyczyscMagazyn
//
//        Do każdej klasy dodaj metodę toString
//
//        Utwórz kilka produktów z różnych kategorii i klas.
//        Utwórz kilka magazynów. Dodaj do nich produkty.
//        W main utwórz zarządcę, do którego dodaj magazyny.
//
//        Wyświetl najdroższy produkt z każdego magazynu i wyświetl go razem z nazwą magazynu.
//        Usun nieświeże produkty i wyświetl wszystkie produkty. Sprawdź czy usunęło.


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Zarzadca zarzadca = new Zarzadca();
        zarzadca.dodajMagazyn("Pierwszy magazyn", pobierzMagazynZProduktami("1"));
        zarzadca.dodajMagazyn("Pierwszy magazyn", pobierzMagazynZProduktami("2"));
        zarzadca.dodajMagazyn("Drugi magazyn", pobierzMagazynZProduktami("3"));
        zarzadca.dodajMagazyn("Trzeci magazyn", pobierzMagazynZProduktami("4"));
        zarzadca.dodajMagazyn("Czwarty magazyn", pobierzMagazynZProduktami("5"));
        zarzadca.dodajMagazyn("Piąty magazyn", pobierzMagazynZProduktami("6"));

        System.out.println("Przed czyszczeniem: ");
        System.out.println(zarzadca);
        zarzadca.wyczyscMagazyn();

        System.out.println();
        System.out.println("Po czyszczeniu: ");
        System.out.println(zarzadca);

        System.out.println();
        System.out.println("Najdroższe: ");
        System.out.println(zarzadca.pobierzNajdrozsze());
    }

    private static List<Produkt> generujProdukty(String label) {
        List<Produkt> produkts = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            produkts.add(new Produkt(label + "_Produkt " + i, rand.nextInt(100), Kategoria.of(rand.nextInt() % Kategoria.values().length), LocalDate.of(rand.nextInt(20) + 2010, rand.nextInt(11) + 1, rand.nextInt(24) + 1)));
        }

        return produkts;
    }

    private static Magazyn pobierzMagazynZProduktami(String label) {
        Magazyn magazyn = new Magazyn();
        generujProdukty(label).forEach(magazyn::dodajProdukt);
        return magazyn;
    }
}