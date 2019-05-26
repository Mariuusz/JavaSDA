package pl.anicos.patterns.exercises.adapter;

import pl.anicos.patterns.exercises.adapter.de.GermanPlugConnector;
import pl.anicos.patterns.exercises.adapter.uk.UKPlugConnector;

public class GermanToUKPlugConnectorAdapter implements UKPlugConnector {

    private GermanPlugConnector plug;

    public GermanToUKPlugConnectorAdapter(GermanPlugConnector plug) {
        this.plug = plug;
    }

    @Override
    public void provideElectricity(String electricity) {
        plug.provideGermanElectricity(electricity);
    }

}