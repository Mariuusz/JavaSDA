package pl.sda.amen.dijkstra;

public class Main {
    public static void main(String[] args) {

        Graf graf = new Graf();

        Wierzcholek w = new Wierzcholek(11, "A");
        w.dodajSasiada(22, 5);
        w.dodajSasiada(66, 4);
        w.dodajSasiada(88, 3);
        graf.dodajWierzcholek(w);

        w = new Wierzcholek(22, "B");
        w.dodajSasiada(11, 5);
        w.dodajSasiada(33, 1);
        w.dodajSasiada(88, 7);
        graf.dodajWierzcholek(w);

        w = new Wierzcholek(33, "C");
        w.dodajSasiada(44, 2);
        w.dodajSasiada(22, 1);
        w.dodajSasiada(88, 8);
        graf.dodajWierzcholek(w);

        w = new Wierzcholek(44, "D");
        w.dodajSasiada(33, 2);
        w.dodajSasiada(55, 3);
        w.dodajSasiada(99, 6);
        w.dodajSasiada(77, 11);
        graf.dodajWierzcholek(w);

        w = new Wierzcholek(55, "E");
        w.dodajSasiada(44, 3);
        w.dodajSasiada(99, 15);
        w.dodajSasiada(77, 7);
        graf.dodajWierzcholek(w);

        w = new Wierzcholek(66, "F");
        w.dodajSasiada(11, 4);
        w.dodajSasiada(77, 2);
        w.dodajSasiada(99, 4);
        graf.dodajWierzcholek(w);

        w = new Wierzcholek(77, "G");
        w.dodajSasiada(66, 2);
        w.dodajSasiada(44, 11);
        w.dodajSasiada(55, 7);
        graf.dodajWierzcholek(w);

        w = new Wierzcholek(88, "H");
        w.dodajSasiada(33, 8);
        w.dodajSasiada(22, 7);
        w.dodajSasiada(11, 3);
        graf.dodajWierzcholek(w);

        w = new Wierzcholek(99, "I");
        w.dodajSasiada(44, 6);
        w.dodajSasiada(55, 15);
        w.dodajSasiada(66, 4);
        graf.dodajWierzcholek(w);

        graf.dijkstra(11, 55);

    }
}