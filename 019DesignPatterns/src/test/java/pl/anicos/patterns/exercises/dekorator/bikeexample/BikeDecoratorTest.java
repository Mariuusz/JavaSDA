package pl.anicos.patterns.exercises.dekorator.bikeexample;

import org.junit.Test;
import pl.anicos.patterns.exercises.dekorator.bikeexample.decorators.*;

public class BikeDecoratorTest {

    @Test
    public void bikeDecoratorTest() {
        System.out.println("Wzorzec projektowy Dekorator");

        Bike cityBike = new CityBike();
        System.out.println("Waga roweru miejskiego bez akcesoriów: " + String.format("%.4g", cityBike.getWeight()));

        cityBike = new Carrier(cityBike);
        cityBike = new RearFender(cityBike);
        cityBike = new FrontFender(cityBike);
        cityBike = new BicycleBell(cityBike);

        System.out.println("Waga roweru miejskiego z akcesoriami: " + String.format("%.4g", cityBike.getWeight()));

        Bike roadBike = new RoadBike();
        System.out.println("Waga roweru szosowego bez akcesoriów: " + String.format("%.4g", roadBike.getWeight()));

        roadBike = new BottleCage(roadBike);

        System.out.println("Waga roweru szosowego z akcesoriami: " + String.format("%.4g", roadBike.getWeight()));
    }
}
