package pl.sda.strategy.przyklad;

public class Bohater {
    private String name;
    private IStrategia strategiaWalki;

    public Bohater(String name) {
        this.name = name;
    }

    public void setStrategiaWalki(IStrategia strategiaWalki) {
        this.strategiaWalki = strategiaWalki;
    }

    // public String formatuj(String tekstDoSformatowania){
    public void walcz() {
        strategiaWalki.walcz();
    }
}