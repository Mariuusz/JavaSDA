package pl.sda.strategy.przyklad.strategie;

import pl.sda.strategy.przyklad.IStrategia;

public class StrategiaWalkiMieczem implements IStrategia {
    @Override
    public void walcz() {
        System.out.println("Ciach mieczem!");
    }
}