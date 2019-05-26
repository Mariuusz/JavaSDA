package pl.anicos.patterns.exercises.command.example2;

import org.junit.Test;

public class RemoteControlTest {

    @Test
    public void pressButton() {
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);
        //switch on
        control.setCommand(lightsOn);
        control.pressButton();
        //switch off
        control.setCommand(lightsOff);
        control.pressButton();

    }
}