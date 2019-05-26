package pl.sda.proxy.przyklad2;

/**
 * Klasa DifferentCar posiada pola i metody, które chciałbym ukryć w niektórych miejscach w implementacji.
 * Jej proxy to ICar.
 */
public class Car implements ICar{
    private boolean isOn;
    private boolean areDoorsClosed;
    private boolean lightsOn;

    // wewnątrz metody używam metod które nie są dostępne przez proxy.
    public void startCar(){
        if(areDoorsClosed){
            isOn = true;
            switchLightsOn();
            System.out.println("starting car");
        }else{
            System.out.println("Please close doors");
        }
    }

    public void stopCar(){
        switchLightsOff();
        isOn = false;
    }

    public void switchLightsOn() {
        System.out.println("Włączam światła");
        lightsOn = true;
    }

    public void switchLightsOff() {
        System.out.println("Wyłączam światła");
        lightsOn = false;
    }

    public boolean isAreDoorsClosed() {
        return areDoorsClosed;
    }
}