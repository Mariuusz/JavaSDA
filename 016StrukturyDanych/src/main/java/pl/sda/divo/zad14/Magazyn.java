package pl.sda.divo.zad14;

import lombok.Getter;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Getter
public class Magazyn {
    private Map<Kategoria, List<Produkt>> produktyZKategorii = new HashMap<>();

    public Magazyn() {
        for (Kategoria kategoria : Kategoria.values()) {
            produktyZKategorii.put(kategoria, new LinkedList<>());
        }
    }

    public void dodajProdukt(Produkt produkt) {
        produktyZKategorii.get(produkt.getKategoria()).add(produkt);
    }

    void usunProduktyNieSwieze() {
        for (List<Produkt> produkty : produktyZKategorii.values()) {
            produkty.removeIf(produkt -> produkt.getDataSpozycia().isBefore(LocalDate.now()));
        }
    }

    public Produkt pobierzNajdrozszy() {
        return produktyZKategorii.values().stream()
                .flatMap(Collection::stream)
                .max(Comparator.comparingInt(Produkt::getCena))
                .orElse(null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        produktyZKategorii.entrySet().stream()
                .filter(e -> !e.getValue().isEmpty())
                .map(e -> "\n    " + e.getKey() + ": " + e.getValue())
                .forEach(sb::append);

        return sb.toString();
    }
}