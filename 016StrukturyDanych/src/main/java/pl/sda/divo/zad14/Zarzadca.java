package pl.sda.divo.zad14;

import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
@ToString
public class Zarzadca {
    private Map<String, Magazyn> magazyny = new HashMap<>();

    public void dodajMagazyn(String name, Magazyn magazyn) {
        magazyny.putIfAbsent(name, magazyn);
    }

    public void wyczyscMagazyn() {
        for (Magazyn magazyn : magazyny.values()) {
            magazyn.usunProduktyNieSwieze();
        }
    }

    public Map<String, Produkt> pobierzNajdrozsze() {
        return magazyny.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().pobierzNajdrozszy()));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        magazyny.entrySet().stream()
                .map(e -> "\n" + e.getKey() + ":" + e.getValue())
                .forEach(sb::append);

        return sb.toString();
    }
}