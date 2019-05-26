package pl.anicos.patterns.exercises.dekorator.bikeexample;

public class CityBike extends Bike {

    public CityBike() {
        this.type = BikeType.CITY;
    }

    @Override
    public float getWeight() {
        return 12.300f;
    }
}