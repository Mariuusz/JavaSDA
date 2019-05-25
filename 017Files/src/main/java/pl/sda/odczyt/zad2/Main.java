package pl.sda.odczyt.zad2;

// Stwórz aplikację która odczyta plik 'output_2.txt' i wczyta z niego linię,
// a następnie wypisze ją na ekran: 1 raz "toUpperCase", 1 raz "toLowerCase", 1 raz "trim".

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File plik = new File("output_2.txt");

        if (plik.exists()) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(plik));
                String linia = reader.readLine();

                System.out.println(linia.toUpperCase());
                System.out.println(linia.toLowerCase());
                System.out.println(linia.trim());

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
