package pl.sda.zad2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SklepKomputerowy {

    private List<Komputer> list = new ArrayList<Komputer>();
    private List<OfertaSprzedazy> listOffers = new ArrayList<OfertaSprzedazy>();

    public SklepKomputerowy(List<Komputer> list, List<OfertaSprzedazy> listOffers) {
        this.list = list;
        this.listOffers = listOffers;
    }

    // wypiszWszystkieKomputery():void
    public void wypiszWszystkieKomputery() {
//        for (Komputer komputer : list) {
//            System.out.println(komputer);
//        }
        list.stream().forEach(komputer -> System.out.println(komputer));
    }

    // wypiszKomputeryOMocyWyższejNiż(int):void
    public void wypiszKomputeryOMocyWyższejNiż(int moc) {
        // opcja A
//        for (Komputer komputer : list) {
//            if (komputer.getPobieranaMoc() > moc) {
//                System.out.println(komputer);
//            }
//        }

        // opcja B
        list.stream().forEach(komputer -> {
            if (komputer.getPobieranaMoc() > moc) {
                System.out.println(komputer);
            }
        });

        // opcja C
        list.stream()
                .filter(komputer -> komputer.getPobieranaMoc() > moc)
                .forEach(komputer -> { // foreach println na odfiltrowanych komputerach
                    System.out.println(komputer);
                });
    }

    public void wypiszCenyNazwyIIdentyfikatoryWszystkichKomputerow() {

        // Opcja A - bez mapowania
//        list.stream().forEach(komputer -> System.out.println(komputer.getIdentyfikatorProduktu()));

        // Opcja B - z mapowaniem - wersja rozszerzona
        list.stream().map(new Function<Komputer, Integer>() {
            @Override
            public Integer apply(Komputer komputer) {
                return komputer.getIdentyfikatorProduktu();
            }
        }).forEach(identyfikator -> System.out.println(identyfikator));

        // Opcja C - z mapowaniem
//        list.stream()
//                .map(komputer -> komputer.getIdentyfikatorProduktu())
//                .forEach(identyfikator -> System.out.println(identyfikator));
    }

    public List<Komputer> zwróćWszystkieKomputery() {
        // Opcja A
//        return list;

        // Opcja B
        return list.stream().collect(Collectors.toList());
    }

    public void wypiszWszystkieKomputeryZDwomaProcesorami() {
        for (Komputer komputer : list) {
            if (komputer.getIlośćProcesorów() == 2) {
                System.out.println(komputer);
            }
        }

        // Opcja A
        list.stream().filter(komputer -> komputer.getIlośćProcesorów() == 2)
                .forEach(komputer -> System.out.println(komputer));
    }


    public List<Komputer> zwróćWszystkieKomputeryZDwomaProcesorami() {
//        List<Komputer> komputers = new ArrayList<>();
//        for (Komputer komputer : list) {
//            if(komputer.getIlośćProcesorów() == 2){
//                System.out.println(komputer);
//                komputers.add(komputer);
//            }
//        }
//        return komputers;

        // Opcja A
        return list.stream().filter(komputer -> komputer.getIlośćProcesorów() == 2)
                .collect(Collectors.toList());
    }

    //zwróćKomputeryZPamięciąORozmiarze(int):List<Komputer>
    public List<Komputer> zwróćKomputeryZPamięciąORozmiarze(int rozmiar) {
        return list.stream().filter(komputer -> komputer.getWielkośćPamięciRAM() > rozmiar)
                .collect(Collectors.toList());
    }

    public List<Komputer> zwróćTylkoKomputeryZTurboIProcesoremPowyzej4() {
//        return list.stream()
//                .filter(komputer -> komputer.getIlośćProcesorów() > 4)
//                .filter(komputer -> komputer.isCzyProcesorMaTurbo())
//                .collect(Collectors.toList());
        return list.stream()
                .filter(komputer -> komputer.getIlośćProcesorów() > 4 && komputer.isCzyProcesorMaTurbo())
                .collect(Collectors.toList());
    }

    public List<Komputer> zwróćKomputeryPosortowaniePoIdentyfikatorze() {
//        return list.stream()
//                .sorted(new Comparator<Komputer>() {
//                    @Override
//                    public int compare(Komputer o1, Komputer o2) {
//                        if(o1.getIdentyfikatorProduktu() > o2.getIdentyfikatorProduktu()) return 1;
//                        else if(o1.getIdentyfikatorProduktu() < o2.getIdentyfikatorProduktu()) return -1;
//                        return 0;
//                    }
//                }).collect(Collectors.toList());
        return list.stream()
                .sorted(((o2, o1) -> Integer.compare(o1.getIdentyfikatorProduktu(), o2.getIdentyfikatorProduktu())))
                .collect(Collectors.toList());
    }

    public List<Komputer> zwróćKomputeryPosortowaniePoCenieMalejąco() {
        return list.stream()
                .sorted(((o2, o1) -> Double.compare(o1.getCena(), o2.getCena())))
                .collect(Collectors.toList());
    }

    public List<Komputer> zwróćKomputeryPosortowaniePoCenieRosnąco() {
        return list.stream()
                .sorted(((o1, o2) -> Double.compare(o1.getCena(), o2.getCena())))
                .collect(Collectors.toList());
    }

    public Optional<Komputer> zwróćNajbardziejOpłacalnyKomputer() {
        Optional<Komputer> komputer = list.stream()
                // najmniej opłacalny otrzymamy gdy odwrócimy parametry
                .sorted(((o1, o2) -> Double.compare(o1.getCena() / o1.getCzęstotliwośćProcesora(), o2.getCena() / o2.getCzęstotliwośćProcesora())))
                .findFirst();

        // ZŁE!
//        if (komputer.isPresent())
//            // jeśli komputera nie ma w pudełku (Optional) może wystąpić exception
//            return komputer.get();
//        else
//            return null;

        return komputer;
    }

    public List<OfertaSprzedazy> zwróćOfertyWszystkichKomputerówBezRabatów() {
//        return list.stream()
//                // zamieniam (mapuję) komputer na ofertę
//                .map(komputer -> new OfertaSprzedazy(komputer, 0.0))
//                .collect(Collectors.toList());

        return listOffers.stream()
                .filter(ofertaSprzedazy -> (ofertaSprzedazy.getRabatProcentowo() == 0.0))
                .collect(Collectors.toList());

    }

    public List<OfertaSprzedazy> zwróćOfertyWszystkichKomputerówZRabatem(int rabat){
        return list.stream()
                // zamieniam (mapuję) komputer na ofertę
                .map(komputer -> new OfertaSprzedazy(komputer, rabat))
                .collect(Collectors.toList());
    }

    public List<OfertaSprzedazy> zwróć3NajdroższeKomputeryPoRabacie5Procent(){
        return list.stream()
                // zamieniam (mapuję) komputer na ofertę
                .map(komputer -> new OfertaSprzedazy(komputer, 5.0))
                .sorted((o1, o2) -> Double.compare(o2.getOstatecznaCena(), o1.getOstatecznaCena()))
                .limit(3)
                .collect(Collectors.toList());
    }

    // zwróćOfertyZRabatem10():List<OfertaSprzedaży>
    public List<OfertaSprzedazy> zwróćOfertyZRabatem10(){
        return list.stream()
                // zamieniam (mapuję) komputer na ofertę
                .map(komputer -> new OfertaSprzedazy(komputer, 10.0))
                .collect(Collectors.toList());
    }


}