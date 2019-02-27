package pl.sda.zad4;

public class Townsman extends Citizen {

    public Townsman(String imie) {
        super(imie);
    }

    @Override
    boolean canVote() {
        return true;
    }
}
