package pl.sda.divo.zad18;

//Mając poniższe funkcje:
//public static List<Map<String, String>> pobierzAutorow() {
//        List<Map<String, String>> autorzy = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//        Map<String, String> map = new HashMap<>();
//        map.put("id", "ID_" + i);
//        map.put("imie", "imie " + i);
//        map.put("nazwisko", "nazwisko " + i);
//        autorzy.add(map);
//        }
//
//        return autorzy;
//        }
//
//public static List<Map<String, String>> pobierzKsiazki() {
//        List<Map<String, String>> ksiazki = new ArrayList<>();
//        Random rand = new Random();
//        for (int i = 0; i < 20; i++) {
//        Map<String, String> map = new HashMap<>();
//        map.put("tytul", "tutul" + i);
//        map.put("cena", "" + rand.nextInt(999));
//        map.put("autor", "ID_" + rand.nextInt(5));
//        ksiazki.add(map);
//        }
//
//        return ksiazki;
//        }
//
//        Przygotuj program, który wyświetli wszystkich autorów oraz podporządkowną im listę książek oraz, jeżeli autor ma więcej niż 5 książek zwróci informację, że autor jest popularny. W tym celu przygotuj klasy:
//        Autor:
//        id
//        imie
//        nazwisko
//        ksiazki
//
//        czyPopularny()
//
//        Ksiazka:
//        tytul
//        cena
//
//        Pobierając dane z powyższych funkcji, przygotuj odpowiednie mapy, a następnie wypełnij klasy.
//        Wylistuj wszystkich autorów wraz z książkami. Oznacz "*" nazwiska autorów popularnych.

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Author> authors = new Biblioteka().getAuthors();
        System.out.println(authors);
        for (Author a : authors) {
            System.out.print("(" + a.getId() + ") ");
            if (a.isPopular()) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            System.out.println(a.getSurname());
        }
    }
}