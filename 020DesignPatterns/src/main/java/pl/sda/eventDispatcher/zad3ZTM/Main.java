package pl.sda.eventDispatcher.zad3ZTM;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrzystanekAutobusowy przystanekAutobusowy1 = new PrzystanekAutobusowy(1);
        PrzystanekAutobusowy przystanekAutobusowy2 = new PrzystanekAutobusowy(2);
        PrzystanekAutobusowy przystanekAutobusowy3 = new PrzystanekAutobusowy(3);

        Informator informator = new Informator();

        EventDispatcher.getInstance().register(przystanekAutobusowy1);
        EventDispatcher.getInstance().register(przystanekAutobusowy2);
        EventDispatcher.getInstance().register(przystanekAutobusowy3);
        EventDispatcher.getInstance().register(informator);


        /////
        List<IPowiadamialnyOAutobusie> powiadamialneObiekty =
                EventDispatcher.getInstance().pobierzObiektyImplementujaceInterfejs(IPowiadamialnyOAutobusie.class);

        for (IPowiadamialnyOAutobusie obiekcik: powiadamialneObiekty) {
            obiekcik.powiadomOAutobusie(null);
        }
    }
}