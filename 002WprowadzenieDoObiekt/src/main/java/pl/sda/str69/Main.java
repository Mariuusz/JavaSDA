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

public class Main {
    public static void main(String[] args) {
        Bohater bohater1 = new Bohater("Spiderman", "Pajęcze sieci");
        Bohater bohater2 = new Bohater("Subzero", "Zamrażanie");
        Bohater bohater3 = new Bohater("Yoda", "Moc");

//          a.bohater1 = bohater2; bohater1=null; sout(bohater2==null)
        System.out.println("Punkt 4a:");
        System.out.println();
        bohater1 = bohater2;
        bohater1 = null;
        System.out.println(bohater2==null);
//          b.bohater1=null; bohater2=bohater1; bohater1=bohater3; soutprzyrównanie do nullna każdym z bohaterów
        System.out.println("Punkt 4b:");
        System.out.println();
        bohater1 = null;
        bohater2 = bohater1;
        bohater1 = bohater3;
        System.out.println(bohater1 == null);
        System.out.println(bohater2 == null);
        System.out.println(bohater3 == null);


        System.out.println("Punkt 5a:");
        System.out.println();
        System.out.println(bohater1.equals(bohater2));
//        System.out.println(bohater2.equals(bohater3));      // Null pointer exception
        System.out.println(bohater3.equals(bohater1));

        System.out.println("Punkt 5b:");
        System.out.println();
        System.out.println(bohater1==bohater2);
        System.out.println(bohater2==bohater3);
        System.out.println(bohater3==bohater1);

//        System.out.println(bohater1==bohater3);

    }

}
