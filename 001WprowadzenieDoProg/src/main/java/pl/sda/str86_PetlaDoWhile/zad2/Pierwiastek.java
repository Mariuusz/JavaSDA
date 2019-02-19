package pl.sda.str86_PetlaDoWhile.zad2;

//Napisz program, który oblicza wartość pierwiastka z wprowadzonej przez użytkownika liczby,
// dopóki ta przyjmuje wartości większe od 0 (dla uproszczenia przyjmij że użytkownik wprowadza liczby całkowite)

import java.util.Scanner;

public class Pierwiastek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba;

        do {
            System.out.println("Podaj liczbę, dla której chcesz obliczyć pierwiastek");
            System.out.println("Aby przerwać działanie wprowadź zero.");
            liczba = scanner.nextInt();
            boolean znalezionoPierwiastek=false;
            for (int i=1; i<=liczba; i++){
                if (i*i==liczba){
                    System.out.println("Pierwiastek liczby "+liczba+ " to "+i);
                    znalezionoPierwiastek=true;
                    break;
                }
            }
            if (!znalezionoPierwiastek && liczba!=0){
                System.out.println("Nie znaleziono pierwiastka całkowitego dla liczby "+liczba);
            }
        }while (liczba!=0);
        System.out.println("Koniec.");
    }
}