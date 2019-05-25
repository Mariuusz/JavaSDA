package pl.sda.odczyt.zad8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String ostatniaLinia = "";

        boolean isWorking = true;
        while (isWorking) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try (BufferedReader reader = new BufferedReader(new FileReader("plik_wymiany"))) {
                String linia = reader.readLine();

                if (!linia.equals(ostatniaLinia)) {
                    System.out.println(linia);

                    ostatniaLinia = linia;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}