package pl.sda.strategy.zad0;


public class Printer {
    private IFormatterCzcionki formatterCzcionki;

    public Printer() {
        formatterCzcionki = new FormatterInverter();
    }

    public void setFormatterCzcionki(IFormatterCzcionki formatterCzcionki) {
        this.formatterCzcionki = formatterCzcionki;
    }

    public String formatuj(String tekstDoSformatowania) {
        return formatterCzcionki.zamienTekst(tekstDoSformatowania);
    }
}