package pl.sda.divo.zad8;

//Za pomocą stosu (LinkedList) zamień liczbę na jej wartość binarną.
//        func bin(n)
//        dopóki n > 0
//        odłóż na stos n % 2
//        n = n / 2
//        zwróć stos
//
//        Następnie
//        dopóki stos nie jest pusty wyświetl po kolei elementy ze stosu.
//
//        LinkedList<Integer> stos = new LinkedList<>();
//        stos.push(i);  - umieść element na stosie
//        stos.pop();    - pobierz i usuń element ze stosu
//        stos.isEmpty() - sprawdź czy stos jest pusty.
//
//        Rozwinięcie:
//        2. Spróbuj to samo zrobić dla innych systemów, eg. ósemkowy, szesnastkowy

import java.util.LinkedList;

public class Main {
    public static void bin(Integer n) {
        LinkedList<Integer> stos = new LinkedList<>();
        Integer m = n;
        for (; m > 0 ;) {
            stos.push(m % 16);
            m = m / 16;
        }
        System.out.println(n);
        System.out.println("********");
        for (;stos.size() > 0;){
            Integer number = stos.pop();
            if (number>9){
                System.out.print((char)(number+55));
            }else System.out.println(number);
        }
//        System.out.println(stos);
    }

    public static void main(String[] args) {
        bin(171);

    }
}