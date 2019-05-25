package pl.sda.odczyt.zad1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        File plik = new File("output_1.txt");
        if (plik.exists()){
            try (BufferedReader reader = new BufferedReader(new FileReader(plik))) {
                String linia = reader.readLine();

                if (linia.equals("Hello World!")){
                    System.out.println("poprawna linia");
                } else {
                    System.out.println("plik zawiera coś innego!");
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("plik nie istnieje!");
        }


//        File file = new File("output_1.txt");
//        Scanner in = new Scanner(file);
//
//        String zdanie = in.nextLine();
//        System.out.println(zdanie);

    }
}