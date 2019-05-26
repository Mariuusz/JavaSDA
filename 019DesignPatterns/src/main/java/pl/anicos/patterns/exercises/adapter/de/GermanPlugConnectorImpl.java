package pl.anicos.patterns.exercises.adapter.de;

public class GermanPlugConnectorImpl implements GermanPlugConnector {
    @Override
    public void provideGermanElectricity(String electricity) {
        System.out.println("German plug connected - > "+electricity);
    }
}
