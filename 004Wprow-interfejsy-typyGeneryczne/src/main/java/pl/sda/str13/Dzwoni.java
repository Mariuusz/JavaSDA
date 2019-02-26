package pl.sda.str13;

//        1.Utwórz interfejs Dzwoni
//        2.Dodaj mu pole statyczne dla przechowywania numeru alarmowego
//        3.Dodaj metody:
//          1.zadzwon(String):void
//          2.zadzwonNaNrAlarmowy():void
//        4.Utwórz klasę Telefon o polach:
//          1.numerTelefonu: String
//          2.lacznyCzasRozmow: int
//        5.Zaimplementuj interfejs Dzwoni w Telefonie
//        6.Niech zadzwon() losowo się nie dodzwania na wybrany numer
//        7.Przetestuj rozwiązanie
//        8.* zadzwon() niech generuje losowy czas rozmowy w zakresie od1 minuty do godziny
//        9.* Podsumowanie czasu rozmowy powinno się wyświetlićpod koniec metody zadzwon

public interface Dzwoni {
    static String nrAlarmowy = "112";

    void zadzwon(String numer);
    void zadzwoanNaAlarmowy();

}