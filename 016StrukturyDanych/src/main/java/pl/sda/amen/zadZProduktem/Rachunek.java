package pl.sda.amen.zadZProduktem;

import java.util.ArrayList;
import java.util.List;

public class Rachunek {
    private List<Produkt> listaProduktów = new ArrayList<>();

    public Rachunek(List<Produkt> listaProduktów) {
        this.listaProduktów = listaProduktów;
    }

    public void wypiszRachunek() {
        listaProduktów.forEach(System.out::println);
    }

    public double podsumujRachunekNetto() {
        double suma = listaProduktów.stream().mapToDouble(p -> p.getCenaNetto()).sum();

//        for (Produkt produkt : listaProduktów) {
//            suma+= produkt.getCenaNetto();
//        }

        return suma;
    }

    public double podsumujRachunekBrutto() {
        double suma = listaProduktów.stream().mapToDouble(p -> p.podajCeneBrutto()).sum();

//        for (Produkt produkt : listaProduktów) {
//            suma+= produkt.podajCeneBrutto();
//        }

        return suma;
    }

    public double zwrocWartoscPodatku() {
        return podsumujRachunekBrutto() - podsumujRachunekNetto();
    }

    public void porownajPodatki() {
        double na8Procent = podsumujRachunekNetto() +
                (podsumujRachunekNetto() * PodatekProduktu.VAT8.getProcentPodatku() / 100.0);
        double na23Procent = podsumujRachunekNetto() +
                (podsumujRachunekNetto() * PodatekProduktu.VAT23.getProcentPodatku() / 100.0);

        System.out.println("Wartość rachunku z podatkiem 8% = " + na8Procent + " wartość z podatkiem 23% = " + na23Procent);
    }
}