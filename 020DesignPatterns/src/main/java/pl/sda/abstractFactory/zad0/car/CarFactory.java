package pl.sda.abstractFactory.zad0.car;

public class CarFactory {
    public static Car createBMW16(){
        return new Car("BMW", 30.0, 200, 4);
    }
    public static Car createFiat126p(){
        Car fiat126p = new Car("Fiat",20.0,120,4);
        fiat126p.setHorsepower(33);
        return fiat126p;

    }
}