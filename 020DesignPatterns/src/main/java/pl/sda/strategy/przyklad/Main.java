package pl.sda.strategy.przyklad;

import pl.sda.strategy.przyklad.strategie.StrategiaWalkiŁukiem;

public class Main {
    public static void main(String[] args) {
        Bohater bohater = new Bohater("Marian");

        bohater.setStrategiaWalki(new StrategiaWalkiŁukiem());

        bohater.walcz();

    }
}