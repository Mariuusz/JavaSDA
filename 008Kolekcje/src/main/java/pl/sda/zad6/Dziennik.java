package pl.sda.zad6;

//        Klasa Dziennik powinna:
//        - posiadać (jako pole) listę Studentów.
//        - posiadać metodę 'dodajStudenta(Student):void' do dodawania nowego studenta do dziennika
//        - posiadać metodę 'usuńStudenta(Student):void' do usuwania studenta
//        - posiadać metodę 'usuńStudenta(String):void' do usuwania studenta po jego numerze indexu
//        - posiadać metodę 'zwróćStudenta(String):Student' która jako parametr przyjmuje numer indexu studenta,
// a w wyniku zwraca konkretnego studenta.
//        - posiadać metodę 'podajŚredniąStudenta(String):double' która przyjmuje indeks studenta
// i zwraca średnią ocen studenta.
//        - posiadać metodę 'podajStudentówZagrożonych():List<Student>'
//  TODO:      - posiadać metodę 'posortujStudentówPoIndeksie():List<Student>' - która sortuje listę studentów
// po numerach indeksów, a następnie zwraca posortowaną listę.
//
//
//        Polecenia VarArgs:
//        dodanie kilku studentów
//        usunięcie kilku studentów
//        wyszukiwanie studentów (i zwrócenie znalezionych w liście)
//        dodanie/usuwanie ocen studentom
//        Wszystkie polecenia zrealizowane jako VarArgs.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dziennik {
    private List<Student> listaStudentow = new ArrayList<Student>();

    public Dziennik(List<Student> listaStudentow) {
        this.listaStudentow = listaStudentow;
    }

    public Dziennik() {
    }

    public List<Student> getListaStudentow() {
        return listaStudentow;
    }

    public void dodajStudenta(Student... student) {
        for (Student st : student) {
            listaStudentow.add(st);
        }
    }

    public void usunStudenta(Student... student) {
        for (Student st : student) {
            listaStudentow.remove(st);
        }
    }

    public void usunStudenta(String... nrIndeksu) {
        List<Student> kopia = new ArrayList<Student>(listaStudentow);
        for (String nr : nrIndeksu) {
            for (Student student : kopia) {
                if (student.getNrIndeksu().equals(nr)) {
                    listaStudentow.remove(student);
                }
            }
        }
    }

    public List<Student> zwrocStudenta(String... nrIndeksu) {
        List<Student> zwrocStudenow = new ArrayList<Student>();
        for (String nr : nrIndeksu) {
            for (Student student : listaStudentow) {
                if (nr == student.getNrIndeksu()) {
                    zwrocStudenow.add(student);
                }
            }
        }
        return zwrocStudenow;
    }

    public double podajŚredniąStudenta(String nrIndeksu) {
        double srednia = 0;
        for (Student student : listaStudentow) {
            if (nrIndeksu == student.getNrIndeksu()) {
                srednia = student.sredniaStudenta();
            }
        }
        return srednia;
    }
    public List<Student> podajStudentówZagrożonych(){
        List<Student> zwrocStudenowZagrozonych = new ArrayList<Student>();
        for (Student student: listaStudentow){
            if (student.getListaOcenStudenta().contains(1.0) || student.getListaOcenStudenta().contains(2.0)){
                zwrocStudenowZagrozonych.add(student);
            }

        }
        return zwrocStudenowZagrozonych;
    }
//    public List<Student> posortujPoIndeksie(){
////        listaStudentow.sort();
//        List<Student> sortowanieWgIndeksu = new ArrayList<Student>();
//        List<Integer> indeksy = new ArrayList<Integer>();
//        for (Student student:listaStudentow){
//            indeksy.add(Integer.valueOf(student.getNrIndeksu()));
//            Collections.sort(indeksy);
//            for (int i=0; i<indeksy.size();i++){
//                if (indeksy.get(i) == Integer.valueOf(student.getNrIndeksu())) {
//                    sortowanieWgIndeksu.add(student);
//                }
//            }
//        }
//        return sortowanieWgIndeksu;
//    }

}
