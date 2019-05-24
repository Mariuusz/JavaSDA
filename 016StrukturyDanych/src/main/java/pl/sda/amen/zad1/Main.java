package pl.sda.amen.zad1;

//1.	Stwórz klasę Student która posiada pola:
//        nr indeksu
//        imie
//        nazwisko
//        płeć
//
//        Stwórz instancję kolekcji typu ArrayList, która zawiera obiekty klasy Student
//        w mainie dodaj do kolekcji kilku studentów (dodaj je ręcznie - wpisz cokolwiek).
//
//        1. Spróbuj wypisać elementy listy stosując zwykłego "sout'a"
//        2. Spróbuj wypisać elementy(Studentów) stosując pętlę foreach
//        3. Stwórz metodę statyczną, która jako parametr przyjmuje listę studentów oraz numer indeksu studenta.
//           W metodzie wykonaj obieg pętli przez listę studentów i spróbuj odnaleźć studenta z wybranym numerem indeksu.
//           Po odnalezieniu studenta wypisz informacje o nim.
//        4. Dodaj do klasy student pole : ocenyWIndeksie. Pole jest listą która przechowuje wartości typu Double.
//           W metodzie main każdemu studentowi dodaj kilka ocen.
//        5. W klasie Student dodaj metodę 'obliczSredniaStudenta():double' która zwraca średnią ocen tego studenta.
//        6. W klasie Student dodaj metodę 'czyStudentZdał():boolean która zwraca true jeśli student
// zaliczył wszystkie przedmioty (nie ma żadnej dwójki) lub false jeśli nie udało mu się zaliczyć
// któregokolwiek z przedmiotów.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(123123,"Jan", "Nowak", Plec.MĘZCZYZNA);
        Student student2 = new Student(123124,"Anna", "Nowak", Plec.KOBIETA);
        Student student3 = new Student(123153,"Andrzej", "Kowalski", Plec.MĘZCZYZNA);
        Student student4 = new Student(123773,"Rafał", "Kowal", Plec.MĘZCZYZNA);
        Student student5 = new Student(123193,"Dawid", "Lewandowski", Plec.MĘZCZYZNA);
        Student student6 = new Student(123191,"Daria", "Lewandowska", Plec.KOBIETA);

        List<Student> lista = new ArrayList<>();
        lista.add(student1);
        lista.add(student2);
        lista.add(student3);
        lista.add(student4);
        lista.add(student5);
        lista.add(student6);

//        System.out.println(lista);
//        for (Student s:lista){
//            System.out.println(s);
//        }
//        pokazStudenta(lista,123773);




    }
    public static void pokazStudenta(List<Student> lista, int nrIndeksu){
        for (Student s:lista){
            if (s.getNrIndeksu() == nrIndeksu){
                System.out.println(s);
            }
        }
    }
}
