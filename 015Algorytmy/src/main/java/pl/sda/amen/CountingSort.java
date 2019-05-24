package pl.sda.amen;

public class CountingSort {
    public static void sort(int[] tablica) {
        int licznikOperacji = 0;

        // tablica ma 1000 elementów
        // odgórny zakres - > 255
        int[] ilościLiczb = new int[11];

        // i = 1000
        for (int i = 0; i < tablica.length; i++) {
            licznikOperacji++;

            int wartośćWTablicy = tablica[i];
            ilościLiczb[wartośćWTablicy]++;
        }

        int pozycjaWstawiania = 0;
        // n operacji
        for (int j = 0; j < ilościLiczb.length; j++) {
            // j = wstawiam tą liczbę
            for (int i = 0; i < ilościLiczb[j]; i++) {
                licznikOperacji++;

                tablica[pozycjaWstawiania] = j;
                pozycjaWstawiania++;
            }
        }

        System.out.println("Licznik: " + licznikOperacji);
    }
}