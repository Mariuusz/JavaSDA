package pl.sda.str34;

//1.Utwórz klasę KontoBankowe
//        2.Nadaj pola publiczne :
//        •numerKonta: long
//        •stanKonta: int
//        3.Utwórz metody:
//        •wyswietlStanKonta():void
//        •wplacSrodki(int):void
//        •pobierzSrodki(int):int
//        4.Utwórz 2 obiekty:
//        1.kontoAndrzeja(123L, 1000)
//        2.kontoBeaty(555L, 2000)
//        3.Przetestuj przesyłpieniędzy pomiędzy kontami

public class KontoBankowe {

    private long numerKonta;
    private int stanKonta;

    public KontoBankowe(long numerKonta, int stanKonta) {
        this.numerKonta = numerKonta;
        this.stanKonta = stanKonta;
    }

    public static void main(String[] args) {
        KontoBankowe kontoAndrzeja = new KontoBankowe(123L,1000);
        KontoBankowe kontoBeaty = new KontoBankowe(555L,2000);

        System.out.println("Przelew od Andrzeja do Beaty na kwotę 200");
        System.out.println("Przed przelewem");
        kontoAndrzeja.wyswietlStanKonta();
        kontoBeaty.wyswietlStanKonta();
        wykonajPrzelew(kontoAndrzeja, kontoBeaty, 200);
        System.out.println("Po przelewie");
        kontoAndrzeja.wyswietlStanKonta();
        kontoBeaty.wyswietlStanKonta();
//        nie ma zabezpieczenia
//        kontoAndrzeja.stanKonta = 100000000;
    }

    public void wyswietlStanKonta(){
        System.out.println(stanKonta);
    }

    public void wplacSrodki(int kwota){
        stanKonta+=kwota;
    }

    public int pobierzSrodki(int kwota){
        if (kwota>stanKonta){
            System.out.println("Za malo srodkow");
            return 0;
        }else {
            stanKonta-=kwota;
            return kwota;
        }
    }

    public static void wykonajPrzelew(KontoBankowe nadawca, KontoBankowe odbiorca,
                                      int kwota) {
        int srodki = nadawca.pobierzSrodki(kwota);
        odbiorca.wplacSrodki(srodki);
    }
}