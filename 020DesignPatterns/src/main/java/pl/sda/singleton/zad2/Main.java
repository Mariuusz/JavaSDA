package pl.sda.singleton.zad2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // punkt 3
        SettingsReader reader = new SettingsReader();
        reader.readSettingsFromFile();

        Game game = new Game();

        Scanner scanner = new Scanner(System.in);
        while (!game.hasEnded()){
            game.nextRound();  // losowanie liczb i znaku
            // pytanie do użytkownika (podanie liczb i znaku)
            int userResult = scanner.nextInt();     // pobieram wynik
            if(game.validate(userResult)){             // weryfikacja czy podana
                // liczba jest poprawnym wynikiem
                System.out.println("OK!");
            }else{
                System.out.println("NOT OK!");
            }
        }
    }
}