package pl.sda.adapter.zad1.adapters;

import pl.sda.adapter.zad1.KitchenDevice;
import pl.sda.adapter.zad1.devices.Oven;

public class OvenInheritedAdapter extends Oven implements KitchenDevice {
    @Override
    public void turnDeviceOn() {
        super.turnOn();
    }
}
