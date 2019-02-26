package pl.sda.str14;

public class Krokodyl implements Jedzacy {
    private int liczbaPosilkow = 0;
    private int wagaPosilkow = 0;
    private TypPokarmu typ;


    public void jedz(Pokarm pokarm) {
        this.typ = pokarm.getTyp();
        if (typ == TypPokarmu.MIESO) {
            this.liczbaPosilkow += 1;
            this.wagaPosilkow += pokarm.getWaga();
        }
    }

    public int ilePosilkowZjedzone() {
        return liczbaPosilkow;
    }

    public int ileGramowZjedzone() {
        return wagaPosilkow;
    }
}
