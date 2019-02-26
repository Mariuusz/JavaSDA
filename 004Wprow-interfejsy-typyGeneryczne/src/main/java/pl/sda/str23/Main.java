package pl.sda.str23;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Nowak", 128414);
        Student student2 = new Student("Andrzej", "Kosowski", 138414);
        Student student3 = new Student("Zdzisław", "Kowalski", 129414);
        Student student4 = new Student("Henryk", "Karpiuk", 121414);

        Student[] ludzie = new Student[]{student1,student2,student3,student4};

        wyswietl(ludzie);
        System.out.println("Sortowanie");
        Arrays.sort(ludzie);
        wyswietl(ludzie);
    }
    private static void wyswietl(Student[] studenci){
        for (Student ludek:studenci) {
            System.out.println(ludek);
        }
    }
}
