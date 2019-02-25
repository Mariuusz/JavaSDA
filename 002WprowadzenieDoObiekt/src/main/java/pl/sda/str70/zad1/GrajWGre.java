package pl.sda.str70.zad1;

import java.util.Scanner;

public class GrajWGre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Czy chcesz zagrać w grę?");
        if (scanner.nextLine().contains("t")){
            System.out.println("Podaj początek zakresu");
            int a = scanner.nextInt();
            System.out.println("Podaj koniec zakresu");
            int b = scanner.nextInt();
            Gra gra = new Gra(a,b);
            gra.graj();
        }
        System.out.println("Koniec!");
    }
}