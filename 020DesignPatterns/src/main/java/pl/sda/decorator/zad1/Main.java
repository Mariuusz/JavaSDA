package pl.sda.decorator.zad1;

public class Main {
    public static void main(String[] args) {
        ICar samochod = new Car(1.0, 500, false, 1.0, 5);
        System.out.println(samochod.getChargerPressure());

        CarShop shop = new CarShop();
        ICar tuned = shop.addExtraCharger(samochod);

        System.out.println(tuned.getChargerPressure());
    }
}
