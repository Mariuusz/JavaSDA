package pl.sda.zad3;

public class Para<T> {
    private T prawy;
    private T lewy;

    public Para(T prawy, T lewy) {
        this.prawy = prawy;
        this.lewy = lewy;
    }

    public T getPrawy() {
        return prawy;
    }

    public void setPrawy(T prawy) {
        this.prawy = prawy;
    }

    public T getLewy() {
        return lewy;
    }

    public void setLewy(T lewy) {
        this.lewy = lewy;
    }

    @Override
    public String toString() {
        return "Para{" +
                "prawy=" + prawy +
                ", lewy=" + lewy +
                '}';
    }
}
