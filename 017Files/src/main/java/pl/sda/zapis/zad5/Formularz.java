package pl.sda.zapis.zad5;

public class Formularz {
    private int wiek;
    private int wzrost;
    private boolean czyKobieta;
    private double zarobki;
    private boolean czyMaPsa;
    private int rozmiarButa;
    private String coSadziszOTymFormularzu;

    public String getCoSadziszOTymFormularzu() {
        return coSadziszOTymFormularzu;
    }

    public void setCoSadziszOTymFormularzu(String coSadziszOTymFormularzu) {
        this.coSadziszOTymFormularzu = coSadziszOTymFormularzu;
    }

    public Formularz(int wiek, int wzrost, boolean czyKobieta, double zarobki, boolean czyMaPsa, int rozmiarButa, String coSadziszOTymFormularzu) {
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.czyKobieta = czyKobieta;
        this.zarobki = zarobki;
        this.czyMaPsa = czyMaPsa;
        this.rozmiarButa = rozmiarButa;
        this.coSadziszOTymFormularzu = coSadziszOTymFormularzu;
    }

//    public Formularz(int wiek, int wzrost, boolean czyKobieta, double zarobki, boolean czyMaPsa, int rozmiarButa) {
//        this.wiek = wiek;
//        this.wzrost = wzrost;
//        this.czyKobieta = czyKobieta;
//        this.zarobki = zarobki;
//        this.czyMaPsa = czyMaPsa;
//        this.rozmiarButa = rozmiarButa;
//    }

    public Formularz() {
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getWzrost() {
        return wzrost;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public boolean isCzyKobieta() {
        return czyKobieta;
    }

    public void setCzyKobieta(boolean czyKobieta) {
        this.czyKobieta = czyKobieta;
    }

    public double getZarobki() {
        return zarobki;
    }

    public void setZarobki(double zarobki) {
        this.zarobki = zarobki;
    }

    public boolean isCzyMaPsa() {
        return czyMaPsa;
    }

    public void setCzyMaPsa(boolean czyMaPsa) {
        this.czyMaPsa = czyMaPsa;
    }

    public int getRozmiarButa() {
        return rozmiarButa;
    }

    public void setRozmiarButa(int rozmiarButa) {
        this.rozmiarButa = rozmiarButa;
    }

    public void parsujLinie(String linia) {
        String[] elementy = linia.split("=");
        switch (elementy[0]) {
            case "wiek":
                setWiek(Integer.parseInt(elementy[1]));
                break;
            case "wzrost":
                setWzrost(Integer.parseInt(elementy[1]));
                break;
            case "czyKobieta":
                setCzyKobieta(Boolean.parseBoolean(elementy[1]));
                break;
            case "zarobki":
                setZarobki(Double.parseDouble(elementy[1]));
                break;
            case "czyMaPsa":
                setCzyMaPsa(Boolean.parseBoolean(elementy[1]));
                break;
            case "rozmiarButa":
                setRozmiarButa(Integer.parseInt(elementy[1]));
                break;
            case "coSadziszOTymFormularzu":
                setCoSadziszOTymFormularzu(elementy[1]);
                break;
        }
    }

    public String zwrocWFormacie() {
        return "\n------\n" + "wiek=" + wiek + "\n" +
                "wzrost=" + wzrost + "\n" +
                "czyKobieta=" + czyKobieta + "\n" +
                "zarobki=" + zarobki + "\n" +
                "czyMaPsa=" + czyMaPsa + "\n" +
                "rozmiarButa=" + rozmiarButa + "\n" +
                "coSadziszOTymFormularzu=" + coSadziszOTymFormularzu
                ;
    }

    @Override
    public String toString() {
        return "Formularz{" +
                "wiek=" + wiek +
                ", wzrost=" + wzrost +
                ", czyKobieta=" + czyKobieta +
                ", zarobki=" + zarobki +
                ", czyMaPsa=" + czyMaPsa +
                ", rozmiarButa=" + rozmiarButa +
                '}';
    }
}