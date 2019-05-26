package pl.anicos.patterns.exercises.builder.joshuabloch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ComputerBuilderTest {

    @Test
    public void shouldCreateComputerObjectUsingBuilderByJoshuaBloch() {
        //given
        Computer testObj = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        //then
        assertEquals("500 GB", testObj.getHDD());
        assertEquals("2 GB", testObj.getRAM());
        assertTrue(testObj.isBluetoothEnabled());
        assertTrue(testObj.isGraphicsCardEnabled());
    }
}