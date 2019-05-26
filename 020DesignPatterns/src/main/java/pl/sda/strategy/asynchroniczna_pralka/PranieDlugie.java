package pl.sda.strategy.asynchroniczna_pralka;

public class PranieDlugie implements ITrybPracy {

    @Override
    public ParametryPralki[] getEtapy() {
        return new ParametryPralki[0];
    }
}