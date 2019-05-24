package pl.sda.divo.zad14;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Random;

@Getter
@ToString
public class Produkt {
    private int unikalneId;
    private String nazwa;
    private int cena;
    private Klasa klasa;
    private Kategoria kategoria;
    private LocalDate dataSpozycia;

    public Produkt(String nazwa, int cena, Kategoria kategoria, LocalDate dataSpozycia) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
        this.dataSpozycia = dataSpozycia;

        if (cena >= 10) {
            klasa = Klasa.HIGH;
        } else {
            klasa = Klasa.LOW;
        }

        unikalneId = new Random().nextInt(9999);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n      ").append(nazwa);
        sb.append("\n          unikalneId: ").append(unikalneId);
        sb.append("\n          klasa: ").append(klasa.name());
        sb.append("\n          cena: ").append(cena);
        sb.append("\n          kategoria: ").append(kategoria.name());
        sb.append("\n          dataSpozycia: ").append(dataSpozycia);

        return sb.toString();
    }
}