package pl.sda.str99_Tablice;

//      Tablice –zadanie do wykonania
//        1.Utwórz tablicę liczb {1,3,5,10}
//        2.Wypisz wszystkie elementy po kolei
//        3.Wypisz elementy w pętli
//        4.Wypisz tylko liczby o parzystym indeksie
//        5.Wypisz tylko liczby parzyste
//        6.*Wypisz elementy w odwróconej kolejności

import java.util.Arrays;

public class Tablice {
    public static void main(String[] args) {
//        Zad. 1
        int[] tablica = new int[]{1,3,5,10,17,26,23};
//        Zad. 2
        System.out.println("**************Zadanie 2");
        System.out.println(Arrays.toString(tablica));
//        Zad. 3
        System.out.println("**************Zadanie 3:");
        for (int i=0;i<tablica.length; i++){
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
        System.out.println("**************Zadanie 4:");
//        Zad. 4
        for (int i = 0; i < tablica.length; i++) {
            if (i%2 == 0){
                System.out.println(tablica[i]);

            }
        }
        System.out.println();
        System.out.println("**************Zadanie 5:");
//        Zad. 5
        for (int i=0;i<tablica.length; i++){
            if (tablica[i] % 2 == 0)
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
        System.out.println("**************Zadanie 6:");
        for (int i=tablica.length-1; i>=0; i--){
            System.out.print(tablica[i] + " ");
        }

    }
}
