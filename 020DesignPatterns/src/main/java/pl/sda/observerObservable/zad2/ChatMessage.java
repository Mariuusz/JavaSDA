package pl.sda.observerObservable.zad2;

public class ChatMessage {
    private int wysylajacy;
    private String tresc;

    public ChatMessage(int wysylajacy, String tresc) {
        this.wysylajacy = wysylajacy;
        this.tresc = tresc;
    }

    public int getWysylajacy() {
        return wysylajacy;
    }

    public void setWysylajacy(int wysylajacy) {
        this.wysylajacy = wysylajacy;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }
}