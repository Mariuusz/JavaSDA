package pl.sda.str70.zad1;

//      1.Zgadnij hasło –utwórz program obiektowy, który pozwala użytkownikowi zagrać w grę na poniższych zasadach:
//        a.Program losuje numer w zakresie od 1 do 100
//        b.Program pyta się użytkownika o numer
//        c.Jeśli użytkownik zgadnie numer –wypisuje ‘Gratulacje, wygrałeś!’
//        d.Jeśli nie –wypisuje użytkownikowi czy numer jest większy lub mniejszy od podanej przez użytkownika liczby
//        e.* Użytkownik sam określa zakres
//        f.* Po 5 nieudanych próbach program wypisuje ‘Niestety, przegrałeś’

import java.util.Random;
import java.util.Scanner;

public class Gra {
    private int tajneHasło;

    public Gra(int a, int b){
        Random random = new Random();
        tajneHasło = a + random.nextInt(b-a);
    }

    public void graj(){
        int podaneHasło;
        Scanner scanner = new Scanner(System.in);

        // licznik

        int licznik = 0;
        do {
            System.out.println("Podaj liczbę");
            podaneHasło = scanner.nextInt();
            licznik++;
            if (podaneHasło>tajneHasło){
                System.out.println("Podana liczba jest za duża");
            }else if (podaneHasło<tajneHasło){
                System.out.println("Podana liczba jest za mała");
            }
        }while (podaneHasło!=tajneHasło && licznik<5); // dodać licznik
        if (podaneHasło == tajneHasło){
            System.out.println("Gratulacje, odgadłeś tajne hasło: "+tajneHasło);
        }else {
            System.out.println("Przegrałeś, a hasło to: " + tajneHasło);
        }
    }
}