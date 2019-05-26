package pl.anicos.patterns.exercises.factorymethod;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ComputerFactoryTest {

    @Test
    public void shouldCreatePC() {
        Computer testObj = ComputerFactory.getComputer("PC", "2 GB", "500 GB", "2.4 GHz");
        assertTrue(testObj instanceof PC);
    }

    @Test
    public void shouldCreateServer() {
        Computer testObj = ComputerFactory.getComputer("Server", "16 GB", "1 TB", "2.9 GHz");
        assertTrue(testObj instanceof Server);
    }

    @Test(expected = RuntimeException.class)
    public void shouldNotCreateMac() {
        ComputerFactory.getComputer("Mac", "16 GB", "1 TB", "2.9 GHz");
    }
}