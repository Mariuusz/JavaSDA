package pl.anicos.patterns.exercises.dekorator.bikeexample.decorators;

import pl.anicos.patterns.exercises.dekorator.bikeexample.Bike;

public class FrontFender extends BikeAccessory {

    public FrontFender(Bike bike) {
        super(bike);
    }

    @Override
    public float getWeight() {
        return this.bike.getWeight() + 0.200f;
    }
}