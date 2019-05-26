package pl.sda.strategy.zad1;

public abstract class Factory {
    public static Samochód stworzElektryczny(){
        return new Samochód(0, 1000, new SilnikElektryczny());
    }

    public static Samochód stworzSpalinowy(){
        return new Samochód(50, 100, new SilnikSpalinowy());
    }
}
