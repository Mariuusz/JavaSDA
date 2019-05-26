package pl.sda.abstractFactory.zad1;

public class Main {
    public static void main(String[] args) {
        AbstractPC mpc = MacPC.createMacAir();
        AbstractPC spc = SamsungPC.createSamsungPC();

        System.out.println(mpc);
        System.out.println(spc);
    }
}