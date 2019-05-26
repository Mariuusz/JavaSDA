package pl.sda.strategy.zad0;

public class FormatterTrim implements IFormatterCzcionki{
    @Override
    public String zamienTekst(String tekstDoZamiany) {
        return tekstDoZamiany.trim();
    }
}
