package pl.sda.divo.zad18;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
class Author {
    String id;
    String name;
    String surname;

    List<Book> ksiazki = new ArrayList<>();

    public Author(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public boolean isPopular() {
        if (ksiazki.size() >= 5) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "(" + id + ')' + name + ' ' + surname + ": " + ksiazki + "\n";
    }
}