package pl.sda.eventDispatcher.zad2Restauracja.modele;

import pl.sda.eventDispatcher.zad2Restauracja.interfejsy.*;

import java.util.ArrayList;
import java.util.List;

public class Ochroniarz extends AbstractRegistrable implements IPowiadamialnyOWyjsciuKlienta, IPowiadamialnyOZaplacieZaPosilek, IPowiadamialnyOZamowieniu {
    private List<String> imionaLudziKtorzyNieZaplacili = new ArrayList<>();

    @Override
    public void klientOpuscilLokal(String imie) {
        if (imionaLudziKtorzyNieZaplacili.contains(imie)) {
            System.out.println("Dzwonie na policje, " + imie + " nie zaplacil.");
        }else{
            System.out.println("Klient nie zlozyl zamowienia, nie interesuje mnie.");
        }
    }

    @Override
    public void zlozylZamowienie(String imie, List<String> zamowienia) {
        System.out.println(imie + " zlozyl zamowienie");
        imionaLudziKtorzyNieZaplacili.add(imie);
    }

    @Override
    public void klientZaplacil(String imie) {
        if (imionaLudziKtorzyNieZaplacili.contains(imie)) {
            System.out.println("Zaplacil, usuwam : " + imie);
            imionaLudziKtorzyNieZaplacili.remove(imie);
        }
    }
}