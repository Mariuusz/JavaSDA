package pl.sda.amen;

import java.util.Arrays;

public class MergeSort {
    private static int licznik = 0;

    public static void sort(int[] tablica) {
        mergeSort(tablica, 0, tablica.length - 1);

        System.out.println("Licznik: " + licznik);
    }

    public static void mergeSort(int[] tablica, int from, int to) {
        System.out.println("Merge - podział " + from + " " + to);
        if (from == to) {
            // jeśli pozostał nam jeden element, to cofamy się
            // i wracamy by łączyć tablice
            System.out.println("Element " + from + " powrót!");
            return;
        }

        // 0 + 9 / 2 = 4
        int indexSrodkowy = (from + to) / 2;

        // podział lewej strony, od elementu from, do srodka
        mergeSort(tablica, from, indexSrodkowy);

        // podział prawej strony, od elementu srodkowego+1 do konca.
        mergeSort(tablica, indexSrodkowy + 1, to);

        System.out.println("Scalam elementy od " + from + " do " + to);
        // scalamy podzielone wcześniej tablice
        scal(tablica, from, indexSrodkowy, to);
    }

    private static void scal(int[] tablica, int from, int indexSrodkowy, int to) {

        int[] kopia = Arrays.copyOf(tablica, tablica.length);

        int indexPrawy = indexSrodkowy + 1;
        int indexLewy = from;

        // indeks pod który będziemy wstawiać elementy po sprawdzeniu
        int indeksWstawiania = from;

        // (indexLewy != indexSrodkowy + 1) - warunek sprawdzający czy jest coś w lewej tablicy
        // indexPrawy <= to - waruenk sprawdzający czy jest coś w prawej tablicy
        while ((indexLewy != indexSrodkowy + 1) && indexPrawy <= to) {
            licznik++;
            if (kopia[indexLewy] < kopia[indexPrawy]) {
                tablica[indeksWstawiania] = kopia[indexLewy++];
            } else {
                tablica[indeksWstawiania] = kopia[indexPrawy++];
            }
            indeksWstawiania++;
        }

        while ((indexLewy != indexSrodkowy + 1)) {
            licznik++;
            tablica[indeksWstawiania++] = kopia[indexLewy++];
        }

        while (indexPrawy <= to) {
            licznik++;
            tablica[indeksWstawiania++] = kopia[indexPrawy++];
        }
    }
}