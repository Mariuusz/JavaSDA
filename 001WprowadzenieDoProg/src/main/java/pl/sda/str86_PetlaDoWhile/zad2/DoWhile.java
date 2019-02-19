package pl.sda.str86_PetlaDoWhile.zad2;

//Napisz program, który oblicza wartość pierwiastka z wprowadzonej przez użytkownika liczby,
// dopóki ta przyjmuje wartości większe od 0 (dla uproszczenia przyjmij że użytkownik wprowadza liczby całkowite)

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą");
        int x = scanner.nextInt();
        int i =0;
        do {
            i++;
        }while (i * i != x);

        System.out.println("Pierwiastek liczby " + x + " równa się " + i);
    }
}
