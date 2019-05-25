package pl.sda.odczyt.zad3;

//Stwórz aplikację która czyta plik 'output_3.txt' i zlicza słowa i linie w tym pliku.


import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
//        String zmienna = "";
//        String[] splits = zmienna.split(" ");
//        System.out.println(splits.length);


        File plik = new File("output_3.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(plik))) {
            int licznikLinii = 0;
            int licznikSłów = 0;

            String linia;
            while ((linia = reader.readLine()) != null) {
                licznikLinii++;
                if (linia.equals("")) {
                    // to znaczy że jest zero słów
                    continue;
                }
                String[] slowa = linia.split(" ");
                licznikSłów += slowa.length;
            }

            System.out.println("Linii: " + licznikLinii);
            System.out.println("Słów: " + licznikSłów);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}