package pl.sda.divo.zad18;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteka {
    private AutorzyFasada autorzyFasada = new AutorzyFasada();
    private KsiazkiFasada ksiazkiFasada = new KsiazkiFasada();

    public List<Author> getAuthors() {
        Map<String, List<Book>> mappedBooks = mapBooks();
        List<Author> mappedAuthors = mapAuthors();

        List<Author> authors = new ArrayList<>();

        for (Author author : mappedAuthors) {
            Author tmp = new Author(author.getId(), author.getName(), author.getSurname());
            if (mappedBooks.containsKey(author.getId())) {
                tmp.getKsiazki().addAll(mappedBooks.get(author.getId()));
            }
            authors.add(tmp);
        }

        return authors;
    }
    private List<Author> mapAuthors() {
        List<Map<String, String>> autorzy = autorzyFasada.pobierzAutorow();
        List<Author> autorList = new ArrayList<>();
        for (Map<String, String> map : autorzy) {
            autorList.add(new Author(
                    map.get(AutorzyFasada.AUTHORS_KEYS.ID.getValue()),
                    map.get(AutorzyFasada.AUTHORS_KEYS.NAME.getValue()),
                    map.get(AutorzyFasada.AUTHORS_KEYS.SURNAME.getValue())
            ));
        }

        return autorList;
    }

    private Map<String, List<Book>> mapBooks() {
        List<Map<String, String>> ksiazki = ksiazkiFasada.pobierzKsiazki();
        Map<String, List<Book>> mappedBooks = new HashMap<>();
        for (Map<String, String> map : ksiazki) {
            String authorId = map.get(KsiazkiFasada.BOOKS_KEYS.AUTHOR.getValue());
            if (!mappedBooks.containsKey(authorId)) {
                mappedBooks.put(authorId, new ArrayList<>());
            }

            List<Book> oldBooks = mappedBooks.get(authorId);
            oldBooks.add(new Book(
                    map.get(KsiazkiFasada.BOOKS_KEYS.TITLE.getValue()),
                    map.get(KsiazkiFasada.BOOKS_KEYS.CENA.getValue())
            ));
        }

        return mappedBooks;
    }
}