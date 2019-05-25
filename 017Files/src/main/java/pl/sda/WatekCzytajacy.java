package pl.sda;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WatekCzytajacy implements Runnable {
    private boolean isWorking = true;
    private String sciezkaDoPlikuKtoryMamCzytac;

    public WatekCzytajacy(String sciezkaDoPlikuKtoryMamCzytac) {
        this.sciezkaDoPlikuKtoryMamCzytac = sciezkaDoPlikuKtoryMamCzytac;
    }

    @Override
    public void run() {
        String ostatniaLinia = "";
        while (isWorking) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try (BufferedReader reader = new BufferedReader(new FileReader(sciezkaDoPlikuKtoryMamCzytac))) {
                String linia = reader.readLine();

                if (!linia.equals(ostatniaLinia)) {
                    System.out.println(linia);

                    ostatniaLinia = linia;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}