package pl.sda.komparator.zad2;

//2.  Stwórz klasę OfertaSprzedaży(String nazwaProduktu, int cena) a następnie stwórz komparator który
//    sortuje OfertySprzedaży po cenie rosnąco lub malejąco. Wskazówka : dodaj do klasy komparatora
//    dodatkowe pole (np. typu boolean) które w zależności od wartości inaczej sortuje obiekty.
//    W mainie stwórz kilka instancji klasy OfertaSprzedaży i dodaj je do Listy.
//    Po dodaniu posortuj listę i na ekran wypisz  wynik przed sortowaniem, oraz po sortowaniu.
//    Spróbuj również sortowania 'w drugą stronę'.

public class OfertaSprzedazy {
    private String nazwaProduktu;
    private int cena;

    public OfertaSprzedazy(String nazwaProduktu, int cena) {
        this.nazwaProduktu = nazwaProduktu;
        this.cena = cena;
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public int getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return "OfertaSprzedazy{" +
                "nazwaProduktu='" + nazwaProduktu + '\'' +
                ", cena=" + cena +
                '}';
    }
}
