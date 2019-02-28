package pl.sda.zad3;

//3. Stwórz klasę generyczną Para, która przyjmuje dwa obiekty - obiekt prawy i lewy. Niech klasa będzie generyczna.
// Typy obiektów (lewego i prawego) klasy mają być podane przy tworzeniu obiektu (generyczne).
// Stwórz kilka obiektów tego typu a następnie dodaj je do tablicy.
//
//  3B*. Stwórz metodę generyczną 'znajdźNiepuste(Para[]):Para[]' która iteruje tablicę obiektów typu 'Para'
//  i znajduje tylko niepuste pary (obiekt prawy i lewy mają być niepuste (!=null).

public class Main {
    public static void main(String[] args) {

        Para para1 = new Para("owoce",null);
        Para para2 = new Para(null,null);
        Para para3 = new Para("nabial","2kg");
        Para para4 = new Para("banan",3.5);

        Para[] pary = new Para[]{para1,para2,para3,para4};

        for (Para p: znajdzNiepuste(pary) ){
            System.out.println(p.toString());
        }




    }
    public static  <T> Para[] znajdzNiepuste(Para[] pary){
        int licznik = 0;
        for (Para p: pary){
            if (p.getLewy() != null && p.getPrawy() != null){
                licznik++;
            }
        }
        Para[] niepusta = new Para[licznik];
        licznik =0;
        for (Para p : pary){
            if (p.getLewy() != null && p.getPrawy() != null){
                niepusta[licznik] = p;
                licznik++;
            }
        }
        return niepusta;
    }
}
