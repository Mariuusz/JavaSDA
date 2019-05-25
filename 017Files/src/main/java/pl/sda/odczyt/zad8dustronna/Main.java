package pl.sda.odczyt.zad8dustronna;

import pl.sda.WatekCzytajacy;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isWorking = true;

        ExecutorService pula = Executors.newSingleThreadExecutor();
        pula.submit(new WatekCzytajacy("plik_wymiany"));

        while (isWorking) {
            String linia = sc.nextLine();

            try (PrintWriter writer = new PrintWriter("plik_wymiany_2")) {
                writer.println(linia);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}