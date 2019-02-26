package pl.sda.str20;

//        1.Utwórz interfejs Chłodzi:
//          1.pobierzTemp():double
//          2.schlodz():void
//        2.Utwórz interfejs Grzeje:
//          1.pobierzTemp():double
//          2.ogrzej():void
//        3.Utwórz 3 klasy: Farelka(Grzeje), Wiatrak(Chłodzi), Klimatyzacja(Grzeje,Chłodzi)
//        4.Przetestuj działanie w klasie Main
//        5.Dodaj metodę defaultwyswietlTemp():void w obu interfejsach, która wypisuje tekst:
//          „Aktualna temperatura w pomieszczeniu wynosi:xx.xstopni Celsjusza”
//        6.* Rozwiąż konflikt dla Klimatyzacji

public class Main {
    public static void main(String[] args) {
        Klimatyzacja klimatyzacja = new Klimatyzacja(18.3);
        klimatyzacja.schlodz();
        klimatyzacja.ogrzej();
        klimatyzacja.ogrzej();
        klimatyzacja.wyswietlTemp();

    }

}
