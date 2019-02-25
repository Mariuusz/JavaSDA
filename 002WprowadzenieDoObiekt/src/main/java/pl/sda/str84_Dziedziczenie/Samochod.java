package pl.sda.str84_Dziedziczenie;

//    1.Utwórz klasę Samochód o metodach:
//        przyspiesz():void-metoda zwiększa aktualną predkośćsamochodu o 10 km/h.
//          Ale auto nie może jechać więcej niż 120km/h. Wyświetl tekst „Przyspieszam do xxx km/h”
//        wlaczSwiatla():void
//        czySwiatlaWlaczone():boolean
//    2.Utwórz klasę Kabriolet dziedziczącą po klasie Samochód
//    3.Dodaj dodatkową metody:
//        schowajDach():void
//        czyDachSchowany():boolean
//          Str86
//        1.Nadpisz metodę przyspiesz() w Kabriolecie, tak aby samochód mógł jechać max 180 km/h
//        2.Gdy dach jest schowany wyświetl napis ‚Dach jest już schowany’
//          Str88
//        1.Zmodyfikuj konstruktor klasy Samochód tak, aby pobierała 3 parametry: kolor, markę i rocznik
//        2.Zaktualizuj konstruktor klasy Kabriolet
//        3.Nadpisz metodę ’toString()’ klasy Samochod, tak aby wyświetlała opis „{kolor} samochód marki {marka} rocznik {rocznik}”
//        4.Nadpisz metodę ‚toString()’ klasy Kabriolet, aby wyświetlała następujący opis:„{kolor} samochód marki {marka} rocznik {rocznik} z rozsuwanym dachem”
//        5.Nadpisz metodę equals() klasy Samochod
//        6.* Zmodyfikuj metodę w klasie Kabriolet, aby jedynie ‚dorzucała’ ostanie3 słowa od siebie (z rozsuwanym dachem)

public class Samochod {
    protected String kolor;
    protected String marka;
    protected int rocznik;

    protected int predkosc;
    private boolean czySwiatlaWlaczone;

    public Samochod(String kolor, String marka, int rocznik) {
        this.kolor = kolor;
        this.marka = marka;
        this.rocznik = rocznik;
    }

//    public Samochod() {
//    }

    public void przyspiesz() {
        predkosc += 10;
        if (predkosc <= 120) {
            System.out.println(String.format("Predkosc = %d km/h", predkosc));

        } else {
            predkosc = 120;
            System.out.println("Szybciej nie pojadę");
        }
    }

    public void wlaczSwiatla(){
        if (czySwiatlaWlaczone == true){
            System.out.println("Juz wlaczone");
        }else {
            czySwiatlaWlaczone = true;
            System.out.println("Włączam światła");
        }
    }

    @Override
    public String toString() {
        return String.format("%s samochód marki %s rocznik %d",kolor, marka, rocznik);
    }
}

