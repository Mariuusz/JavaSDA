package pl.anicos.patterns.exercises.dekorator.bikeexample;


public abstract class Bike {

    protected BikeType type = BikeType.UNKNOWN;

    protected BikeType getType() {
        return this.type;
    }

    public abstract float getWeight();
}