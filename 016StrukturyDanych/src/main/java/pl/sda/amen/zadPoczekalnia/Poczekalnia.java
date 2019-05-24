package pl.sda.amen.zadPoczekalnia;


import javax.swing.text.html.Option;
import java.util.Comparator;
import java.util.Optional;
import java.util.PriorityQueue;

public class Poczekalnia {
    // Tworzę jedną instancję
    private Comparator<Klient> komparator = new Comparator<Klient>() {
        @Override
        public int compare(Klient o1, Klient o2) {
            if (o1.czyPriorytet && !o2.czyPriorytet) {
                return -1;
            } else if (!o1.czyPriorytet && o2.czyPriorytet) {
                return 1;
            }

            if (o1.czasPrzybycia.isBefore(o2.czasPrzybycia)) {
                return -1;
            } else if (o1.czasPrzybycia.isAfter(o2.czasPrzybycia)) {
                return 1;
            }

            return 0;
        }
    };

    private PriorityQueue<Klient> kolejka = new PriorityQueue<>(komparator);

    public Poczekalnia() {
    }

    public void wypiszNaZlySposob() {
        for (Klient k : kolejka) {
            System.out.println(k);
        }
    }

    public Optional<Klient> pobierzKlienta() {
        return Optional.ofNullable(kolejka.poll());
    }

    public void wypiszPoprawnie() {
        PriorityQueue<Klient> kopia = new PriorityQueue<>(komparator);
        // aby nie czyścić zawartości orginalnej kolejki kopiuję jej zawartość do kopii
        kopia.addAll(kolejka);

        while (!kopia.isEmpty()) {
//            Optional<Klient> klient = pobierzKlienta();
//            if(klient.isPresent()) {
//                System.out.println(klient.get());
//            }

            // opróżniam kopię (usuwam elementy i je wyciągam);
            System.out.println(kopia.poll());
        }
    }
}