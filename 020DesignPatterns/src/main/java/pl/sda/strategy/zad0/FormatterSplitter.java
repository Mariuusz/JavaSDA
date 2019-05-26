package pl.sda.strategy.zad0;

public class FormatterSplitter implements IFormatterCzcionki {
    @Override
    public String zamienTekst(String tekstDoZamiany) {
        return tekstDoZamiany.replaceAll(""," ").trim();
    }
}
