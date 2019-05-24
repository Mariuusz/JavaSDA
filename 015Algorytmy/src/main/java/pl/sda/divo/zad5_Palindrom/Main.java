package pl.sda.divo.zad5_Palindrom;

//Przygotuj algorytm wyświetlający palindrom, czyli liczbę, która czytana od tyłu będzie taka sama jak od przodu.
//
//        1. Przedstaw opis słowny problemu
//        2. Przedstaw schemat blokowy
//        3. Zaimplementuj algorytm.
//
//        Rozwinięcie:
//        2. Z wykorzystaniem jednej pętli
//        3. Sprawdź czy napisy są palindromami
//        - mozejutrotadamadatortujezom
//        - mozejutrotaadamadatortujezom
//***************************************************************************************************************
// 1.  Palindrom
// 1a. Pobierz od użytkownika jaką cyfrą ma się rozpocząć (n)
// 1b. Pobierz od użytkownika ile cyfr ma wyświetlić (m)
// 1c. Ustaw zmienną pomocniczą k = n + m, do której liczby ma rosnąć
// 1c. Wyświetl po kolei cyfry od n do k
// 1d. wyświetl cyfry od k - 1 do n

// 2.  Palindrom z jedną pętlą
// 1a. Pobierz od użytkownika jaką cyfrą ma się rozpocząć (n)
// 1b. Pobierz od użytkownika ile cyfr ma wyświetlić (m)
// 1c. Ustaw zmienną pomocniczą k = n + (m * 2), która mówi ile ma być wszystkich liczb w palindromie
// 1d. Ustaw zmienną pomocniczą l = n + m, reprezentującą indeks największej cyfry w palindromie
// 1e. Jeżeli aktualny element <= m, wyświetl aktualny element
// 1f. Jeżeli aktualny element > m, wyświetl l - aktualny element

public class Main {
    private void palindrom1(int n, int m) {
        int k = n + m;
        for (int i = n; i <= k; i++) {
            System.out.print(i);
            System.out.print(", ");
        }
        for (int i = k - 1; i >= n; i--) {
            System.out.print(i);
            System.out.print(", ");
        }
    }
    private void palindrom2(int n, int m) {
        int k = n + (m * 2);// 20
        int l = n + m; // 15
        for (int i = n; i <= k; i++) {
            System.out.printf("%d, ", (i > l) ? l * 2 - i : i);
        }
    }
    public boolean isPalindrom(char[] word){
        int i1 = 0;
        int i2 = word.length - 1;
        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 10;
        int m = 5;
        String palindrom = "mozejutrotadamadatortujezom";
        String notPalindrom = "mozejutrotaadamadatortujezom";

        Main main = new Main();
        System.out.println("--- Palindrom 1");
        main.palindrom1(n, m);
        System.out.println("\n--- Palindrom 2");
        main.palindrom2(n, m);
        System.out.println("\n--- Czy palindrom1: " + main.isPalindrom(palindrom.toCharArray()));
        System.out.println("--- Czy palindrom2: " + main.isPalindrom(notPalindrom.toCharArray()));
    }
}