package pl.sda.abstractFactory.zad2;

public abstract class BikesFactory {

    public static Bike create5GearKrossBike(){
        return new Bike("KROSS", 1, 5, BIKE_TYPE.BICYCLE);
    }

    public static Bike create6GearMeridaBike(){
        return new Bike("Merida", 1, 6, BIKE_TYPE.BICYCLE);
    }

    public static Bike create3GearInianaBike(){
        return new Bike("INIANA", 2, 3, BIKE_TYPE.TANDEM);
    }

    public static Bike create6GearFeltBike(){
        return new Bike("Felt", 1, 6, BIKE_TYPE.BICYCLE);
    }

    public static Bike create1GeaGoetzeBike(){
        return new Bike("Goetze", 2, 1, BIKE_TYPE.TANDEM);
    }
}