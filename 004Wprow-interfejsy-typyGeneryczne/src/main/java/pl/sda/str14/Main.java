package pl.sda.str14;

public class Main {
    public static void main(String[] args) {

        Pokarm szynka = new Pokarm("Szynka", TypPokarmu.MIESO, 70);
        Pokarm golonka = new Pokarm("Golonka", TypPokarmu.MIESO, 1500);
        Pokarm gruszka = new Pokarm("Gruszka", TypPokarmu.OWOCE, 100);
        Pokarm jabłko = new Pokarm("Jabłko", TypPokarmu.OWOCE, 100);
        Pokarm ser = new Pokarm("Ser", TypPokarmu.NABIAL, 60);
        Pokarm jajko = new Pokarm("Jajko", TypPokarmu.NABIAL, 30);

        Weganin weganin = new Weganin();
        Krokodyl krokodyl = new Krokodyl();
        Programista programista = new Programista();

        Jedzacy[] jedzacy = new Jedzacy[]{weganin,krokodyl,programista};

        for (Jedzacy zawodnik: jedzacy ) {
            zawodnik.jedz(szynka);
            zawodnik.jedz(ser);
            zawodnik.jedz(golonka);
            zawodnik.jedz(gruszka);
            zawodnik.jedz(jabłko);
            zawodnik.jedz(jajko);

//            System.out.println( zawodnik.ilePosilkowZjedzone());
//            System.out.println(  zawodnik.ileGramowZjedzone());
        }
        System.out.println("Weganin zjadł " + weganin.ilePosilkowZjedzone() + " posiłki.");
        System.out.println("Krokodyl zjadł " + krokodyl.ilePosilkowZjedzone() + " posiłki.");
        System.out.println("Programista zjadł " + programista.ilePosilkowZjedzone() + " posiłki.");

        System.out.println("Weganin zjadł " + weganin.ileGramowZjedzone() + " gramów.");
        System.out.println("Krokodyl zjadł " + krokodyl.ileGramowZjedzone() + " gramów.");
        System.out.println("Programista zjadł " + programista.ileGramowZjedzone() + " gramów.");
    }
}
