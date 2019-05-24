package pl.sda.amen.dijkstra;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KolejkaWierzcholkow {

    public static void main(String[] args) {

        PriorityQueue<Wierzcholek> kolejka = new PriorityQueue<>(new Comparator<Wierzcholek>() {
            @Override
            public int compare(Wierzcholek o1, Wierzcholek o2) {
                if (o1.getDystans() > o2.getDystans()) {
                    return -1;
                } else if (o1.getDystans() < o2.getDystans()) {
                    return 1;
                }
                return 0;
            }
        });
    }
}