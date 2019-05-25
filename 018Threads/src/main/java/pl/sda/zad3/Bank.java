package pl.sda.zad3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bank {
    private ExecutorService pulaWatkow = Executors.newFixedThreadPool(5);
    private KontoBankowe kontoBankowe;

    public Bank() {
        this.kontoBankowe = new KontoBankowe();
    }

    public void wykonajPrzelewWychodzacy(double kwota) {
        ZleceniePrzelewu zlecenie =
                new ZleceniePrzelewu(
                        kontoBankowe,
                        kwota,
                        KIERUNEK_PRZELEWU.WYCHODZĄCY);

        pulaWatkow.submit(zlecenie);
    }

    public void wykonajPrzelewPrzychodzacy(double kwota) {
        ZleceniePrzelewu zlecenie =
                new ZleceniePrzelewu(
                        kontoBankowe,
                        kwota,
                        KIERUNEK_PRZELEWU.PRZYCHODZĄCY);

        pulaWatkow.submit(zlecenie);
    }

    public void wypiszBilansKonta() {
        System.out.println(kontoBankowe.getBilans());
    }
}