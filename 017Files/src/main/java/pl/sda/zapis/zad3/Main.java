package pl.sda.zapis.zad3;

//Należy napisać aplikację która w pętli while czyta ze Scannera wejście użytkownika z konsoli,
// a następnie linia po linii wypisuje tekst do pliku 'output_3.txt'. Aplikacja ma się zamykać
// po wpisaniu przez użytkownika komendy "quit".
//Pętla powinna być w try a nie try w pętli.

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            PrintWriter zapis = new PrintWriter("output_3.txt");
            String linia = "";
            while (!linia.toLowerCase().equals("quit")) {
                linia = scanner.nextLine();
                zapis.println(linia);
                zapis.flush();
            }
            zapis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
