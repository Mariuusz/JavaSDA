package pl.sda.zapis.zad8dwustronna;

import pl.sda.WatekCzytajacy;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isWorking = true;

        ExecutorService pula = Executors.newSingleThreadExecutor();
        pula.submit(new WatekCzytajacy("plik_wymiany_2"));

        while (isWorking) {
            String linia = sc.nextLine();

            try (PrintWriter writer = new PrintWriter("plik_wymiany")) {
                writer.println(linia);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}