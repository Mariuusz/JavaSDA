package pl.sda.str14;

//        1.Utwórz klasę Pokarm o polach:
//          1.Nazwa
//          2.TypPokarmu
//          3.Waga
//        2.Utwórz enumTypPokarmu{MIĘSO, OWOCE, NABIAŁ...}
//        3.Utwórz interfejs Jedzący
//        4.Dodaj metody
//          1.jedz(Pokarm pokarm):void
//          2.ilePosilkowZjedzone(): int
//          3.ileGramowZjedzone() :int
//        5.Utwórz klasy Weganin, Krokodyl, Programista
//        6.Zaimplementuj interfejs w wymienionych klasach
//        7.Uwzględnij typ jedzenia oraz możliwości osobników
//        8.W klasie Main utwórz przedstawicieli klas i dodaj ich do wspólnej tablicy
//        9.Przeiterujtablicę kilkukrotnie dla różnych pokarmów i znajdź 2 zwyciężców:
//          1.Gracza który zjadł najwięcej posiłków (Pokarmów)
//          2.Gracza ktoryzjadł największą masę jedzenia (gramy)

public class Pokarm {
    private String nazwa;
    private TypPokarmu typ;
    private int waga;

    public int getWaga() {
        return waga;
    }

    public TypPokarmu getTyp() {
        return typ;
    }

    public Pokarm(String nazwa, TypPokarmu typ, int waga) {
        this.nazwa = nazwa;
        this.typ = typ;
        this.waga = waga;
    }
}
