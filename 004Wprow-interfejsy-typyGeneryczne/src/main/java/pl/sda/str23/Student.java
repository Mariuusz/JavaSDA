package pl.sda.str23;

//        1.Utwórz klasę Student
//        2.Nadaj następujące atrybuty: Imie, Nazwisko, numer albumu
//        3.Zaimplementuj interfejs Comparable, tak aby sortować studentów odnajmniejszego numeru indeksu do największego
//        4.W metodzie psvmutwórz kilka obiektów typu Student i dodaj do tablicy
//        5.Wyświetl Studentów przed i po sortowaniu
//        6.* Zrób odwrotne sortowanie

public class Student implements Comparable {
    private String imie;
    private String nazwisko;
    private Integer nrAlbumu;

    public Student(String imie, String nazwisko, Integer nrAlbumu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrAlbumu = nrAlbumu;
    }

    @Override
    public int compareTo(Object o) {
        Student that = (Student)o;

        return nrAlbumu.compareTo(that.nrAlbumu);
//        return nrAlbumu.compareTo(that.nrAlbumu);
    }

    @Override
    public String toString() {
        return String.format("%s ,%s ,%d  ", imie,nazwisko,nrAlbumu);
    }
}
