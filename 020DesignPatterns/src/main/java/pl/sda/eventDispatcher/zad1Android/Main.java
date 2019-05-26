package pl.sda.eventDispatcher.zad1Android;

import pl.sda.eventDispatcher.zad1Android.models.AndroidSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AndroidSystem system = new AndroidSystem();

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String command = line.split(" ")[0];
            int call_id = Integer.parseInt(line.split(" ")[1]);
            if (command.equalsIgnoreCase("start")) {
                system.rozpocznijPolaczenie(call_id);
            } else if (command.equalsIgnoreCase("stop")) {
                system.zakonczPolaczenie(call_id);
            }
        }
    }

}