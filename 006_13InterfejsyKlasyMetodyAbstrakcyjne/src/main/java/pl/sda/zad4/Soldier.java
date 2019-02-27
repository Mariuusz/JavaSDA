package pl.sda.zad4;

public class Soldier extends Citizen {

    public Soldier(String imie) {
        super(imie);
    }

    @Override
    boolean canVote() {
        return true;
    }
}
