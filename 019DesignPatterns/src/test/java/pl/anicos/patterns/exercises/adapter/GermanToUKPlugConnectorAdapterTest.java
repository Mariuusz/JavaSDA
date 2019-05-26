package pl.anicos.patterns.exercises.adapter;

import org.junit.Test;
import pl.anicos.patterns.exercises.adapter.de.GermanPlugConnector;
import pl.anicos.patterns.exercises.adapter.de.GermanPlugConnectorImpl;
import pl.anicos.patterns.exercises.adapter.uk.UKElectricalSocket;
import pl.anicos.patterns.exercises.adapter.uk.UKPlugConnector;

public class GermanToUKPlugConnectorAdapterTest {

    @Test
    public void sholudUkElectricalSocketProvideElectricityToGermanPlug() {
        GermanPlugConnector plugConnector = new GermanPlugConnectorImpl();
        UKElectricalSocket electricalSocket = new UKElectricalSocket();
        UKPlugConnector ukAdapter = new GermanToUKPlugConnectorAdapter(plugConnector);
        electricalSocket.plugIn(ukAdapter);
    }
}