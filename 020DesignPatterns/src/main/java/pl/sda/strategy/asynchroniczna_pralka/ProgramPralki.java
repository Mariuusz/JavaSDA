package pl.sda.strategy.asynchroniczna_pralka;

public class ProgramPralki implements Runnable {
    private boolean czyPrzerwać = false;
    private boolean czyPauza = false;

    private ITrybPracy trybPracy;

    private IPralka pralka;

    public ProgramPralki(ITrybPracy trybPracy, IPralka pralka) {
        this.trybPracy = trybPracy;
        this.pralka = pralka;
    }

    @Override
    public void run() {
        resetUstawien();

        pralka.setCzyDrzwiczkiOtwarte(false);

        System.out.println("start prania!");
        int iloscEtapow = 0;
        while (iloscEtapow < trybPracy.getEtapy().length) {
            ParametryPralki parametryPralki = trybPracy.getEtapy()[iloscEtapow];
            System.out.println("Etap: " + parametryPralki.getNazwaEtapu());


            pralka.setPoziomWodyWPralce(parametryPralki.getPoziomWody());
            pralka.setPredkoscWirnika(parametryPralki.getPredkoscWirnika());


            try {
                Thread.sleep(parametryPralki.getCzasPracyEtapu());
            } catch (InterruptedException ie) {
            }
            System.out.println("----- etap");
            System.out.println();
            if (czyPrzerwać) {
                break;
            }
            sprawdzPauze();

            iloscEtapow++;
        }
        System.out.println("Pranie zakończone");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pralka.setCzyDrzwiczkiOtwarte(true);
    }

    private void resetUstawien() {
        czyPauza = false;
        czyPrzerwać = false;
    }

    private void sprawdzPauze() {
        while (czyPauza) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {

            }
        }
    }

    public void stop() {
        czyPrzerwać = true;
    }

    public void start() {
        czyPauza = false;
    }

    public void pauza() {
        czyPauza = true;
    }
}