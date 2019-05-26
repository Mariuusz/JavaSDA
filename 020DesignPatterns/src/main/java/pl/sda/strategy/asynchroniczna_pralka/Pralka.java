package pl.sda.strategy.asynchroniczna_pralka;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pralka implements IPralka{
    private ITrybPracy trybPracy;
    private boolean czyDrzwiczkiOtwarte;
    private int poziomWodyWPralce;
    private int predkoscWirnika;

    private ExecutorService watekPralki = Executors.newCachedThreadPool();

    public Pralka() {
        poziomWodyWPralce = 0;
        czyDrzwiczkiOtwarte = true;
        predkoscWirnika = 0;
    }

    public void setTrybPracy(ITrybPracy trybPracy) {
        this.trybPracy = trybPracy;
    }

    public boolean isCzyDrzwiczkiOtwarte() {
        return czyDrzwiczkiOtwarte;
    }

    public void setCzyDrzwiczkiOtwarte(boolean czyDrzwiczkiOtwarte) {
        System.out.println("Drzwiczki:" + czyDrzwiczkiOtwarte);
        this.czyDrzwiczkiOtwarte = czyDrzwiczkiOtwarte;
    }

    public int getPoziomWodyWPralce() {
        return poziomWodyWPralce;
    }

    public void setPoziomWodyWPralce(int poziomWodyWPralce) {
        System.out.println("Poziom wody:" + poziomWodyWPralce);
        this.poziomWodyWPralce = poziomWodyWPralce;
    }

    public int getPredkoscWirnika() {
        return predkoscWirnika;
    }

    public void setPredkoscWirnika(int predkoscWirnika) {
        System.out.println("Predkosc wirnika:" + predkoscWirnika);
        this.predkoscWirnika = predkoscWirnika;
    }

    public void startPralka() {
        if (trybPracy != null) {
            watekPralki.submit(new ProgramPralki(trybPracy, this));
        } else {
            System.out.println("Ustaw tryb pracy pralki.");
        }
    }

    public void zatrzymajPranie() {

    }
}