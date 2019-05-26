package pl.sda.singleton.zad0;

public class Phone {

    public Phone() {

    }

    public void call() {
        AsteriskSingleton.getInstance().call();
    }
}
