package pl.sda.abstractFactory.zad2;

public class Main {

    public static void main(String[] args) {
        Bike b = BikesFactory.create5GearKrossBike();
		Bike b2 = new Bike("awdf", 1, 2, BIKE_TYPE.TANDEM);
		Bike b3 = BikesFactory.create6GearMeridaBike();
        System.out.println(b2);
    }

}