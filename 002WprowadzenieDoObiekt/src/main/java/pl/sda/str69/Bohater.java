package pl.sda.str69;

//        1.Utwórz klasę „SuperBohater”
//        2.Dodaj 2 pola tekstowe : nazwa, supermoc
//        3.Utwórz 3 bohaterów
//        4.Przećwicz zachowanie obiektów na przykładach:
//          a.bohater1 = bohater2; bohater1=null; sout(bohater2==null)
//          b.bohater1=null; bohater2=bohater1; bohater1=bohater3; soutprzyrównanie do nullna każdym z bohaterów
//        5.*Przećwicz zachowanie się Stringów poprzez tworzenie literałów i nowych obiektów typu String
//          a.Sprawdź zachowanie metody .equals()
//          b.Sprawdź zachowanie przyrównania ==

public class Bohater {
    private String nazwa;
    private String superMoc;

    public Bohater(String nazwa, String superMoc) {
        this.nazwa = nazwa;
        this.superMoc = superMoc;
    }

}
