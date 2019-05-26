package pl.sda.abstractFactory.zad1;

public abstract class AbstractPC {

    protected String computerName;
    protected COMPUTER_BRAND brand;
    protected int cpu_power;
    protected double gpu_power;
    protected boolean isOverclocked;


    public AbstractPC(String computerName, COMPUTER_BRAND brand, int cpu_power, double gpu_power, boolean isOverclocked) {
        this.computerName = computerName;
        this.brand = brand;
        this.cpu_power = cpu_power;
        this.gpu_power = gpu_power;
        this.isOverclocked = isOverclocked;
    }

    @Override
    public String toString() {
        return "AbstractPC{" +
                "computerName='" + computerName + '\'' +
                ", brand=" + brand +
                ", cpu_power=" + cpu_power +
                ", gpu_power=" + gpu_power +
                ", isOverclocked=" + isOverclocked +
                '}';
    }
}
