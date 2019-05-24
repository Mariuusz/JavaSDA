package pl.sda.amen;

public class QuickSort {
    public static void sort(int[] tablica) {
        quick(tablica, 0, tablica.length - 1);
    }

    public static void quick(int[] tablica, int from, int to) {
        int pivot = tablica[((from + to) / 2)];

        int lewy = from;
        int prawy = to;

        do {
            // szuka większych elementów
            while (tablica[lewy] < pivot) {
                // przesuwam się od lewej w prawo
                lewy++;
            }
            // szukamy mniejszych elementów
            while (tablica[prawy] > pivot) {
                // przesuwam się od prawej w lewo
                prawy--;
            }
            // jeśli znaleźliśmy elementy, to zamieniamy je miejscami
            if (lewy <= prawy) {
                int tymczasowy = tablica[lewy];
                tablica[lewy] = tablica[prawy];
                tablica[prawy] = tymczasowy;
                lewy++;
                prawy--;
            }
        } while (lewy <= prawy);

        // podtablica od początku do punktu podziału
        if (prawy > from) {
            // wchodzimy rekurencyjnie w sortowanie quicksort
            quick(tablica, from, prawy);
        }

        // podtablica od punktu podziału do końca
        if (lewy < to) {
            // wchodzimy rekurencyjnie w sortowanie quicksort
            quick(tablica, lewy, to);
        }
    }
}
