package pl.sda.decorator.zad1;

public class Car implements ICar{
    private double engineCapacity;
    private int horsepower;
    private boolean hasCharger;
    private double chargerPressure;

    private int seatsNumber;

    public Car(double engineCapacity, int horsepower, boolean hasCharger, double chargerPressure, int seatsNumber) {
        this.engineCapacity = engineCapacity;
        this.horsepower = horsepower;
        this.hasCharger = hasCharger;
        this.chargerPressure = chargerPressure;
        this.seatsNumber = seatsNumber;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public boolean isHasCharger() {
        return hasCharger;
    }

    public double getChargerPressure() {
        return chargerPressure;
    }
}
