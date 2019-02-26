package pl.sda.str14;

public class Programista implements Jedzacy {
    private int liczbaPosilkow = 0;
    private int wagaPosilkow = 0;
    private TypPokarmu typ = TypPokarmu.MIESO;

    public void jedz(Pokarm pokarm) {
        if (typ != pokarm.getTyp()) {
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

