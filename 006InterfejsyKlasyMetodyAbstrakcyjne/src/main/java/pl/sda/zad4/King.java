package pl.sda.zad4;

public class King extends Citizen {
    public King(String imie) {
        super(imie);
    }

    @Override
    boolean canVote() {
        return false;
    }
}
