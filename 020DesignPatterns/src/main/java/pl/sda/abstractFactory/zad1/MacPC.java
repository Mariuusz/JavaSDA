package pl.sda.abstractFactory.zad1;

public class MacPC extends AbstractPC {
    private MacPC(String computerName, int cpu_power, double gpu_power, boolean isOverclocked) {
        super(computerName, COMPUTER_BRAND.APPLE, cpu_power, gpu_power, isOverclocked);


        System.out.println("Stworzono:  " + this.computerName);
    }

    public static AbstractPC createMacPC() {
        return new MacPC("Apple MAC PRO", 100, 90, false);
    }

    public static AbstractPC createMacAir() {
        return new MacPC("Apple MacBook Air", 200, 2, true);
    }
}