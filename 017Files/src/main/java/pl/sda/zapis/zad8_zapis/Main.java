package pl.sda.zapis.zad8_zapis;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isWorking = true;

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