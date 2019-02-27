package pl.sda.zad4;

public abstract class Citizen {
    private String imie;

    public Citizen(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    abstract boolean canVote();

}
