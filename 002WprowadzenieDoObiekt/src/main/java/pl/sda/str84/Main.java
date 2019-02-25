package pl.sda.str84;

public class Main {
    public static void main(String[] args) {
        Samochod auto = new Samochod("czarny", "BMW", 2015);
        Kabriolet kab = new Kabriolet("czerwony", "AUDI", 2017);

        for (int i = 0; i < 20; i++) {

//            auto.przyspiesz();
//            auto.wlaczSwiatla();
//            kab.schowajDach();
            kab.przyspiesz();
            kab.schowajDach();
        }

    }
}