package pl.sda.eventDispatcher.zad3ZTM;

public class PrzystanekAutobusowy extends AbstractRegistrable implements IPowiadamialnyOAutobusie, IPowiadamialnyOSpoznieniu{
    private int numerPrzystanku;

    public PrzystanekAutobusowy(int numerPrzystanku) {
        this.numerPrzystanku = numerPrzystanku;
    }

    public int getNumerPrzystanku() {
        return numerPrzystanku;
    }

    public void setNumerPrzystanku(int numerPrzystanku) {
        this.numerPrzystanku = numerPrzystanku;
    }


    @Override
    public void powiadomOAutobusie(Autobus o) {
        System.out.println("Powiadomienie (o autobusie) przystanku o numerze: " +numerPrzystanku);
    }

    @Override
    public void powiadomOOpoznieniu(Autobus autobusu) {

    }
}
