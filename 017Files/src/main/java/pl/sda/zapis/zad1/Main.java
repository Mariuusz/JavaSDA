package pl.sda.zapis.zad1;

//1. Napisz aplikację która otwiera plik 'output_1.txt', zapisuje do niego "Hello World!" a następnie zamyka plik.

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isWorking = true;
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("plik.txt", true))) {
            while (isWorking) {
                String linia = scanner.nextLine();
                printWriter.println(linia);
                printWriter.flush();
                if (linia.equals("quit")) {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    public static void main(String[] args) throws FileNotFoundException {
//
//        PrintWriter zapis = new PrintWriter("out.txt");
//        zapis.println("Hello World!");
//        zapis.close();
//
//    }
}