package pl.sda.divo.zad4;

//Wyświetl liczby od n do m (pobrane od użytkownika), oddzielone przecinkami, zakończone kropką.
//
//        1. Przedstaw opis słowny problemu
//        2. Przedstaw schemat blokowy
//        3. Zaimplementuj algorytm.
//
//        Rozwinięcie:
//        1. Sprawdź która z liczb jest większa i odpowiednio je ustaw.
//        2. Pobierz od użytkownika znaki, jakimi mają być oddzielone/zakończone liczby.
//        3. Pobierz od użytkownika początkową i końcową literę,
//           a następnie wyświetl litery pomiędzy oddzielone przecinkami. Na końcu nie może być przecinka.
//        4. Pobierz od użytkownika początkową i końcową literę,
//           a następnie wyświetl dowolne wyrazy zawierające się na wszystkie litery pomiędzy wybranymi.
//           Wyrazy oddzielone przecinkami, bez przecinka na końcu.
//***************************************************************************************************************

// 1.  Wyświetl liczby od n do m (pobrane od użytkownika), oddzielone przecinkami, zakończone kropką.
// 1a. Pobierz od użytkownika liczbą n oraz m
// 1b. Wyświetl n
// 1c. Wyświetl przecinek
// 1d. Wyświetl n + 1
// 1e. Dopóki n nie osiągnie wartości m wykonuj c - d

// 2.  Sprawdź która z liczb jest większa i odpowiednio je ustaw.
// 2a. Pobierz od użytkownika liczbą n oraz m
// 2b. Jeżeli n większe od m zamień m i n
// 2c. Wyświetl n
// 2d. Wyświetl przecinek
// 2e. Wyświetl n + 1
// 2f. Dopóki n nie osiągnie wartości m wykonuj c - d

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Character, String> words = new HashMap<>();
    static {
        words.put('a', "ala");
        words.put('b', "basia");
        words.put('c', "centymetr");
        words.put('d', "dziura");
        words.put('e', "efemeryda");
        words.put('f', "firanka");
        words.put('g', "granica");
        words.put('h', "himalaje");
        words.put('i', "igła");
        words.put('j', "java");
        words.put('k', "krzesło");
        words.put('l', "lampa");
        words.put('m', "matryca");
        words.put('n', "noga");
        words.put('o', "okno");
        words.put('p', "pająk");
        words.put('q', "quidith");
        words.put('r', "rakieta");
        words.put('s', "sam");
        words.put('t', "tynk");
        words.put('u', "ustawa");
        words.put('v', "version");
        words.put('w', "wzór");
        words.put('x', "xanth");
        words.put('y', "yc");
        words.put('z', "zaraz");
    }

    private void showIntegers1(int n, int m) {
        showIntegers3(n, m, ",", ".");
    }
    private void showIntegers2(int n, int m) {
        int a = n, b = m;
        if (n > m) {
            a = m;
            b = n;
        }
        showIntegers1(a, b);
    }
    private void showIntegers3(int a, int b, String glue, String suffix) {
        System.out.print(a);
        for (int i = a + 1; i <= b; i++) {
            System.out.print(glue + " ");
            System.out.print(i);
        }
        System.out.println(suffix);
    }
    private void showIntegers3(int n, int m) {
        for (int i = n; i <= m; i++) {
            System.out.print(i);
            if (i < m) {
                System.out.println(", ");
            } else {
                System.out.println(".");
            }
        }
    }
    private void showChars4(char a, char b) {
        for (char i = a; i < b; i++) {
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.print(b);
    }
    private void showChars5(char a, char b) {
        for (char i = a; i < b; i++) {
            System.out.print(words.get(i));
            System.out.print(", ");
        }
        System.out.print(words.get(b));
    }

    private void showChars6(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            System.out.print(words.get(word.charAt(i)));
            System.out.print(", ");
        }
        System.out.print(words.get((char)(word.length() - 1)));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Pierwsza liczba: ");
        int n = s.nextInt();
        System.out.print("Druga liczba: ");
        int m = s.nextInt();
        s.nextLine();

        Main main = new Main();
        System.out.println("--- Zadanie 1 ---");
        main.showIntegers1(n, m);
        System.out.println("\n--- Zadanie 2 ---");
        main.showIntegers2(n, m);
        System.out.println("\n--- Zadanie 3 ---");
        System.out.print("Znak pomiędzy: ");
        String glue = s.nextLine();
        System.out.print("Znak kończący: ");
        String suffix = s.nextLine();
        main.showIntegers3(n, m, glue, suffix);
        System.out.println("\n--- Zadanie 4 ---");
        System.out.print("Podaj pierwszą literę: ");
        char first = s.nextLine().charAt(0);
        System.out.print("Podaj ostatnią literę: ");
        char last = s.nextLine().charAt(0);
        main.showChars4(first, last);
        System.out.println("\n--- Zadanie 5 ---");
        main.showChars5(first, last);
    }
}