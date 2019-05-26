package pl.sda.strategy.zad1;

public class Main {
    public static void main(String[] args) {
        Samochód pojElektryczny = Factory.stworzElektryczny();
        Samochód pojSpalinowy = Factory.stworzSpalinowy();

        System.out.println(pojElektryczny);
        System.out.println(pojSpalinowy);
        System.out.println();
        System.out.println();

        pojSpalinowy.przyspiesz();
        System.out.println(pojSpalinowy);

        pojSpalinowy.przyspiesz();
        System.out.println(pojSpalinowy);

        pojSpalinowy.przyspiesz();
        System.out.println(pojSpalinowy);

        pojSpalinowy.przyspiesz();
        System.out.println(pojSpalinowy);

        pojSpalinowy.zwolnij();
        System.out.println(pojSpalinowy);
        pojSpalinowy.zwolnij();
        System.out.println(pojSpalinowy);
        pojSpalinowy.zwolnij();
        System.out.println(pojSpalinowy);




    }
}
