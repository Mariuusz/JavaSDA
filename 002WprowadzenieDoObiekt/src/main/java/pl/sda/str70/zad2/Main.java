package pl.sda.str70.zad2;

public class Main {
    public static void main(String[] args) {
        Ulamek polowka = new Ulamek(1, 2);
        //       Ulamek cwiartka = new Ulamek(1,4);

        polowka.wyswietl();

        Ulamek cwiartka = polowka.pomnoz(polowka);
        cwiartka.wyswietl();

        Ulamek osemka = polowka.pomnoz(cwiartka);
        osemka.wyswietl();

        polowka.pomnoz(polowka).pomnoz(cwiartka).pomnoz(osemka).wyswietl();             // po wyswietl już nie można nic dalej bo zwraca void

        cwiartka.dodaj(osemka).wyswietl();
        osemka.podziel(osemka).wyswietl();
        cwiartka.odejmij(osemka).wyswietl();
    }
}
