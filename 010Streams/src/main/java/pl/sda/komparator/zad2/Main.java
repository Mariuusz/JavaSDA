package pl.sda.komparator.zad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OfertaSprzedazy produkt = new OfertaSprzedazy("Jajka", 9);
        OfertaSprzedazy produkt2 = new OfertaSprzedazy("Pepsi", 5);
        OfertaSprzedazy produkt3 = new OfertaSprzedazy("Jajka", 3);
        OfertaSprzedazy produkt4 = new OfertaSprzedazy("Jabłka", 2);
        OfertaSprzedazy produkt5 = new OfertaSprzedazy("Banany", 8);
        OfertaSprzedazy produkt6 = new OfertaSprzedazy("Nutella", 14);
        OfertaSprzedazy produkt7 = new OfertaSprzedazy("Danio", 2);

        List<OfertaSprzedazy> lista = new ArrayList<>();
        lista.add(produkt);
        lista.add(produkt2);
        lista.add(produkt3);
        lista.add(produkt4);
        lista.add(produkt5);
        lista.add(produkt6);
        lista.add(produkt7);
        ComparatorProduktow ceneo = new ComparatorProduktow(false);
        Collections.sort(lista, ceneo);
        System.out.println(lista);
    }

    public static class ComparatorProduktow implements Comparator<OfertaSprzedazy> {
        private boolean czyRosnaca;

        public ComparatorProduktow(boolean czyRosnaca) {
            this.czyRosnaca = czyRosnaca;
        }

        @Override
        public int compare(OfertaSprzedazy o1, OfertaSprzedazy o2) {
            if (czyRosnaca == true) {
                if (o1.getCena() > o2.getCena()) {
                    return 1;
                } else if (o1.getCena() < o2.getCena()) {
                    return -1;
                }
            } else if (czyRosnaca == false) {
                if (o1.getCena() > o2.getCena()) {
                    return -1;
                } else if (o1.getCena() < o2.getCena()) {
                    return 1;
                }
            }
            return 0;
        }

    }

}
