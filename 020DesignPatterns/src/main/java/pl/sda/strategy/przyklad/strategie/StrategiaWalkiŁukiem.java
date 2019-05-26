package pl.sda.strategy.przyklad.strategie;

import pl.sda.strategy.przyklad.IStrategia;

public class StrategiaWalkiŁukiem implements IStrategia {
    @Override
    public void walcz() {
        System.out.println("Szczelam szczałami.");
    }
}