package pl.sda.zad5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Metoda generyczna i statyczna która jako parametr przyjmuje Varargs T. Wynikiem metody jest :
 a) Lista
 b) Zbiór
 zawierający wszystkie te elementy.
 List<String> list = Arrays.asList("awdawd", "awawd" , "awdawd");
 */


public class MainVarargsSet {
    public static void main(String[] args) {
        List<Double> strings = dodajDoListy(2.4,3.9,8.6,1.5,5.0);
    }
    public static <T> List<T> dodajDoListy(T... elementy){
        List<T> lista = new ArrayList<T>();
        for (T element : elementy) {
            lista.add(element);
        }
        return lista;
    }
    public static <T> Set<T> dodajDoZbioru(T... elementy){
        Set<T> zbiór = new HashSet<T>();
        for (T element : elementy) {
            zbiór.add(element);
        }
        return zbiór;
    }
}