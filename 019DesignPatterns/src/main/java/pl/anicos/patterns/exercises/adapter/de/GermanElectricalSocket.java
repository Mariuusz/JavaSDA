package pl.anicos.patterns.exercises.adapter.de;

public class GermanElectricalSocket {
    public void plugIn(GermanPlugConnector plug) {
        plug.provideGermanElectricity("Electricit from German");
    }
}
