package pl.sda.strategy.asynchroniczna_pralka;

//      Stworzymy aplikację symulującą pracę pralki (asynchronicznie).
//  Pralka ma programy prania które wykonuje.
//  W zależności od wybranego programu pralka zachowuje się inaczej i wykonuje inną czynność podczas prania.
//  Stworzymy pralkę która po ustawieniu trybu i włączeniu rozpoczyna pracę, a my możemy ją kontrolować,
//  czyli np. przerwać tą pracę.

public class Main {
    public static void main(String[] args) {
        Pralka pralka = new Pralka();

        pralka.setTrybPracy(new SzybkiePranie());

        pralka.startPralka();
    }
}