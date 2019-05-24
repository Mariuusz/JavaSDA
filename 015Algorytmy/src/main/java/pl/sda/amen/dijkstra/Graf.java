package pl.sda.amen.dijkstra;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Graf {
    private Map<Integer, Wierzcholek> wierzcholki = new HashMap<>();
    private PriorityQueue<Wierzcholek> kolejka;

    public Graf() {
        kolejka = new PriorityQueue<>(new Comparator<Wierzcholek>() {
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

    public void dijkstra(int start, int stop) {
        // dist[source] ← 0                        // Distance from source to source
        Wierzcholek wierzcholekStart = wierzcholki.get(start);
        wierzcholekStart.setDystans(0.0);
        wierzcholekStart.setTrasa(wierzcholekStart.getNazwa());

        kolejka.add(wierzcholekStart);

        //while Q is not empty:
        while (!kolejka.isEmpty()) {
            //u ← vertex in Q with min dist[u]    // Node with the least distance
            //remove u from Q
            Wierzcholek wierzcholek = kolejka.poll();

            if (wierzcholek.getIdentyfikator() == stop) {
                break;
            }

            //for each neighbor v of u:
            for (int i = 0; i < wierzcholek.getSasiedzi().size(); i++) {
                int idSasiada = wierzcholek.getSasiedzi().get(i);
                Krawedz krawedzSasiada = wierzcholek.getKrawedzie().get(i);

                //alt ← dist[u] + length(u, v)
                double alternatywnyDystansDoSąsiada = wierzcholek.getDystans() + krawedzSasiada.getWaga();
                Wierzcholek sasiad = wierzcholki.get(idSasiada);

                //if alt < dist[v]:
                if (alternatywnyDystansDoSąsiada < sasiad.getDystans()) {
                    sasiad.setTrasa(wierzcholek.getTrasa() + " -> " + sasiad.getNazwa());
                    //dist[v] ← alt
                    sasiad.setDystans(alternatywnyDystansDoSąsiada);
                    kolejka.add(sasiad);
                }
            }
        }
        Wierzcholek koncowy = wierzcholki.get(stop);

        System.out.println("Dystans (do koncowego wierzcholka): " + koncowy.getDystans());
        System.out.println("Trasa: " + koncowy.getTrasa());

    }

    public void dodajWierzcholek(Wierzcholek w) {
        wierzcholki.put(w.getIdentyfikator(), w);
    }
}