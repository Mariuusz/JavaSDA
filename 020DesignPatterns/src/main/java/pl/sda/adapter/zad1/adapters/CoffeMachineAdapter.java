package pl.sda.adapter.zad1.adapters;

import pl.sda.adapter.zad1.KitchenDevice;
import pl.sda.adapter.zad1.devices.CoffeMachine;

public class CoffeMachineAdapter implements KitchenDevice {
    private CoffeMachine coffeMachine;

    public CoffeMachineAdapter(CoffeMachine coffeMachine) {
        this.coffeMachine = coffeMachine;
    }

    public void turnDeviceOn() {
        coffeMachine.on();
    }
}