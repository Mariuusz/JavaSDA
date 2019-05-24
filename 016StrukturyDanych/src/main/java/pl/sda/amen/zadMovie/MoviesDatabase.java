package pl.sda.amen.zadMovie;

//        - jako pole posiada mapę filmów. Mapa powinna mapować z wartości typu String
//          (będzie to nazwa filmu) na model (na obiekty klasy Movie)
//        - stwórz metodę dodawania do bazy danych filmów ( addMovie(Movie m)) która dodaje do mapy film
//        - stwórz metodę wyszukiwania filmów z bazy danych, która przyjmuje jako parametr nazwę filmu,
//          a zwraca film który jest w bazie danych pod tą nazwą.
//        - stwórz metodę wypisywania wszystkich filmów. Metoda powinna iterować po wartościach mapy i
//          wypisywać informacje o filmie (nadpisz metodę toString w klasie ...[wiesz jakiej?]). metoda printAllMovies().
//        - stwórz metodę o tej samej nazwie co powyższa, która przyjmuje jako parametr typ filmu (MovieType) i
//          również iteruje wartości, jedak wypisuje tylko te filmy których MovieType odpowiada temu podanemu jako parametr.

import java.util.*;
import java.util.stream.Collectors;

public class MoviesDatabase {
    private Map<String, Movie> filmy = new HashMap<>();

    public MoviesDatabase() {
    }

    public void dodajFilm(Movie filmDoDodania) {
        filmy.put(filmDoDodania.getTytul(), filmDoDodania);
    }

    public Optional<Movie> wyszukajFilm(String nazwaFilmu) {
        Movie film = filmy.get(nazwaFilmu);
        // jeśli zastosujemy Optional.of, to rzuci nam NullPointerException jeśli nie znajdzie elementu
        return Optional.ofNullable(film);
    }

    public void wypiszWszystkieFilmy() {
        for (Movie film : filmy.values()) {
            System.out.println(film);
        }
    }

    public List<Movie> znajdzFilmyTypu(MovieType typ) {
//        List<Movie> filmy = new ArrayList<>();
//
//        for (Movie film : filmy.values()) {
//            if(film.getType() == typ){
//                filmy.add(film);
//            }
//        }
//        return filmy;
        return filmy.values().stream()
                .filter(film -> film.getType() == typ)
                .collect(Collectors.toList());
    }
}