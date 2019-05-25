package pl.sda.zad2;

//Stwórz metodę main, w metodzie wczytaj dwie liczby:
//        - pierwsza liczba określa ile wątków wystartować
//
//        - druga liczba określa ilość powtórzeń wątku
//
//        następnie wykonaj start tylu wątków ile podał użytkownik i każ każdemu wątkowi wypisać
//        tyle razy HELLO WORLD ile podał jako druga liczba

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ile wątków?");
        int ileWatkow = sc.nextInt();
        boolean czyPętlaPracuje = true;
        System.out.println("Ile czasu spać?");
        final int ileCzasuSpać = sc.nextInt();

        ExecutorService pulaWątków = Executors.newFixedThreadPool(ileWatkow);
        while (czyPętlaPracuje) {
            pulaWątków.submit(new Runnable() {
                public void run() {
                    System.out.println("Start wątku: " + ileCzasuSpać);
                    try {
                        Thread.sleep(ileCzasuSpać);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Koniec wątku: " + ileCzasuSpać);
                }
            });
        }
    }
}