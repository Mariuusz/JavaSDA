package pl.anicos.patterns.exercises.dekorator.bikeexample;

public class RoadBike extends Bike {

    public RoadBike() {
        this.type = BikeType.ROAD;
    }

    @Override
    public float getWeight() {
        return 8.200f;
    }
}
