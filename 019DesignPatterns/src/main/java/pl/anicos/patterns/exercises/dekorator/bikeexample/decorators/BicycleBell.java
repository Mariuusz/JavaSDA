package pl.anicos.patterns.exercises.dekorator.bikeexample.decorators;

import pl.anicos.patterns.exercises.dekorator.bikeexample.Bike;

public class BicycleBell extends BikeAccessory {


    public BicycleBell(Bike bike) {
        super(bike);
    }

    @Override
    public float getWeight() {
        return this.bike.getWeight() + 0.030f;
    }
}