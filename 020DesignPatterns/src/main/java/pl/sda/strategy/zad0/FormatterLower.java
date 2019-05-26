package pl.sda.strategy.zad0;

public class FormatterLower implements IFormatterCzcionki {
    @Override
    public String zamienTekst(String tekstDoZamiany) {
        return tekstDoZamiany.toLowerCase();
    }
}
