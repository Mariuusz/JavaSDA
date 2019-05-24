package pl.sda.divo.zad9;

//Napisz metodę odwracającą napis za pomocą stosu i wyświetl odwrócony napis na ekran.

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> stos = new LinkedList<>();
        String napis = "napis";
        for (int i = 0; i < napis.length(); i++) {
            stos.push(String.valueOf(napis.charAt(i)));
        }

        int count = stos.size();
        for (int i = 0; i < count; i++) {
            System.out.print(stos.pop());
        }
    }
}