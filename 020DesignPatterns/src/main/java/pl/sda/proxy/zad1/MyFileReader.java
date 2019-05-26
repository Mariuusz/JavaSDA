package pl.sda.proxy.zad1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyFileReader implements IMyFileReader, ISingleLineFileReader{
    private BufferedReader reader;

    public void otworzPlik() {
        try {
            reader = new BufferedReader(new FileReader("plik.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String wczytajLinie() {
        if (reader == null) { // plik jeszcze nie jest otworzony
            otworzPlik(); // to go otwieram
        }

        String linia = null; // tworze zmienna linia
        try {
            linia = reader.readLine(); // przypisuje nowa linie
            if (linia == null) { // jeśli linia jest równa null,
                // to znaczy ze doszlismy do konca pliku
                przewinPlik(); // przewijam ten plik
                linia = reader.readLine(); // wczytuje pierwsza linie w pliku
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linia;// zwracam wczytaną linię
    }

    @Override
    public void pominLinie() {
        // zignoruje linie wczytaną
        String linia = wczytajLinie();
    }

    @Override
    public void pominNLinii(int ileLinii) {
        for (int i = 0; i < ileLinii; i++) {
            // wczytuje linie ale je ignoruje
            String linia = wczytajLinie();
            // nic nie robie z linia wiec wczytana wartosc jest ignorowana
        }
    }

    @Override
    public List<String> wczytajNLinii(int ileLinii) {
        List<String> linie = new ArrayList<>();
        // tworze liste linii
        // iteruje tyle razy ile zostało podane w parametrze
        for (int i = 0; i < ileLinii; i++) {
            // każdą linię dodaje do listy
            linie.add(wczytajLinie());
            // wewnątrz metody wczytajLinie jest cała logika
            // wczytująca plik od początku
        }
        return linie;
    }

    public void zamknijPlik() {
        // zabezpieczam się przed przypadkiem kiedy plik nigdy nie był otwierany
        if (reader != null) {
            try {// plik był otwarty
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void przewinPlik() {
        // otworzenie pliku spowoduje czytanie go od samego początku
        otworzPlik();
    }
}