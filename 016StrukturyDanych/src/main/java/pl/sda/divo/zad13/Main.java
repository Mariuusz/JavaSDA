package pl.sda.divo.zad13;

//Przygotuj interfejs Figura
//interface Figura:
//        getField();
//        getName();
//
//        Następnie zaimplementuj kilka klas implementujących ten interfejs
//class Kwadrat implements Figura:
//        getField();
//        getName();
//class Trójkąt implements Figura:
//        getField();
//        getName();
//class Koło implements Figura:
//        getField();
//        getName();
//
//        Zaimplementuj odpowiednio metody tych klas.
//
//        2. Przygotuj kilka obiektów tych klas:
//        kwadrat1 = new Kwadrat(11);
//        kwadrat2 = new Kwadrat(15);
//        kwadrat3 = new Kwadrat(7);
//
//        trojkat1 = new Trójkąt(7, 5);
//        trojkat2 = new Trójkąt(11, 4);
//        trojkat3 = new Trójkąt(32, 10);
//
//        kolo1 = new Koło(11);
//        kolo2 = new Koło(7);
//        kolo3 = new Koło(20);
//
//        3. Dodaj wszystkie obiekty do mapy:
//        Map<String, Figura> figury;
//        Gdzie kluczem będzie unikalna nazwa figury
//
//        4. Wyświetl w pętli wszystkie wartości z mapy w formacie:
//        klucz => nazwa - pole

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//    2. Przygotuj kilka obiektów tych klas:
        Kwadrat kwadrat1 = new Kwadrat(11);
        Kwadrat kwadrat2 = new Kwadrat(15);
        Kwadrat kwadrat3 = new Kwadrat(7);

        Trojkat trojkat1 = new Trojkat(7, 5);
        Trojkat trojkat2 = new Trojkat(11, 4);
        Trojkat trojkat3 = new Trojkat(32, 10);

        Kolo kolo1 = new Kolo(11);
        Kolo kolo2 = new Kolo(7);
        Kolo kolo3 = new Kolo(20);

//    3. Dodaj wszystkie obiekty do mapy:
//      Gdzie kluczem będzie unikalna nazwa figury
        Map<String, Figura> figury = new HashMap<>();
        figury.put("kwadrat1", kwadrat1);
        figury.put("kwadrat2", kwadrat2);
        figury.put("kwadrat3", kwadrat3);

        figury.put("trojkat1", trojkat1);
        figury.put("trojkat2", trojkat2);
        figury.put("trojkat3", trojkat3);

        figury.put("kolo1", kolo1);
        figury.put("kolo2", kolo2);
        figury.put("kolo3", kolo3);

//        4. Wyświetl w pętli wszystkie wartości z mapy w formacie:
//        klucz => nazwa - pole
        for (Map.Entry<String, Figura> figura : figury.entrySet()) {
            System.out.println(figura.getKey() + " => " + figura.getValue().getName() + " - " + figura.getValue().getField());
        }
    }
}