package pl.sda.str13;

import java.util.Random;

public class Telefon implements Dzwoni{
    public String numerTelefonu;
    public int lacznyCzasRozmow;


    public void zadzwon(String numer) {
        System.out.println("Dzwonię pod nr: " + numer);
        Random random = new Random();
        int polaczenie = random.nextInt(100);
        //40% nie zadzwoni i 60% zadzwoni
        if (polaczenie >40 ){
            // dzwoni
            numerTelefonu=numer;
            // czas rozmowy to w minutach od 1 do 60 min.
            int czasRozmowy = random.nextInt(59)+1;
            System.out.println("Rozmowa...");
            lacznyCzasRozmow += czasRozmowy;
            System.out.println("Połączenie trwało: " + czasRozmowy);
            System.out.println("Lączny czas rozmów: " + lacznyCzasRozmow);
        } else {            // nie dzwoni
            numer = null;
            System.out.println("Linia zajęta");
        }
    }

    public void zadzwoanNaAlarmowy() {
        zadzwon(nrAlarmowy);
    }
}
