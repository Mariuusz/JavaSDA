package pl.sda.zadania001_2;

//      5. Napisać program pobierający od użytkownika dwie liczby całkowite A oraz B, A < B,
//        a następnie wyznaczający sumę ciągu liczb od A do B, czyli sumę ciągu (A,A +
//        1,...,B). Obliczenia należy wykonać dwukrotnie stosując kolejno pętle: while, for.
//        Przykład: Dla A = 4 i B = 11 program powinien wyświetlić: 60 60

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj A");
        int a = scanner.nextInt();
        System.out.println("Podaj B");
        int b = scanner.nextInt();

        int c = a;
        int wynik = 0;
        while (c <= b) {
            wynik = wynik + c;
            c++;
        }
        System.out.println(wynik);

        int wynik2 = 0;
        for (int i = a; i <= b; i++) {
            wynik2 += i;
        }
        System.out.println(wynik2);

    }
}
