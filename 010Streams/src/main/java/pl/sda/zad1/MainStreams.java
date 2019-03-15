package pl.sda.zad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainStreams {
    public static void main(String[] args) {
        Osoba o1 = new Osoba("a", "b", 1);
        Osoba o2 = new Osoba("g", "bz", 12);
        Osoba o3 = new Osoba("gg", "bc", 31);
        Osoba o4 = new Osoba("ggg", "bb", 41);
        Osoba o5 = new Osoba("awd", "bh", 15);
        Osoba o6 = new Osoba("ad", "bg", 16);
        Osoba o7 = new Osoba("aw", "bd", 71);
        Osoba o8 = new Osoba("aa", "xb", 81);
        List<Osoba> list = new ArrayList<Osoba>(Arrays.asList(o1, o2, o3, o4, o5, o6, o7, o8));
        // długi
        ConsumerOsoba consumerOsoba = new ConsumerOsoba();
        // krótszy
//        Consumer<Osoba> consumer = new Consumer<>(){
//            @Override
//            public void accept(Osoba osoba) {
//                  System.out.println(osoba);
//            }
//        };
//
//        list.stream().forEach(consumer);
        // krótki
//        list.stream().forEach(new Consumer<>(){
//            @Override
//            public void accept(Osoba osoba) {
//                System.out.println(osoba);
//            }
//        });
        // lambda - najkrócej
        // wypisanie wszystkich osób
//        list.stream().forEach((osoba) -> {
//            System.out.println(osoba);
//        });
        // wypisanie wszystkich osób z wiekiem powyżej 18
//        list.stream().forEach((osoba) -> {
//            if (osoba.getWiek() > 18) {
//                System.out.println(osoba);
//            }
//        });
        // Pierwsza forma (nie anonimowo)
//        FilterAgeOsoba filterAgeOsoba = new FilterAgeOsoba();
//        list.stream()
//                .filter(filterAgeOsoba)
//                .forEach((osoba) -> {
//                    System.out.println(osoba);
//                });
        // anonimowe
        list.stream()
                .filter(new Predicate<Osoba>() {
                    @Override
                    public boolean test(Osoba osoba) {
                        return osoba.getWiek() > 18;
                    }
                })
                .forEach((osoba) -> {
                    System.out.println(osoba);
                });
        // lambda
        list.stream()
                .filter((osoba) -> {
                    return osoba.getWiek() > 18;
                })
                .forEach((osoba) -> {
                    System.out.println(osoba);
                });
        List<Pracownik> pracowniks = new ArrayList<>();
        for (Osoba osoba : list) {
            Pracownik pracownik = new Pracownik(osoba.getImie(), 2300.0);
            pracowniks.add(pracownik);
        }
        System.out.println(pracowniks);
//        OsobaKonwerter konwerter = new OsobaKonwerter();
//        list.stream()
//                .map(konwerter)
//                .forEach((pracownik -> {
//                    System.out.println(pracownik);
//                }));
//
        list.stream()
                .map(new Function<Osoba, Pracownik>() {
                    @Override
                    public Pracownik apply(Osoba osoba) {
                        return new Pracownik(osoba.getImie(), 2300.0);
                    }
                })
                .forEach((pracownik -> {
                    System.out.println(pracownik);
                }));
//        list.stream()
//                .map((osoba) -> {
//                    return new Pracownik(osoba.getImie(), 2300.0);
//                })
//                .forEach((pracownik -> {
//                    System.out.println(pracownik);
//                }));
        List<Pracownik> wynik = list.stream()
                .map((osoba) -> {
                    return new Pracownik(osoba.getImie(), 2300.0);
                })
                .collect(Collectors.toList());
    }
}