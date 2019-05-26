package pl.sda.strategy.zad0;

public class FormatterInverter implements IFormatterCzcionki {
    @Override
    public String zamienTekst(String tekstDoZamiany) {
        char[] znaki = tekstDoZamiany.toCharArray();
        for (int i = 0; i < znaki.length; i++) {
            if (Character.isLowerCase(znaki[i])) {
                znaki[i] = Character.toUpperCase(znaki[i]);
            } else if (Character.isUpperCase(znaki[i])) {
                znaki[i] = Character.toLowerCase(znaki[i]);
            }
        }
        String wynik1 = new String(znaki);
        return wynik1;
    }
}