package pl.sda.zestawSprawdzajacy;

//        3. Napisz program, który sprawdzi, czy w podanym przez użytkownika wyrażeniu
//           arytmetycznym nawiasy są poprawnie sparowane. Wyrażenie podawane jest jako pojedynczy łańcuch znaków.
//           Program powinien wyświetlić stosowny komunikat.
//        Przykład a:
//        "2 * (3.4 - (-7)/2)*(a-2)/(b-1)))"
//        Wynik:
//        Błędne sparowanie nawiasów
//        Przykład b:
//        "(2 * (3.4 - (-7)/2)*(a-2)/(b-1))"
//        Wynik:
//        OK

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        String wyrazenie = new Scanner(System.in).nextLine();
        int otwartych = 0, zamknietych = 0;
        for (int i = 0; i < wyrazenie.length(); i++) {
            if (wyrazenie.charAt(i) == ')') {
                zamknietych++;
            }
            if (wyrazenie.charAt(i) == '(') {
                otwartych++;
            }
            if(zamknietych > otwartych){
                System.out.println("Domknieto nawias bez otwierania");
                break;
            }
        }
        if(zamknietych == otwartych){
            System.out.println("Poprawna ilość nawiasów!");
        }
    }
}