package pl.sda.singleton.zad2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SettingsReader {
    public void readSettingsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("config.txt"))) {

            String line1 = reader.readLine();
            String line2 = reader.readLine();
            String line3 = reader.readLine();
            String line4 = reader.readLine();

            String value1 = line1.split("=")[1];
            String value2 = line2.split("=")[1];
            String value3 = line3.split("=")[1];        // działanina
            String value4 = line4.split("=")[1];

            // punkt 1
            int range1= Integer.parseInt(value1);   // zakres 1
            int range2= Integer.parseInt(value2);  // zakres 2
            int rounds = Integer.parseInt(value4); // ilosc rund

            // punkt 4
            MySettings.INSTANCE.setRange1(range1);
            MySettings.INSTANCE.setRange2(range2);
            MySettings.INSTANCE.setNumberOfRounds(rounds);
            MySettings.INSTANCE.setSigns(value3);

        } catch (IOException ioe) {
            System.err.println("brak pliku");
        }
    }
}