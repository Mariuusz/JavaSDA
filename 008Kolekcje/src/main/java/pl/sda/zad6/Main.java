package pl.sda.zad6;

//Stwórz aplikację, a w niej klasę Dziennik i student . Stwórz również klasę Student. Klasa Student powinna:
//        - posiadać listę ocen studenta (List<Double>)
//        - posiadać (pole) numer indeksu studenta (String)
//        - posiadać (pole) imię studenta
//        - posiadać (pole) nazwisko studenta
//
//        Klasa Dziennik powinna:
//        - posiadać (jako pole) listę Studentów.
//        - posiadać metodę 'dodajStudenta(Student):void' do dodawania nowego studenta do dziennika
//        - posiadać metodę 'usuńStudenta(Student):void' do usuwania studenta
//        - posiadać metodę 'usuńStudenta(String):void' do usuwania studenta po jego numerze indexu
//        - posiadać metodę 'zwróćStudenta(String):Student' która jako parametr przyjmuje numer indexu studenta, a w wyniku zwraca konkretnego studenta.
//        - posiadać metodę 'podajŚredniąStudenta(String):double' która przyjmuje indeks studenta i zwraca średnią ocen studenta.
//        - posiadać metodę 'podajStudentówZagrożonych():List<Student>'
//        - posiadać metodę 'posortujStudentówPoIndeksie():List<Student>' - która sortuje listę studentów po numerach indeksów, a następnie zwraca posortowaną listę.
//
//
//        Polecenia VarArgs:
//        dodanie kilku studentów
//        usunięcie kilku studentów
//        wyszukiwanie studentów (i zwrócenie znalezionych w liście)
//        dodanie/usuwanie ocen studentom
//        Wszystkie polecenia zrealizowane jako VarArgs.

public class Main {
    public static void main(String[] args) {
        Student student = new Student("125414","Jan","Nowak");
        Student student2 = new Student("125413","Adrian","Kowalski");
        Student student3 = new Student("125416","Tymoteusz","Prypec");
        Student student4 = new Student("125419","Mariola","Sztok");
        Student student5 = new Student("125417","Joanna","Nowak");
        Student student6 = new Student("125411","Janina","Kowalska");

        student.dodajOcene(3.5,5.0,4.0,6.0,3.5);
        student2.dodajOcene(2.5,5.0,4.0,6.0,3.5);
        student3.dodajOcene(1.0,5.0,4.0,6.0,3.5);
        student4.dodajOcene(1.0,3.5,5.0,4.0,6.0,3.5);
        student5.dodajOcene(2.0,3.5,5.0,4.0,6.0,3.5);
        student6.dodajOcene(2.0,3.5,5.0,4.0,6.0,3.5);

        Dziennik dziennik = new Dziennik();
        dziennik.dodajStudenta(student);
        dziennik.dodajStudenta(student2);
        dziennik.dodajStudenta(student3);
        dziennik.dodajStudenta(student4);
        dziennik.dodajStudenta(student5);
        dziennik.dodajStudenta(student6);


        System.out.println(dziennik.podajStudentówZagrożonych());

        dziennik.usunStudenta("125411","125417");
        dziennik.usunStudenta(student4,student3);

        System.out.println(dziennik.getListaStudentow());
        System.out.println("Srednia studenta o indeksie 125414: " + dziennik.podajŚredniąStudenta("125414"));

        System.out.println(dziennik.zwrocStudenta("125414"));
//        System.out.println(dziennik.posortujPoIndeksie());

    }
}
