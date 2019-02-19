package pl.sda.zadania001_3;

//      1. Napisz program symulujący grę w Lotto:
//        a. Użytkownik typuje 6 cyfr
//        b. Program losuje 6 cyfr z liczb od 1 do 49
//        c. Program wypisuje na ekranie wytypowane przez użytkownika cyfry
//        d. Program wypisuje na ekranie wylosowane cyfry
//        e. Program wyświetla wynik użytkownika w poniższej formie:
//        i. Trafiono n z 6 cyfr
//        f. *Upewnij się że użytkownik podaje 6 różnych liczb
//        g. *Upewnij się, że maszyna losująca generuje 6 różnych liczb
//        h. ! Skorzystaj z klasy java.util.Random

import java.util.Random;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        int[] tablicaLotto = getNumbersFromUser();
        int[] wylosowaneLiczby = new int[6];

        System.out.println("Wylosowane liczby");
        for(int i = 0; i < 6; i++){
            int liczba = generateRandom();
            System.out.print( liczba+ " ");
            wylosowaneLiczby[i] = liczba;
        }

        System.out.println();
        System.out.println("Wytypowales liczby");
        for( int i: tablicaLotto){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Trafiles " + compareTable(wylosowaneLiczby,tablicaLotto));

    }


    private static int generateRandom(){
        Random random = new Random();
        int[] randomNuberstable = new int[6];
        int generatedNumber;

        do{
            generatedNumber = random.nextInt(49)+1;

        }while(isUnique(generatedNumber,randomNuberstable));

        return generatedNumber;
    }



    private static int[] getNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);
        int[] tablicaLotto = new int[6];
        int pointedNumber;

        for(int i = 0; i < 6; i++){
            do {
                System.out.println("Podaj " + ((int) i + 1) + " liczbe, nie moze sie powtazac");
                pointedNumber = scanner.nextInt();

            }while(isUnique(pointedNumber,tablicaLotto));

            tablicaLotto[i] = pointedNumber;
        }
        return tablicaLotto;
    }

    private static int compareTable(int[] generated, int[] pointed){
        int ile = 0;
        for(int i = 0; i < generated.length; i++){
            for(int j = 0; j < pointed.length;j++){
                if (generated[i] == pointed[j]){
                    ile++;
                }

            }
        }
        return ile;
    }

    private static boolean isUnique(int liczba, int[] tab){
        for(int i = 0; i < tab.length;i++){
            if(tab[i] == liczba) return true;
        }
        return false;
    }
}