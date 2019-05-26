package pl.sda.eventDispatcher.zad2Restauracja;

import pl.sda.eventDispatcher.eventDispatcher.EventDispatcher;
import pl.sda.eventDispatcher.zad2Restauracja.modele.Restauracja;
import pl.sda.eventDispatcher.zad2Restauracja.zdarzenia.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Restauracja restauracja = new Restauracja();

        Scanner scanner = new Scanner(System.in);
        boolean isWorking = true;

        while (isWorking) {
            String linia = scanner.nextLine();
            String[] kolumny = linia.split(" ");

            if (kolumny[0].equalsIgnoreCase("nowy")) {
                EventDispatcher.getInstance().rozeslij(new KlientPrzyszedl(kolumny[1]));
//                restauracja.nowyKlient(kolumny[1]);
            } else if (kolumny[0].equalsIgnoreCase("wyszedl")) {
                EventDispatcher.getInstance().rozeslij(new KlientWyszedl(kolumny[1]));
//                restauracja.gośćWyszedł(kolumny[1]);
            } else if (kolumny[0].equalsIgnoreCase("zaplacil")) {
                EventDispatcher.getInstance().rozeslij(new KlientZaplacil(kolumny[1]));
//                restauracja.gośćZaplacil(kolumny[1]);
            } else if (kolumny[0].equalsIgnoreCase("zamowil")) {
                EventDispatcher.getInstance().rozeslij(new KlientZamowil(kolumny[1]));
//                restauracja.noweZamowienie(kolumny[1]);
            }
        }
    }
}