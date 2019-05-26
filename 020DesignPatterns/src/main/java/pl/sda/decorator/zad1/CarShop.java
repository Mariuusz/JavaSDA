package pl.sda.decorator.zad1;

public class CarShop {
    public ICar addExtraCharger(ICar original){
        return new TunedCar(original, true, false, false);
    }
}
