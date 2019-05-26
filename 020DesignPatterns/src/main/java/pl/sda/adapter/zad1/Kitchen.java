package pl.sda.adapter.zad1;

import pl.sda.adapter.zad1.adapters.CoffeMachineAdapter;
import pl.sda.adapter.zad1.adapters.CoffeMachineInheritedAdapter;
import pl.sda.adapter.zad1.adapters.OvenInheritedAdapter;
import pl.sda.adapter.zad1.devices.CoffeMachine;

import java.util.ArrayList;
import java.util.List;

public class Kitchen {
    private List<KitchenDevice> deviceList;

    public Kitchen() {
        CoffeMachine czajnik1 = new CoffeMachine();
        this.deviceList = new ArrayList<KitchenDevice>();
        this.deviceList.add(new CoffeMachineAdapter(czajnik1));
        this.deviceList.add(new CoffeMachineInheritedAdapter());
        this.deviceList.add(new OvenInheritedAdapter());
    }

    public void turnEverythingOn(){
        for (KitchenDevice device : deviceList) {
            device.turnDeviceOn();
        }
    }

    // TODO: turn off
}
