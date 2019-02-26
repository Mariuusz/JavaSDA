package pl.sda.str53.Kolekcje;

//  1.Utwórz listę kilku elementów typu String, a następnie prześledź:
//        1.Działanie metody add(E e)
//        2.Działanie metody set(E e, intindex)
//        3.Działanie metody indexOf(Object o)
//        4.Działanie metody lastIndexOf(Object o)
//        5.Działanie metody remove(Object o)
//        6.Działanie metody remove(indexint)
//  2.Utwórz metodę do wyświetlania zduplikowanych elementów w liście
//  3.Utwórz metodę do usuwania zduplikowanych elementów w liście


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Marek");
        lista.add("Ania");
        lista.add("Marek");
        lista.add("Asia");
        lista.add("Asia");
        lista.add("Marek");
        lista.add("Zenek");
        lista.add("Zenek");
        lista.add("Marek");

//        lista.set(1,"Beata");
//        System.out.println(lista);
//
//        System.out.println(lista.indexOf("Marek"));
//        System.out.println(lista.lastIndexOf("Marek"));
//        lista.remove("Marek");
//        System.out.println(lista);
//        lista.remove(7);
//        System.out.println(lista);

        usunDuplikaty(lista);

    }

    public static void usunDuplikaty(List<String> lista) {
        String[] tab = new String[lista.size()];
        tab = lista.toArray(tab);
        List<String> nowa = new ArrayList<>();

        while (!(lista.isEmpty())) {

            String element = lista.get(0);
            for (int j = 0; j < tab.length; j++) {
                if (element == tab[j]) {
                    lista.remove(lista.lastIndexOf(element));
                }
            }
            nowa.add(element);
        }
        System.out.println(nowa);
    }


}
