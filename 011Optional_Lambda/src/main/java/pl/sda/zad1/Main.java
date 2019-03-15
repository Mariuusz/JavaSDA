package pl.sda.zad1;

//1.Napisz klasę person, która ma pola: firstName, lastName, age oraz isMale.
//        Mając listę osób i korzystając ze streamów:
//        a) uzyskaj listę mężczyzn
//        b) uzyskaj listę dorosłych kobiet (filter)
//        c) uzyskaj Optional<Person> z dorosłym Jackiem findAny/findfirst
//        d) uzyskaj listę wszystkich nazwisk osób, które są w przedziale wiekowym: 15-19 (filter)
//        e)* uzyskaj sumę wieku wszystkich osób (sum)
//        f)* uzyskaj średnią wieku wszystkich mężczyzn (average)
//        g)** znajdź nastarszą osobę w liście (findFirst)

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private List<Person> people = new ArrayList<>();

    public Main(List<Person> people) {
        this.people = people;
    }

    public static void main(String[] args) {

        Person person1 = new Person("Joanna", "Nowak", 17, false);
        Person person2 = new Person("Jan", "Nowak", 20, true);
        Person person3 = new Person("Piotr", "Kowalski", 23, true);
        Person person4 = new Person("Alicja", "Kowalska", 21, false);
        Person person5 = new Person("Jacek", "Kowal", 25, true);
        Person person6 = new Person("Jacek", "Pstryk", 37, true);
        List<Person> peopleList = new ArrayList<Person>(Arrays.asList(person1, person2, person3, person4, person5, person6));

        Main people = new Main(peopleList);

//        System.out.println(people.onlyManList());
//        System.out.println(people.adultsFamaleList());
//        System.out.println(people.optionalAdultJacek());
//        System.out.println(people.getPeopleYoungerThan19AndOlderThan15());
//        System.out.println(people.getSumAllPeopleAge());
//        System.out.println(people.getAvaragePeopleAge());
//        System.out.println(people.theOldest());

    }

    public List<Person> onlyManList() {
        return people.stream()
                .filter(person -> person.isMale())
                .collect(Collectors.toList());
    }

    public List<Person> adultsFamaleList() {
        return people.stream()
                .filter(person -> !person.isMale() && person.getAge() >= 18)
                .collect(Collectors.toList());
    }

    public Optional<Person> optionalAdultJacek() {
        return people.stream()
                .filter(person -> person.getAge() >= 18 && person.getFirstName().equals("Jacek"))
                .findFirst();
    }

    public List<Person> getPeopleYoungerThan19AndOlderThan15() {
        return people.stream()
                .filter(person -> person.getAge() <= 19 && person.getAge() >= 15)
                .collect(Collectors.toList());
    }

    public int getSumAllPeopleAge() {
        return people.stream()
                .mapToInt(person -> person.getAge()).sum();
    }

    //    public int getSumAllPeopleAge(){
//        return people.stream()
//                .mapToInt(Person::getAge).sum();
//    }
    public OptionalDouble getAvaragePeopleAge() {
        return people.stream()
                .mapToDouble(p -> p.getAge()).average();
    }
//    public double getAvaragePeopleAge(List<Person> people){
//        return people.stream().collect(Collectors.averagingInt(u -> u.getAge()));
//    }

    public Optional<Person> theOldest() {
        Optional<Person> theOldest = people.stream()
                .sorted((o2, o1) -> Integer.compare(o1.getAge(), o2.getAge()))
                .findFirst();
        return theOldest;
    }
//    public Person getOldestPerson(List<Person> persons){
//        return persons.stream().max(Comparator.comparingInt(Person::getAge)).get();
//    }
}