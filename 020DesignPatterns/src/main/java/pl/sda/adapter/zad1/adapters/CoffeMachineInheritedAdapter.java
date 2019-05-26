package pl.sda.adapter.zad1.adapters;

import pl.sda.adapter.zad1.KitchenDevice;
import pl.sda.adapter.zad1.devices.CoffeMachine;

public class CoffeMachineInheritedAdapter extends CoffeMachine implements KitchenDevice {

    public void turnDeviceOn() {
        super.on();
    }
}