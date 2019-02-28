package pl.sda.zad1;

//      1. Stwórz statyczną metodę generyczną, która 10 razy wypisuje na ekran metodę toString podanego parametru
//          - obiektu podanego jako argument metody.
//        * stwórz metodę generyczną ze zmienną ilością argumentów (varargs) która wykonuje pętle przez
//          wszystkie obiekty z parametru i wypisuje je na ekran metodą toString().

public class Main {
    public static void main(String[] args) {
        Pies pies = new Pies("Burek", 3, "rudy");
        Pies pies2 = new Pies("a", 1, "a");
        Kot kot = new Kot("b", 2, "b");
        // bez kota
        method(pies, pies2);
    }

    public static <T extends Pies> void method(T... o) {
        for (T object : o) {
            for (int i = 0; i < 10; i++) {
                System.out.println(object.toString());
            }
        }
    }
}
