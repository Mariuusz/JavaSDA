package pl.sda.strategy.asynchroniczna_pralka;

public class SzybkiePranie implements ITrybPracy {

    @Override
    public ParametryPralki[] getEtapy() {
        return new ParametryPralki[]{
                new ParametryPralki(0, 100, "Nabieranie wody", 2000),
                new ParametryPralki(30, 100, "Pranie", 5000),
                new ParametryPralki(0, 50, "Płukanie", 2000),
                new ParametryPralki(0, 0, "Spuszczanie wody", 2000),
                new ParametryPralki(1000, 0, "Wirowanie", 3000)};
    }
}