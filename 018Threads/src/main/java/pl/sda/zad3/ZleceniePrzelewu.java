package pl.sda.zad3;


public class ZleceniePrzelewu implements Runnable {
    private KontoBankowe kontoBankowe;
    private double kwotaPrzelewu;
    private KIERUNEK_PRZELEWU kierunek_przelewu;

    public ZleceniePrzelewu(KontoBankowe kontoBankowe, double kwotaPrzelewu, KIERUNEK_PRZELEWU kierunek_przelewu) {
        this.kontoBankowe = kontoBankowe;
        this.kwotaPrzelewu = kwotaPrzelewu;
        this.kierunek_przelewu = kierunek_przelewu;
    }

    public void run() {
//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        if (kierunek_przelewu == KIERUNEK_PRZELEWU.WYCHODZĄCY) {
            kontoBankowe.odejmijZKonta(kwotaPrzelewu);
        } else if (kierunek_przelewu == KIERUNEK_PRZELEWU.PRZYCHODZĄCY) {
            kontoBankowe.dodajDoKonta(kwotaPrzelewu);
        }
    }
}