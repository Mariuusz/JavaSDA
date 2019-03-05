package pl.sda.zad5;

//Stwórz klasę Student która posiada pola:
//        nr indeksu
//        imie
//        nazwisko
//        płeć (wartość enum)
//
//        W mainie stwórz instancję kolekcji typu ArrayList, która zawiera obiekty klasy Student.
//        Dodaj do kolekcji kilku studentów (dodaj je ręcznie - wpisz cokolwiek).
//
//        a. Spróbuj wypisać elementy listy stosując zwykłego "sout'a"
//        b. Spróbuj wypisać elementy stosując pętlę foreach
//        c. Wypisz tylko kobiety
//        d. Wypisz tylko mężczyzn
//        e. Wypisz tylko indeksy osób

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studenci = new ArrayList<Student>();
        studenci.add(new Student(125414, "Stefan", "Wolski", Plec.mezczyzna));
        studenci.add(new Student(123410, "Jan", "Kowalski", Plec.mezczyzna));
        studenci.add(new Student(125400, "Anna", "Nowak", Plec.kobieta));

        System.out.println(studenci);
        for (Student student : studenci) {
            System.out.println(student);
        }
        for (Student student : studenci) {
            if (student.getPlec() == Plec.kobieta) {
                System.out.println(student);
            }
        }
        for (Student student : studenci) {
            System.out.println(student.getNrIndeksu());
        }
    }
}
