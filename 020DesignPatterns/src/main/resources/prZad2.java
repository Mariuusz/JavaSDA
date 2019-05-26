package zadanie2_;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Configuration {
    private Scanner scanner;
    private String nazwaPliku;
    private List<LinisKonfiguracji> listaUstawien = new ArrayList<>();

    public Configuration(String nazwaPliku) {
        this.nazwaPliku = nazwaPliku;
    }

    public void otworzPlik() {
        try {
            scanner = new Scanner(new File(this.nazwaPliku));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void zamknijPlik() {
        if (scanner != null) {
            scanner.close();
        }
    }

    public String wczytajLinie() {
        String linia;
        if (scanner.hasNextLine()) {
            linia = scanner.nextLine();
        } else {
            przewinPlik();
            linia = scanner.nextLine();
        }

        return linia;
    }

    private void przewinPlik() {
        zamknijPlik();
        otworzPlik();
    }

    public void zaladujUstawienie() {
        String[] linia = wczytajLinie().split("=", 2);
        listaUstawien.add(new LinisKonfiguracji(linia[0], linia[1]));
    }

    public void zaladujUstawienia() {
        otworzPlik();
        
        while (scanner.hasNextLine()) {
            zaladujUstawienie();
        }
    }

    public void zapiszLinie(String linia) {
        BufferedWriter br = null;
        try {
            br = new BufferedWriter(new FileWriter(new File(this.nazwaPliku), true));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            br.write(linia);
            br.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void zapiszLinie(String nazwa, String wartosc) {
        BufferedWriter br = null;
        try {
            br = new BufferedWriter(new FileWriter(new File(this.nazwaPliku), true));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            br.write(nazwa + "=" + wartosc);
            br.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void zapiszUstawienie(LinisKonfiguracji liniaKonfiguracj) {
        zapiszLinie(liniaKonfiguracj.getNazwa(), liniaKonfiguracj.getWartosc());
    }

    public void zapiszUstawienie(String nazwa, String wartosc) {
        zapiszLinie(nazwa + "=" + wartosc);
    }

    public void zapiszUstawienia() {
        File plik = new File(this.nazwaPliku);
        if (plik.exists()) {
            plik.delete();
        }
        for (LinisKonfiguracji elementKonfiguracji : listaUstawien) {
            zapiszUstawienie(elementKonfiguracji);
        }
    }


}
