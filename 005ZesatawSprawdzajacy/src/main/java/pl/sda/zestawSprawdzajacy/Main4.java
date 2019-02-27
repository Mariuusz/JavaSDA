package pl.sda.zestawSprawdzajacy;

//        4. Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie sprawdza,
//          czy podany ciąg jest palindromem.
//        Pamiętaj! Wielkość liter nie ma znaczenia. (tzn Kajak i kajak są palindromami)

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String wyrazenie = new Scanner(System.in).nextLine();
        for (int i = 0; i < wyrazenie.length()/2; i++) {
            char znakOdPoczatku = wyrazenie.charAt(i);
            char znakOdKonca = wyrazenie.charAt(wyrazenie.length()-1-i);
            System.out.println("poczatek: " + znakOdPoczatku + " koniec: " + znakOdKonca);
            if(znakOdKonca != znakOdPoczatku){
                System.out.println("Nie jest palindromem!");
                break;
            }
        }
    }
}
