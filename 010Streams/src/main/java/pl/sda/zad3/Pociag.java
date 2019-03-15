package pl.sda.zad3;

public class Pociag {
    private String identyfikator;
    private int numerPociągu;
    private KlasaPociagu klasa;
    private int maxOpóźnienie;
    private int długośćPodróży;
    private int cenaPodróży;
    private int przebieg;
    private boolean czyPosiadaWagonSypialny;

    public String getIdentyfikator() {
        return identyfikator;
    }

    public void setIdentyfikator(String identyfikator) {
        this.identyfikator = identyfikator;
    }

    public int getNumerPociągu() {
        return numerPociągu;
    }

    public void setNumerPociągu(int numerPociągu) {
        this.numerPociągu = numerPociągu;
    }

    public KlasaPociagu getKlasa() {
        return klasa;
    }

    public void setKlasa(KlasaPociagu klasa) {
        this.klasa = klasa;
    }

    public int getMaxOpóźnienie() {
        return maxOpóźnienie;
    }

    public void setMaxOpóźnienie(int maxOpóźnienie) {
        this.maxOpóźnienie = maxOpóźnienie;
    }

    public int getDługośćPodróży() {
        return długośćPodróży;
    }

    public void setDługośćPodróży(int długośćPodróży) {
        this.długośćPodróży = długośćPodróży;
    }

    public int getCenaPodróży() {
        return cenaPodróży;
    }

    public void setCenaPodróży(int cenaPodróży) {
        this.cenaPodróży = cenaPodróży;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public boolean isCzyPosiadaWagonSypialny() {
        return czyPosiadaWagonSypialny;
    }

    public void setCzyPosiadaWagonSypialny(boolean czyPosiadaWagonSypialny) {
        this.czyPosiadaWagonSypialny = czyPosiadaWagonSypialny;
    }

    @Override
    public String toString() {
        return "Pociag{" +
                "identyfikator='" + identyfikator + '\'' +
                ", numerPociągu=" + numerPociągu +
                ", klasa=" + klasa +
                ", maxOpóźnienie=" + maxOpóźnienie +
                ", długośćPodróży=" + długośćPodróży +
                ", cenaPodróży=" + cenaPodróży +
                ", przebieg=" + przebieg +
                ", czyPosiadaWagonSypialny=" + czyPosiadaWagonSypialny +
                '}';
    }

    public Pociag() {
    }

    public Pociag(String identyfikator, int numerPociągu, KlasaPociagu klasa, int maxOpóźnienie, int długośćPodróży, int cenaPodróży, int przebieg, boolean czyPosiadaWagonSypialny) {
        this.identyfikator = identyfikator;
        this.numerPociągu = numerPociągu;
        this.klasa = klasa;
        this.maxOpóźnienie = maxOpóźnienie;
        this.długośćPodróży = długośćPodróży;
        this.cenaPodróży = cenaPodróży;
        this.przebieg = przebieg;
        this.czyPosiadaWagonSypialny = czyPosiadaWagonSypialny;
    }
}
