package pl.sda.zapis.zad6;

//Zmodyfikuj kod z zadania 5. w powyższym zadaniu wypełnialiśmy 1 raz formularz.
// Tym razem otwieraj aplikację i dopisuj dane z wypełnionych formularzy na końcu pliku.
// Po zakończeniu wypełniania formularza nie kończ pracy programu tylko zadaj użytkownikowi pytanie
// o to czy chce wypełnić formularz ponownie, czy chce zakończyć program. Zakończ program jeśli
// użytkownik wpisze że nie chce wypełniać kolejnego formularza.


import pl.sda.zapis.zad5.Formularz;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean czyPracuje = true;
        while (czyPracuje) {
            Formularz formularz = new Formularz();

            System.out.println("Wiek?");
            formularz.setWiek(scanner.nextInt());

            System.out.println("Wzrost?");
            formularz.setWzrost(scanner.nextInt());

            System.out.println("Czy jesteś kobietą?");
            formularz.setCzyKobieta(scanner.nextBoolean());

            System.out.println("Zarobki?");
            formularz.setZarobki(scanner.nextInt());

            System.out.println("Czy masz psa?");
            formularz.setCzyMaPsa(scanner.nextBoolean());

            System.out.println("Numer buta?");
            formularz.setRozmiarButa(scanner.nextInt());

            try (PrintWriter writer = new PrintWriter(new FileWriter("formularze.txt", true))) {
                writer.println(formularz.zwrocWFormacie());
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Czy chcesz kontynuować??");
            if(!scanner.nextBoolean()){
                czyPracuje = false;
            }
        }
    }
}