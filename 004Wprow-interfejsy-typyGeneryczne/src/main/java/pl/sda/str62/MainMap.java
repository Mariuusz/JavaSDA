package pl.sda.str62;

//      1.Utwórz klasę MainMap a w niej metodę psvm
//      2.Utwórz hashmapę gdzie kluczem będzie String –imię a wartościaint–wiek
//      3.Dodaj do mapy kilka wystąpień
//      4.Wyświetl mapę (sout)
//      5.Spróbuj dodać do mapy obecny już klucz z inna wartością –co się stanie?
//      6.Przeiterujmapę za pomocą pętli for (.keySet())
//      7.Sprawdź zachowanie dla innych implementacji mapy:
//        1.LinkedHashMap
//        2.TreeMap

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainMap {
    public static void main(String[] args) {

        Map<String,Integer> mapa = new HashMap<>();

        mapa.put("d",4);
        mapa.put("a",1);
        mapa.put("c",3);
        mapa.put("b",2);
        mapa.put("d",5);

        System.out.println(mapa);

        Map<String,Integer> mapaL = new LinkedHashMap<>();
        mapaL.put("d",4);
        mapaL.put("a",1);
        mapaL.put("c",3);
        mapaL.put("b",2);
        mapaL.put("d",5);
        System.out.println(mapaL);
        Map<String,Integer> mapaT = new TreeMap<>();
        mapaT.put("d",4);
        mapaT.put("a",1);
        mapaT.put("c",3);
        mapaT.put("b",2);
        mapaT.put("d",5);
        System.out.println(mapaT);

        for (String liczba: mapa.keySet()){
            // przypisuje tylko klucz do nowego stringa
            System.out.println(liczba);
        }
    }
}
