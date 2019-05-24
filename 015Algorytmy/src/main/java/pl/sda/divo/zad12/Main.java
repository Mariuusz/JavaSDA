package pl.sda.divo.zad12;

//Pobierz od użytkownika pary liczb (wartość, waga). Następnie zakładając, że w plecaku może się zmieścić maksymalnie 30, zaproponuj algorytm, który zapakuje przedmioty o jak największej wartości.
//
//        1. Przedstaw opis słowny problemu
//        2. Przedstaw schemat blokowy
//        3. Zaimplementuj algorytm.
//
//        Rozwinięcie:
//        2. Zaproponuj optymalizację algorytmu

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Getter
@Builder
class Pack {
    private final int weight;
    private final int price;
}


class Main {
    private static double zapakujZachlannie(List<Pack> packs, double U) {
        double W = 0;
        double temp;
        for (Pack p : packs) {
            temp = U / p.getWeight();
            U -= temp * p.getWeight();
            W += temp * p.getPrice();
        }
        return W;
    }

    private static List<Pack> init() {
        List<Pack> packs = new ArrayList<>();
        packs.add(Pack.builder()
                .price(1)
                .weight(11)
                .build());
        packs.add(Pack.builder()
                .price(2)
                .weight(7)
                .build());
        packs.add(Pack.builder()
                .price(3)
                .weight(13)
                .build());
        packs.add(Pack.builder()
                .price(4)
                .weight(3)
                .build());
        packs.add(Pack.builder()
                .price(5)
                .weight(3)
                .build());
        packs.add(Pack.builder()
                .price(6)
                .weight(11)
                .build());
        packs.add(Pack.builder()
                .price(7)
                .weight(11)
                .build());

        return packs;
    }

    public static void main(String[] args) {
        List<Pack> packs = init();
        packs.sort(Comparator.comparingInt(p -> p.getPrice() / p.getWeight()));
        System.out.println(zapakujZachlannie(packs, 12));
    }
}