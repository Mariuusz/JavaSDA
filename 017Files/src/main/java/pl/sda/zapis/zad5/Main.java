package pl.sda.zapis.zad5;

//Stwórz klasę formularz. Formularz reprezentuje odpowiedzi których udzielił użytkownik.
// Aplikacja ma po uruchomieniu rozpocząć od zadawania pytań użytkownikowi.
// Po wpisaniu danych(odpowiedzi na pytania) zapisz te odpowiedzi do pliku (output_form.txt)
// w odpowiednim formacie (przez format mamy na myśli zawartość - np. oddziel pytania i odpowiedzi tak,
// aby byly pisane w nowych liniach). Poproś użytkownika o: wiek, wzrost, płeć (kobieta/mezczyzna),
// zarobki i zadaj dwa dodatkowe pytania. Po czynności zamknij plik i program.

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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
        scanner.nextLine();

        System.out.println("Co sądzisz o tym formularzu?");
        formularz.setCoSadziszOTymFormularzu(scanner.nextLine());

        try(PrintWriter writer = new PrintWriter("output_form.txt")){
            writer.println(formularz.zwrocWFormacie());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}