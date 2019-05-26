package pl.sda.strategy.zad0;

public class FormatterUpper implements IFormatterCzcionki {
    @Override
    public String zamienTekst(String tekstDoZamiany) {
        return tekstDoZamiany.toUpperCase();
    }
}
