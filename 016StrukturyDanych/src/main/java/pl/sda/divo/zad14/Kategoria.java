package pl.sda.divo.zad14;

public enum Kategoria {
    NABIAL, OWOCE, WARZYWA, PIECZYWO;

    public static Kategoria of(int numer) {
        switch (numer) {
            case 1: return Kategoria.OWOCE;
            case 2: return Kategoria.WARZYWA;
            case 3: return Kategoria.PIECZYWO;
            default: return Kategoria.NABIAL;
        }
    }
}