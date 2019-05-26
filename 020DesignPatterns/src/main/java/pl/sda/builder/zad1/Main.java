package pl.sda.builder.zad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GameCharacter hero1 = new GameCharacter.Builder().setHealth(23).setNumberOfPoints(23).setName("Albert").create();
        GameCharacter hero2 = new GameCharacter.Builder().create();
        GameCharacter hero3 = new GameCharacter.Builder().create();
        GameCharacter hero4 = new GameCharacter.Builder().create();
        GameCharacter hero5 = new GameCharacter.Builder().create();
        GameCharacter hero6 = new GameCharacter.Builder().create();

        List<GameCharacter> heroes = new ArrayList<>(Arrays.asList(hero1,hero2,hero3,hero4,hero5,hero6));
        for (GameCharacter hero:heroes){
            System.out.println(hero);
        }
    }
}
