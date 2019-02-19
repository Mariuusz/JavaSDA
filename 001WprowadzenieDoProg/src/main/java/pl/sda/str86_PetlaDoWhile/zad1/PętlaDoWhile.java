package pl.sda.str86_PetlaDoWhile.zad1;

//Napisz program, który wypisuje wszystkie liczby mniejsze od zadanej od użytkownika
// dopóki użytkownik wpisuje liczby większe od 0

import java.util.Scanner;

public class PętlaDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę większą od zera(x<0 powoduje koniec programu)");
        int x = scanner.nextInt();
        int wynik = 0;

        do{
            System.out.println(wynik);
            wynik++;
        }while (x>0 && wynik!=x);

    }
}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int licznik;
//
//        do {
//            System.out.println("Podaj liczbę");
//            licznik = scanner.nextInt();
//            for(int i=1; i<licznik; i++)
//                System.out.println(i);
//
//        }while(licznik!=0);
//    }
//}