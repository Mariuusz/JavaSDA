package pl.sda.zadania001_1;

import java.util.Scanner;

//      14. Napisz aplikację która dla podanej wartości przez użytkownika:
//        a. zwraca jej wartość bezwzględną.
//        b. zwraca jej wartość przeciwną
//        c. zwraca jej wartość odwrotną
public class zad14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę");
        float liczba = scanner.nextFloat();
        float a = liczba;
        if (a<0){
            a=a * -1;
        }
        System.out.println(a);
        float b = liczba * -1;
        System.out.println(b);
        float c = 1/liczba;
        System.out.println(c);

    }
}
