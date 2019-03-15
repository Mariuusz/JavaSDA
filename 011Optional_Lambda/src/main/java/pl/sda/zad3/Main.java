package pl.sda.zad3;

//3*.Używając streamów znajdź długość najdłuższej linii w wybranym przez ciebie pliku.
// Zauważ, że klasa BufferedReader ma metodę stream().

import java.io.*;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.readFile();
    }


    public void readFile() throws IOException {

        final String FILENAME = "D:\\Mariusz\\aaa.txt";
        BufferedReader in;

        in = new BufferedReader(new InputStreamReader(new BufferedInputStream(new FileInputStream(FILENAME)), "UTF-8"));


        int naj = in.lines().max(Comparator.comparingInt(u -> u.length())).get().length();
        System.out.println(naj);
    }

}