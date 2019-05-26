package pl.anicos.patterns.exercises.dekorator.bikeexample.decorators;

import pl.anicos.patterns.exercises.dekorator.bikeexample.Bike;

public abstract class BikeAccessory extends Bike {

    protected final Bike bike;

    protected BikeAccessory(Bike bike) {
        this.bike = bike;
    }
}