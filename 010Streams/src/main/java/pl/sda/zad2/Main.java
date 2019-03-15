package pl.sda.zad2;

//Stwórz klasę Komputer, która powinna posiadać:
//        - pola:
//        int identyfikatorProduktu;
//        double częstotliwośćProcesora;
//        boolean czyProcesorMaTurbo;
//        double wielkośćPamięciRAM;
//        double wielkośćDysku;
//        double cena;
//        int ilośćProcesorów;
//        String nazwa; //model/nazwa/marka
//        int pobieranaMoc; // moc w kW
//
//        Niech klasa Komputer będzie klasą POJO.
//        Dodaj do klasy konstruktor ze wszystkimi parametrami.
//        Stwórz klasę SklepKomputerowy, który posiada pole:
//        - List<Komputer> listaKomputerów; // w ofercie
//
//        dodaj do klasy metody (zwróć uwagę na typ zwracany metody (po dwukropku) oraz typy parametrów (w nawiasach):
//        - wypiszWszystkieKomputery():void
//        (powyższa metoda powinna wykorzystywać 'forEach')
//        - wypiszKomputeryOMocyWyższejNiż(int):void
//        (powyższa metoda powinna wykorzystywać 'forEach' i może [ale nie musi] 'filter')
//        - wypiszCenyNazwyIIdentyfikatoryWszystkichKomputerow():void
//        (powyższa metoda powinna wykorzystywać 'forEach' - trzeba inaczej sformatować linię)
//        - zwróćWszystkieKomputery():List<Komputer>
//    (powyższa metoda powinna wykorzystywać 'collect(Collectors.toList())')
//            - wypiszWszystkieKomputeryZDwomaProcesorami():void
//            - zwróćWszystkieKomputeryZDwomaProcesorami():List<Komputer>
//
//    - zwróćKomputeryZPamięciąORozmiarze(int):List<Komputer>
//    - zwróćTylkoKomputeryZTurboIProcesoremPowyzej4():List<Komputer>

//    - zwróćKomputeryPosortowaniePoIdentyfikatorze():List<Komputer>
//    - zwróćKomputeryPosortowaniePoCenieMalejąco():List<Komputer>
//    - zwróćKomputeryPosortowaniePoCenieRosnąco():List<Komputer>
//    - zwróćNajbardziejOpłacalnyKomputer():Komputer
//            (powyższa metoda powinna wykorzystywać sortowanie obiektów, oraz metodę findFirst)
//            - zwróćNajmniejOpłacalnyKomputer():Komputer
//            - zwróćKomputeryZPamięciąORozmiarze(int):List<Komputer>

//Do zadania z komputerami:
//        Stwórz klasę OfertaSprzedaży, która jako pole posiada:
//        - Komputer komputer;
//        - double rabatProcentowo;
//        - double ostatecznaCena;
//        Dodaj do (wcześniej stworzonego) sklepu :
//        - zwróćOfertyWszystkichKomputerówBezRabatów():List<OfertaSprzedaży>
//        - zwróćOfertyWszystkichKomputerówZRabatem(int):List<OfertaSprzedaży>
//        - zwróć3NajdroższeKomputeryPoRabacie5Procent():List<OfertaSprzedaży>
//        - zwróćOfertyZRabatem10():List<OfertaSprzedaży>

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Komputer komputer1 = new Komputer(1, 2.3, true, 32.0, 512.0, 2300.0, 5, "Acer turbo", 300);
        Komputer komputer2 = new Komputer(2, 2.5, false, 16.0, 256.0, 1300.0, 3, "Acer not turbo", 350);
        Komputer komputer3 = new Komputer(5, 3.1, false, 8.0, 128.0, 1530.0, 9, "Acer 9 turbo", 1350);
        Komputer komputer4 = new Komputer(10, 1.1, true, 12.0, 60.0, 5130.0, 10, "Acer 10 turbo", 650);
        Komputer komputer5 = new Komputer(7, 4.1, true, 64.0, 30.0, 5000.0, 4, "Acer k4990 turbo", 500);
        Komputer komputer6 = new Komputer(3, 4.4, false, 30.0, 15.0, 4000.0, 3, "Acer 300 turbo", 200);
        Komputer komputer7 = new Komputer(15, 4.4, false, 50.0, 15.0, 5000.0, 3, "Acer 301 turbo", 250);
        Komputer komputer8 = new Komputer(33, 1.2, false, 90.0, 16.0, 6000.0, 2, "Acer 302 turbo", 270);
        Komputer komputer9 = new Komputer(34, 4.5, true, 32.0, 60.0, 7000.0, 2, "Acer 303 turbo", 320);
        Komputer komputer10 = new Komputer(35, 3.4, false, 10.0, 512.0, 13000.0, 2, "Acer 304 turbo", 500);
        Komputer komputer11 = new Komputer(36, 3.3, true, 13.0, 300.0, 300.0, 1, "Acer 305 turbo", 100);
        Komputer komputer12 = new Komputer(37, 2.5, false, 30.0, 365.0, 500.0, 1, "Acer 306 turbo", 400);
        Komputer komputer13 = new Komputer(38, 2.5, false, 7.0, 400.0, 1500.0, 5, "Acer 307 turbo", 40);
        Komputer komputer14 = new Komputer(39, 3.3, true, 8.0, 423.0, 12000.0, 3, "Acer 308 turbo", 260);
        Komputer komputer15 = new Komputer(40, 4.5, true, 4.0, 566.0, 4500.0, 2, "Acer 309 turbo", 270);
        Komputer komputer16 = new Komputer(41, 2.6, true, 2.0, 50.0, 4333.0, 1, "Acer 310 turbo", 270);
        Komputer komputer17 = new Komputer(42, 1.6, false, 6.0, 30.0, 2300.0, 4, "Acer 311 turbo", 240);
        Komputer komputer18 = new Komputer(43, 0.9, false, 30.0, 400.0, 1235.0, 4, "Acer 312 turbo", 240);

        List<Komputer> list = new ArrayList<>(Arrays.asList(komputer1, komputer2, komputer3, komputer4, komputer5, komputer6, komputer7,komputer8,komputer9,komputer10,komputer11,komputer12,komputer13,komputer14,komputer15,komputer16,komputer17,komputer18));

        OfertaSprzedazy oferta1 = new OfertaSprzedazy(komputer1,2.5);
        OfertaSprzedazy oferta2 = new OfertaSprzedazy(komputer3,3.4);
        OfertaSprzedazy oferta3 = new OfertaSprzedazy(komputer5,5.4);
        OfertaSprzedazy oferta4 = new OfertaSprzedazy(komputer7,5.0);
        OfertaSprzedazy oferta5 = new OfertaSprzedazy(komputer9,0.0);
        OfertaSprzedazy oferta6 = new OfertaSprzedazy(komputer12,5.0);
        OfertaSprzedazy oferta7 = new OfertaSprzedazy(komputer13,5.0);
        OfertaSprzedazy oferta8 = new OfertaSprzedazy(komputer15,25.6);
        OfertaSprzedazy oferta9 = new OfertaSprzedazy(komputer18,50.0);


        List<OfertaSprzedazy> ofertaSklepu = new ArrayList<>(Arrays.asList(oferta1,oferta2,oferta3,oferta4,oferta5,oferta6,oferta7,oferta8,oferta9));

        SklepKomputerowy sklep = new SklepKomputerowy(list,ofertaSklepu);

//        sklep.wypiszWszystkieKomputery();
//        sklep.wypiszKomputeryOMocyWyższejNiż(600);
//        sklep.wypiszCenyNazwyIIdentyfikatoryWszystkichKomputerow();
//        System.out.println(sklep.zwróćWszystkieKomputeryZDwomaProcesorami());
//        System.out.println(sklep.zwróćKomputeryPosortowaniePoIdentyfikatorze());
//        System.out.println(sklep.zwróćKomputeryPosortowaniePoCenieMalejąco());
//        System.out.println(sklep.zwróćNajbardziejOpłacalnyKomputer());

//        System.out.println(sklep.zwróćOfertyWszystkichKomputerówBezRabatów());
//        System.out.println(sklep.zwróć3NajdroższeKomputeryPoRabacie5Procent());
        System.out.println(sklep.zwróćOfertyZRabatem10());
    }
}