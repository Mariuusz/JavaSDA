package pl.sda.komparator.zad3;

//3.
//        Stwórz klasę DrużynaPiłkarska (String nazwa, double pozycjaWRankingu, double siłaDrużyny).
//        Instancjom klasy przypisuj wartości pozycjaWRankingu oraz siłaDrużyny wartościami z przedziału 0-10.
//        Następnie stwórz 2(oddzielne) komparatory które sortują drużyny następująco:
//        - 1 komparator sortuje drużyny po ich pozycji w rankingu
//        - 2 komparator sortuje MALEJĄCO drużyny po ich 'proporcji' wielkości siłaDrużyny/pozycjaWRankingu.
//        W mainie stwórz kilka instancji klasy DrużynaPiłkarska i dodaj je do Listy.
//        Po dodaniu posortuj listę i na ekran wypisz  wynik przed sortowaniem, oraz po sortowaniu.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DruzynaPilkarska druzyna = new DruzynaPilkarska("a", 2, 10.0);
        DruzynaPilkarska druzyna2 = new DruzynaPilkarska("s", 8, 2.5);
        DruzynaPilkarska druzyna3 = new DruzynaPilkarska("d", 3, 7.6);
        DruzynaPilkarska druzyna4 = new DruzynaPilkarska("f", 1, 8.8);
        DruzynaPilkarska druzyna5 = new DruzynaPilkarska("g", 6, 7.7);
        DruzynaPilkarska druzyna6 = new DruzynaPilkarska("h", 5, 6.5);
        DruzynaPilkarska druzyna7 = new DruzynaPilkarska("j", 4, 8.7);
        DruzynaPilkarska druzyna8 = new DruzynaPilkarska("u", 9, 4.2);
        DruzynaPilkarska druzyna9 = new DruzynaPilkarska("t", 10, 3.5);
        DruzynaPilkarska druzyna10 = new DruzynaPilkarska("w", 7, 6.8);

        List<DruzynaPilkarska> liga = new ArrayList<>();
        liga.add(druzyna);
        liga.add(druzyna2);
        liga.add(druzyna3);
        liga.add(druzyna4);
        liga.add(druzyna5);
        liga.add(druzyna6);
        liga.add(druzyna7);
        liga.add(druzyna8);
        liga.add(druzyna9);
        liga.add(druzyna10);

        ComparatorRanking ranking = new ComparatorRanking();
        ComparatorSily rzeczywistaSila = new ComparatorSily();
        Collections.sort(liga,ranking);
        System.out.println(liga);
        Collections.sort(liga,rzeczywistaSila);
        System.out.println(liga);

    }

    public static class ComparatorRanking implements Comparator<DruzynaPilkarska> {
        @Override
        public int compare(DruzynaPilkarska o1, DruzynaPilkarska o2) {
            if (o1.getMieisceWRankingu() > o2.getMieisceWRankingu()) {
                return 1;
            } else if (o1.getMieisceWRankingu() < o2.getMieisceWRankingu()) {
                return -1;
            }
            return 0;
        }
    }

    public static class ComparatorSily implements Comparator<DruzynaPilkarska> {

        @Override
        public int compare(DruzynaPilkarska o1, DruzynaPilkarska o2) {
            if ((o1.getSilaDruzyny() / o1.getMieisceWRankingu()) > (o2.getSilaDruzyny() / o2.getMieisceWRankingu())) {
                return -1;
            } else if ((o1.getSilaDruzyny() / o1.getMieisceWRankingu()) < (o2.getSilaDruzyny() / o2.getMieisceWRankingu())) {
                return 1;
            }
            return 0;
        }
    }
}
