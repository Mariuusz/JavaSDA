package pl.sda.amen;

public class InsertionSort {
    public static void sort(int[] tablica) {

        int licznik = 0;

        // rozpoczynamy od 2 elementu o indeksie 1
        for (int i = 1; i < tablica.length; i++) {
            int klucz = tablica[i];

            int j = i - 1;
            while (true) {
                licznik++;
                if (j >= 0 && klucz < tablica[j]) {
                    tablica[j + 1] = tablica[j];
                    j--;
                } else {
                    break;
                }
            }
            tablica[j + 1] = klucz;
        }
        System.out.println("Licznik: " + licznik);
    }
}