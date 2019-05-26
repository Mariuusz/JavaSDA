package pl.anicos.patterns.exercises.facade;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ComputerTest {

    @Mock
    private CPU cpu;
    @Mock
    private Memory memory;
    @Mock
    private HardDrive hardDrive;
    @InjectMocks
    Computer computer;

    @Test
    public void run() {
        computer.run();

        Mockito.verify(cpu).processData();
        Mockito.verify(hardDrive).readData();
        Mockito.verify(memory).load();
    }

    @Test
    public void off() {
        Computer testObj = new Computer(new CPU(),new Memory(), hardDrive);
        testObj.off();

       Mockito.verify(hardDrive).saveToDisk("Some data form RAM");

    }
}