package pl.sda.abstractFactory.zad0;

import pl.sda.abstractFactory.zad0.car.CarFactory;
import pl.sda.abstractFactory.zad0.car.ICar;

public class Main {
    public static void main(String[] args) {
        ICar car1 = CarFactory.createBMW16();
        ICar car2 = CarFactory.createFiat126p();

        System.out.println(car1);
        System.out.println(car2);

    }
}