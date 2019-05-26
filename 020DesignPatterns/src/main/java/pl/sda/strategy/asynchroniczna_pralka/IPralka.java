package pl.sda.strategy.asynchroniczna_pralka;

public interface IPralka {
    public void setCzyDrzwiczkiOtwarte(boolean czyDrzwiczkiOtwarte);
    public void setPoziomWodyWPralce(int poziomWodyWPralce);
    public void setPredkoscWirnika(int predkoscWirnika);
}