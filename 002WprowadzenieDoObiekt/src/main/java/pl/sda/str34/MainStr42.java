package pl.sda.str34;

//        1.Uniemożliw cwaniaczkowi generowanie wirtualnych pieniędzy
//        2.Zmień akcesorydla pól klasy KontoBankowe
//        3.Zobacz jak teraz zachowa się kod cwaniaczka

public class MainStr42 {
    public static void main(String[] args) {
        KontoBankowe kontoAndrzeja = new KontoBankowe(2222,3000);
        KontoBankowe kontoCwaniaczka = new KontoBankowe(1111,0);

        //      kontoCwaniaczka.stanKonta = 1000000;

        kontoAndrzeja.wyswietlStanKonta();
        kontoCwaniaczka.wyswietlStanKonta();
    }
}
