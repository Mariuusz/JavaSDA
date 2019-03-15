package pl.sda.zad3;

//Zadanie pociągi:
//        Stwórz enum KlasaPociągu: EKONOMIA, STANDARD, BIZNES, EKSKLUZYWNY
//        Stwórz klasę Pociąg, która posiada:
//        - pole :
//        - String identyfikator;
//        - int numerPociągu;
//        - KlasaPociągu klasa;
//        - int maxOpóźnienie;
//        - int długośćPodróży;
//        - int cenaPodróży;
//        - int przebieg;
//        - boolean czyPosiadaWagonSypialny;
//        - metody:
//        - wypiszWszystkiePociągi():void
//        - wypiszWszystkieEkonomicznePociągi():void
//        - zwróćPociągiKlasy(KlasaPociągu):List<Pociąg>
//        - zwróćNajbardziejOpóźniony():Pociąg
//                - zwróć3NajbardziejOpóźnione():List<Pociąg>
//        - zwróćNajbardziejOpłacalny():Pociąg
//                - zwróć3NajbardziejOpłacalne():List<Pociąg> (których cena/długość jest najwyższa)
//        - wypiszPociągiPosortowanymiNumeramiPociągu():void
//        - zwróćWszystkieDostępneKlasyPociągów():Set<KlasaPociągu>
//        (wykorzystaj mapowanie oraz zbieraj [collect] do zbioru)
//                - zwróćKlasyBiznesZSypialnianymi():List<Pociąg>

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<KlasaPociagu> enumy = new ArrayList<>(Arrays.asList(KlasaPociagu.values()));
        Random random = new Random();
        Pociag pociag1 = new Pociag("Jeden", 1, enumy.get(random.nextInt(KlasaPociagu.values().length - 1) + 1), 50, 600, 30, 500000, true);
        Pociag pociag2 = new Pociag("Dwa", 2, enumy.get(random.nextInt(KlasaPociagu.values().length - 1) + 1), 15, 60, 45, 156300, true);
        Pociag pociag3 = new Pociag("Trzy", 3, enumy.get(random.nextInt(KlasaPociagu.values().length - 1) + 1), 35, 50, 85, 1965000, false);
        Pociag pociag4 = new Pociag("Cztery", 4, enumy.get(random.nextInt(KlasaPociagu.values().length - 1) + 1), 2, 10, 5, 5986500, false);
        Pociag pociag5 = new Pociag("Piec", 5, enumy.get(random.nextInt(KlasaPociagu.values().length - 1) + 1), 100, 800, 115, 54300, true);
        Pociag pociag6 = new Pociag("Szesc", 6, KlasaPociagu.EKONOMIA, 18, 85, 63, 953160, false);
        Pociag pociag7 = new Pociag("Siedem", 7, enumy.get(random.nextInt(KlasaPociagu.values().length - 1) + 1), 50, 600, 30, 500000, true);
        Pociag pociag8 = new Pociag("Osiem", 8, enumy.get(random.nextInt(KlasaPociagu.values().length - 1) + 1), 15, 60, 45, 156300, true);
        Pociag pociag9 = new Pociag("Dziewiec", 9, enumy.get(random.nextInt(KlasaPociagu.values().length - 1) + 1), 35, 50, 85, 1965000, false);
        Pociag pociag10 = new Pociag("Dziesiec", 10, enumy.get(random.nextInt(KlasaPociagu.values().length - 1) + 1), 2, 10, 5, 5986500, false);
        Pociag pociag11 = new Pociag("Jedenascie", 11, enumy.get(random.nextInt(KlasaPociagu.values().length - 1) + 1), 100, 800, 115, 54300, true);
        Pociag pociag12 = new Pociag("Dwanascie", 12, KlasaPociagu.EKONOMIA, 18, 85, 63, 953160, false);

        List<Pociag> listaPociagow = new ArrayList<>(Arrays.asList(pociag1, pociag2, pociag3, pociag4, pociag5, pociag6,pociag7,pociag8,pociag9,pociag10,pociag11,pociag12));
        PKP pkp = new PKP(listaPociagow);
//        pkp.wypiszWszystkiePociągi();
//        pkp.wypiszWszystkieEkonomicznePociągi();
//        System.out.println(pkp.zwróćPociągiKlasy(KlasaPociagu.EKONOMIA));
//        System.out.println(pkp.zwróćNajbardziejOpóźniony());
//        System.out.println(pkp.zwróć3NajbardziejOpóźnione());
//        System.out.println(pkp.zwróćNajbardziejOpłacalny());
//        System.out.println(pkp.zwróć3NajbardziejOpłacalne());
//        pkp.wypiszPociągiPosortowanymiNumeramiPociągu();
//        System.out.println(pkp.zwróćWszystkieDostępneKlasyPociągów());
//        System.out.println(pkp.zwróćKlasyBiznesZSypialnianymi());

        for(Pociag p : pkp.zwróćKlasyBiznesZSypialnianymi()){
            System.out.println(p);
        }

    }
}






//        Pociag pociag1 = new Pociag("Jeden", 1, KlasaPociagu.BIZNES, 50, 600, 30, 500000, true);
//        Pociag pociag2 = new Pociag("Dwa", 2,KlasaPociagu.EKSKLUZYWNY , 15, 60, 45, 156300, true);
//        Pociag pociag3 = new Pociag("Trzy", 3,KlasaPociagu.STANDARD , 35, 50, 85, 1965000, false);
//        Pociag pociag4 = new Pociag("Cztery", 4,KlasaPociagu.EKSKLUZYWNY , 2, 10, 5, 5986500, false);
//        Pociag pociag5 = new Pociag("Piec", 5,KlasaPociagu.EKONOMIA , 100, 800, 115, 54300, true);
//        Pociag pociag6 = new Pociag("Szesc", 6,KlasaPociagu.BIZNES , 18, 85, 63, 953160, false);