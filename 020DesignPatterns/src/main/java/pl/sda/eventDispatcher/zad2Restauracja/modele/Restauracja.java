package pl.sda.eventDispatcher.zad2Restauracja.modele;

import pl.sda.eventDispatcher.zad2Restauracja.interfejsy.*;

import java.util.List;

public class Restauracja {
    public Restauracja() {
        for (int i = 0; i < 5; i++) {
            new Kelner("Marian " + i);
        }
        new Ochroniarz();
        new Kucharz();
    }

    public void nowyKlient(){
        for (Kelner k: listaKelnerow) {

        }
    }

    List<Kelner > listaKelnerow;
    List<Ochroniarz> listaOchroniarzy;
    List<Kucharz > listaKucharzy;



}