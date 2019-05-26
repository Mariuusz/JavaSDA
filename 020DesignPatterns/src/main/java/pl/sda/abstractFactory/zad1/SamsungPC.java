package pl.sda.abstractFactory.zad1;

public class SamsungPC extends AbstractPC {

    private SamsungPC(String computerName, COMPUTER_BRAND brand, int cpu_power, double gpu_power, boolean isOverclocked) {
        super(computerName, COMPUTER_BRAND.SAMSUNG, cpu_power, gpu_power, isOverclocked);

        System.out.println("Tworzymy kompa: " + this.computerName);
    }

    public static AbstractPC createSamsungPC(){
        return new SamsungPC("Samsung", COMPUTER_BRAND.SAMSUNG, 101, 95, true);
    }
}