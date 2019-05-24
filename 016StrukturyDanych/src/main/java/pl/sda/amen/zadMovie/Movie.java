package pl.sda.amen.zadMovie;

import java.time.LocalDate;

public class Movie {
    private String tytul;
    private String autor;
    private MovieType type;
    private LocalDate dataWydania;

    public Movie(String tytul, String autor, MovieType type, LocalDate dataWydania) {
        this.tytul = tytul;
        this.autor = autor;
        this.type = type;
        this.dataWydania = dataWydania;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public MovieType getType() {
        return type;
    }

    public void setType(MovieType type) {
        this.type = type;
    }

    public LocalDate getDataWydania() {
        return dataWydania;
    }

    public void setDataWydania(LocalDate dataWydania) {
        this.dataWydania = dataWydania;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "tytul='" + tytul + '\'' +
                ", autor='" + autor + '\'' +
                ", type=" + type +
                ", dataWydania=" + dataWydania +
                '}';
    }
}