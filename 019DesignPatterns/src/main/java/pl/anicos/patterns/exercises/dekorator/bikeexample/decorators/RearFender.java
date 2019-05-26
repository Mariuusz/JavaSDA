package pl.anicos.patterns.exercises.dekorator.bikeexample.decorators;

import pl.anicos.patterns.exercises.dekorator.bikeexample.Bike;

public class RearFender extends BikeAccessory {


    public RearFender(Bike bike) {
        super(bike);
    }

    @Override
    public float getWeight() {
        return this.bike.getWeight() + 0.220f;
    }
}