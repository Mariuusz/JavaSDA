package pl.sda.decorator.przyklad;

public class Main {
    public static void main(String[] args) {
        Hero bohater = new Hero("Marian");

        HeroOnAHorse heroOnAHorse = new HeroOnAHorse(bohater);
        System.out.println(heroOnAHorse.getName());
    }
}