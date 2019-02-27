package pl.sda.zad4;

public class Peasant extends Citizen {
    public Peasant(String imie) {
        super(imie);
    }

    @Override
    boolean canVote() {
        return false;
    }
}
