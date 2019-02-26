package pl.sda.str7_DodParametrami;

//        1.Utworz klasę DodawanieParametrami
//        2.Utwórz metodę psvm
//        3.Zsumuj otrzymane na wejściu liczby
//              1. Utwórz metodę zamienNaLiczby(String [] znaki):int[]
//              2. Skorzystaj z metody Integer.parseInt(String str);
//        4. Wyświetl wynik : Suma wprowadzonych liczb to {wynik}
//        5. Uruchom program z IntelliJ
//        6. * Dodaj program do artefaktów
//        7. * Zbuduj archiwum jar
//        8. * Przetestuj w konsoli


public class DodawanieParametrami {
    public static void main(String[] args) {
        System.out.println("Zamieniam na liczby...");
        int[] liczby = zamienNaLiczby(args);
        System.out.println("Sumuję liczby...");
        int suma = 0;
        for (int liczba:liczby){
            suma += liczba;
        }
        System.out.printf("Suma wprowadzonych liczb to %d", suma);
    }

    private static int[] zamienNaLiczby(String[] args) {       // z VarArgsami też chyba działa Strng...
        int[] liczby = new int[args.length];
        for (int i=0; i<liczby.length; i++){
            liczby[i] = Integer.parseInt(args[i]);
        }
        return liczby;
    }
}