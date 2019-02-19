package pl.sda.str108;

//      Metody statyczne -zadanie
//        2.* Napisz program który pozwala użytkownikowi samemu zdecydować podzielność przez jaką liczbę będzie badana

import java.util.Scanner;

public class MetodyStatyczne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Podaj liczbę całkowitą");

        do{
            int liczba = scanner.nextInt();
            System.out.println("Podaj dzielną liczbę całkowitą");
            int dzielnik = scanner.nextInt();

            if (liczba % dzielnik == 0){
                System.out.println("Liczba " + liczba + " jest podzielna przez " + dzielnik);
            }else
                System.out.println("Liczba " + liczba + " jest niepodzielna przez " + dzielnik);
            System.out.println("-------------------------------------------");
            System.out.println("Podaj liczbę całkowitą");


        }while (scanner.hasNextInt());
    }
}
