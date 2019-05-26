package pl.sda.eventDispatcher.zad2Restauracja.modele;

import pl.sda.eventDispatcher.zad2Restauracja.interfejsy.*;

import java.util.List;

public class Kelner extends AbstractRegistrable implements IPowiadamialnyOPrzybyciuKlienta, IPowiadamialnyOWyjsciuKlienta, IPowiadamialnyOZamowieniu {
    private String imie;

    public Kelner(String imie) {
        this.imie = imie;
    }

    @Override
    public void przybylKlient(String imie) {
        System.out.println(this.imie + " kelner dowiedzial sie o (przybyciu) kliencie: " + imie);
    }

    @Override
    public void klientOpuscilLokal(String imie) {
        System.out.println(this.imie + " kelner dowiedzial sie o (wyjsciu) kliencie: " + imie);
    }

    @Override
    public void zlozylZamowienie(String imie, List<String> zamowienia) {
        System.out.println(this.imie + " kelner dowiedzial sie o (zamowieniu) klienta: " + imie);
    }
}