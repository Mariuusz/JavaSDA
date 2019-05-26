package pl.sda.observerObservable.zadSmsStation;

public class Message {
    private String numer;
    private String tresc;

    public Message(String numer, String tresc) {
        this.numer = numer;
        this.tresc = tresc;
    }

    public String getNumer() {
        return numer;
    }

    public void setNumer(String numer) {
        this.numer = numer;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }
}