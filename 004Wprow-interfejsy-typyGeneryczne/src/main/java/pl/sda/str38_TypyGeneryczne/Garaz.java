package pl.sda.str38_TypyGeneryczne;

//        1.Utwórz klasę generyczną Garaż, która umożliwia przechowywanie 2 Samochodów
//        2.Utwórz klasę Samochodz polami:
//            1.Marka
//            2.Model
//            3.Kolor
//        3.Oraz metodami:
//            1.toString() –zwracające opis auta
//            2.zmieńKolor(String kolor)
//        4.Utwórz klasy BMW i Porshe dziedziczące po Samochodzie z mniejsząliczbą argumentów
//        5.Dodaj metody do klasy Garaż:
//            1.zaparkuj(auto) :void
//            2.wyprowadz(auto):auto
//        6.* Utwórz własny wyjątek na sytuację gdy oba miejsca są już zajęte i nie można zaparkować kolejnego auta

public class Garaz <T>{
    private T auto;

    public Garaz(T auto) {
        this.auto = auto;
    }

    public static void main(String[] args) {
        Samochod bmw = new BMW("Z4","czerwony");
        bmw.zmieńKolor("czarny");
        System.out.println(bmw.toString());

    }
//    TODO:
//            1.zaparkuj(auto) :void
//            2.wyprowadz(auto):auto
//        6.* Utwórz własny wyjątek na sytuację gdy oba miejsca są już zajęte i nie można zaparkować kolejnego auta
}
