package pl.anicos.patterns.exercises.dekorator.bikeexample.decorators;

import pl.anicos.patterns.exercises.dekorator.bikeexample.Bike;

public class Carrier extends BikeAccessory {

    public Carrier(Bike bike) {
        super(bike);
    }

    @Override
    public float getWeight() {
        return bike.getWeight() + 0.680f;
    }
}