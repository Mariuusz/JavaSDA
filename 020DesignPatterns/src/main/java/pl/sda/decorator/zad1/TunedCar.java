package pl.sda.decorator.zad1;

public class TunedCar implements ICar {
    private ICar car;

    private boolean hasExtraCharger, hasExtraEngine, hasExtraSeats;

    public TunedCar(ICar car, boolean hasExtraCharger, boolean hasExtraEngine, boolean hasExtraSeats) {
        this.car = car;
        if (car.isHasCharger()) {
            this.hasExtraCharger = false;
        } else {
            this.hasExtraCharger = hasExtraCharger;
        }
        this.hasExtraEngine = hasExtraEngine;
        this.hasExtraSeats = hasExtraSeats;
    }

    public double getEngineCapacity() {
        return car.getEngineCapacity() * (hasExtraEngine ? 1.2 : 1.0);
    }

    @Override
    public int getHorsepower() {
        return (int) (car.getHorsepower() *
                (hasExtraCharger ? 1.1 : 1.0) *
                (hasExtraEngine ? 1.2 : 1.0) *
                (hasExtraSeats ? 0.5 : 1.0));
    }

    @Override
    public boolean isHasCharger() {
        if (hasExtraCharger) {
            return true;
        }
        return car.isHasCharger();
    }

    @Override
    public double getChargerPressure() {
        return car.getChargerPressure() * (hasExtraCharger ? 1.1 : 1.0);
    }
}