package pl.anicos.patterns.exercises.adapter.uk;

public class UKElectricalSocket {
    public void plugIn(UKPlugConnector plug) {
        plug.provideElectricity("Electricity form uk");
    }
}
