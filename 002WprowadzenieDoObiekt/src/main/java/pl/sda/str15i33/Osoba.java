package pl.sda.str15i33;

//        1.Utworzenie nowego pakietu
//        2.Utworzenie klasy Osoba
//        3.Utworzenie pól :
//          •imie:String
//          •rok urodzenia:int
//        4.Utworzenie metody:
//          przedstawSie():void
//        5.Implementacja metody
//        6.Utworzenie 3 obiektów:
//          1.Ania lat 25
//          2.Andrzej lat 30
//          3.Mariola lat 68
//        7.Uruchomienie metody przedstawSiena każdym z obiektów

//        1.Aktualizacja klasy Osoba
//        2.Dodanie konstruktora
//        3.Utworzenie dodatkowych 3 obiektów typu osoba za pomocą konstruktora
//        4.Umieszczenie wszystkich obiektów Osoba do tablicy
//        5.Wyświetlenie wszystkich osób z tablicy w pętli
//        6.* Wyświetlenie tylko pań
//        7.* Wyświetlenie tylko panów

public class Osoba {
    String imie;
    int rokUrodzenia;
    Osoba[] osoby;

    public Osoba(String imie, int rokUrodzenia) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;

    }

    public Osoba() {

    }

    public static void main(String[] args) {
        Osoba ania = new Osoba();
        Osoba andrzej = new Osoba();
        Osoba mariola = new Osoba();

        ania.imie = "Ania";
        ania.rokUrodzenia = 1993;

        andrzej.imie = "Andrzej";
        andrzej.rokUrodzenia = 1964;

        mariola.imie = "Mariola";
        mariola.rokUrodzenia = 1950;

        Osoba alicja = new Osoba("Alicja", 1990);
        Osoba karol = new Osoba("Karol", 1990);
        Osoba adam = new Osoba("Adam", 1989);

        Osoba[] osoby = new Osoba[]{ania, mariola, andrzej, alicja, karol, adam};
        System.out.println("Kobiety to:");
        for (Osoba osoba : osoby) {
            if (osoba.czyJestesKobieta())
                System.out.println(osoba.imie);
        }
        System.out.println();
        System.out.println("Mezczyzni to:");
        for (Osoba osoba : osoby) {
            if (!osoba.czyJestesKobieta())
                System.out.println(osoba.imie);
        }
    }

    public void przedstawSie() {
        int wiek = 2018 - rokUrodzenia;
        System.out.println("Czesc! Mam na imie " + imie + " i mam " + wiek + " lat.");
    }


    private boolean czyJestesKobieta() {
        return (imie.endsWith("a"));
    }
}




//package pl.sda.obiektowosc.osoby;
//
//public class Osoba {
//    String imie;
//    int rokUrodzenia;
//
//    public Osoba() {
//
//    }
//
//    public static void main(String[] args) {
//        Osoba ala = new Osoba();
//        ala.imie = "Ala";
//        ala.rokUrodzenia = 1993;
//
//        System.out.println("Przedstaw się");
//        ala.przedstawSie();
//
//        Osoba andrzej = new Osoba();
//        andrzej.imie = "Andrzej";
//        andrzej.rokUrodzenia = 1980;
//
//        andrzej.przedstawSie();
//
//        Osoba mariola = new Osoba();
//        mariola.imie = "Mariola";
//        mariola.rokUrodzenia = 1970;
//
//        mariola.przedstawSie();
//
//        Osoba jan = new Osoba("Jan", 1954);
//
//        Osoba[] osoby = new Osoba[]{ala, andrzej, mariola, jan};
//        jan.przedstawSie();
//        for (int i = 0; i < osoby.length; i++) {
//            osoby[i].przedstawSie();
//        }
//
////        for (String kobieta : osoby) {
////            if (kobieta.endsWith("a")) {
////                System.out.println(kobieta);
////            }
////        }
//        System.out.println("kobiety");
//        for (int i = 0; i < osoby.length; i++) {
//            if (osoby[i].imie.endsWith("a")) {
//                osoby[i].przedstawSie();
//            }
//        }
//        System.out.println("mężczyzna");
//        for (int i = 0; i < osoby.length; i++) {
//            if (!osoby[i].imie.endsWith("a")) {
//                osoby[i].przedstawSie();
//                //    System.out.println(osoby[i].przedstawSie();
//            }
//        }
//
//
//    }
//
//    private void przedstawSie() {
//        int wiek = 2018 - rokUrodzenia;
//        System.out.println("Mam na imie " + imie + " i mam " + wiek + " lat");
//    }
//
//    public Osoba(String imie, int rokUrodzenia) {
//        this.imie = imie;
//        this.rokUrodzenia = rokUrodzenia;
//    }
//}