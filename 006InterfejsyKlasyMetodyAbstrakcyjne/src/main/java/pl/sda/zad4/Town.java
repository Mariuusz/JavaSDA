package pl.sda.zad4;

//4.	Stwórz klasę abstrakcyjną Citizen(Obywatel) oraz klasy dziedziczące:
//        a.	Peasant(Chłop),
//        b.	Townsman(Mieszczanin),
//        c.	King(Król),
//        d.	Soldier(Żołnierz)
//
//        Wszystkie klasy posiadają pole imie (przemyśl gdzie powinno się znajdować to pole - w klasie Citizen).
//        Citizen powinien być klasą abstrakcyjną która posiada metodę abstrakcyjną 'boolean canVote()'
//        (może głosować) która zwraca true dla townsman'a i soldier'a, ale false dla chłopa i króla.
//
//        Stwórz klasę Town która posiada tablicę Citizenów. Town nie dziedziczy po Citizen.
//        Dodaj do niej kilku citizenów (różnych w mainie) i stwórz metody howManyCanVote
//        które zwracają ilość osób które mogą głosować. Stwórz w klasie Town metodę "whoCanVote" która wypisuje
//        imiona osób które mogą głosować. *Dla chetnych metoda whoCanVote():Citizen[] - zwraca podtablicę osób
//        które mogą głosować.
//
//        WSKAZÓWKA: żeby dodać do Town citizenów, stwórzcie citizenów jako pole w mieście, a następnie przekaż ich w konstruktorze. Tworząc miasto w main’ie przekaż przygotowaną wcześniej tablicę obywateli (citizenów).
//
//        howmanycanvote - pętlą liczymy ilość obywateli którzy mogą głosować.

public class Town {
    public static void main(String[] args) {
        Citizen soldier = new Soldier("Joseph");
        Citizen soldier2 = new Soldier("Jogan");
        Citizen king = new King("Arthur");
        Citizen townsman = new Townsman("Olaf");
        Citizen peasant = new Peasant("Jelph");

        Citizen[] citizen = new Citizen[]{soldier, soldier2, king, townsman, peasant};

        Town town = new Town(citizen);

        System.out.println(town.howManyCanVote());


        for (Citizen citizens : town.whoCanVote(town)) {
            System.out.println(citizens.getImie());
        }

    }

    private Citizen[] mieszkańcy;

    public Town(Citizen[] mieszkańcy) {
        this.mieszkańcy = mieszkańcy;
    }

    public int howManyCanVote() {
        int votes = 0;
        for (Citizen citizen : mieszkańcy) {
            if (citizen.canVote() == true) {
                votes += 1;
            }
        }
        return votes;
    }

    public Citizen[] whoCanVote(Town town) {
        int tabSize = town.howManyCanVote();
        Citizen[] canVote = new Citizen[tabSize];
        int i = 0;
        for (Citizen citizen : mieszkańcy) {
            if (citizen.canVote() == true) {
                canVote[i] = citizen;
                i++;
            }
        }

        return canVote;
    }
}