package pl.sda.zad2;

//  2. Stwórz klasę generyczną Pudełko. Pudełko przechowuje dowolny obiekt generyczny.
// Dodaj pole typu generycznego 'T'. Stwórz konstruktor który przyjmuje jako parametr
// obiekt generyczny (przypisz jego wartość do pola). Dodaj getter oraz setter do klasy.
//  TODO:      * dodaj do klasy metodę "czyPudełkoJestPuste():boolean" która zwraca informację true -
// jeśli pudełko jest puste (czyli obiekt generyczny jest ==null) oraz
// false gdy nie jest puste (obiekt [pole] generyczne jest !=null).

import java.util.Optional;

public class Pudelko<T> {
    public static void main(String[] args) {
        String gruszka = null;
        Pudelko pudelko = new Pudelko(gruszka);
        System.out.println(pudelko.czyPudelkoPuste(pudelko));


    }

    private T zawartosc;

    public Pudelko() {
    }

    public Pudelko(T zawartosc) {
        this.zawartosc = zawartosc;
    }

    public T getZawartosc() {
        return zawartosc;
    }

    public void setZawartosc(T zawartosc) {
        this.zawartosc = zawartosc;
    }

    public <T> boolean czyPudelkoPuste(Pudelko pudelko) {

        if (zawartosc == null) {
            return true;
        } else return false;
    }

}
