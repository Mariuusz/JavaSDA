package pl.sda.zad7_Stream;
//
//5. Napisz program, a w programie stwórz zbiór zawierający wszystkie litery występujące w języku polskim.
//        a. Wypisz wszystkie elementy zbioru na ekran.
//        b. Sprawdź, czy zbiorze istnieją elementy a,ą,x,z,ź,ż (metoda contains)
//        c. Napisz metodę, która przyjmuje argument typu String i zwraca informację o tym,
//           czy zawiera on jedynie znaki należące do polskiego alfabetu

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Litera {
    private char znak;

    public Litera() {
    }

    public Litera(char znak) {
        this.znak = znak;
    }

    public char getZnak() {
        return znak;
    }

    public void setZnak(char znak) {
        this.znak = znak;
    }

    @Override
    public String toString() {
        return "Litera{" +
                "znak=" + znak +
                '}';
    }

    public List<Litera> getAllLetters(){
        List<Litera> letters = new ArrayList<>();
        for(char i = 'a'; i < 'z'; i++) {
            letters.add(new Litera(i));
        }

        return letters;
    }

    public void printLetters(List<Litera> letters){
        letters.stream().forEach(System.out::println);
    }

    public boolean isListContains(List<Litera> letters){
        List<Character> lettersTocheck = new ArrayList<>(Arrays.asList('a','ą','x','z','ź','ż'));
        return letters.stream().map(u->u.getZnak())
                .anyMatch(lettersTocheck::contains);
    }

    public boolean isStringContainsOnlyPolishAlphabetCharts(String string){
        return Arrays.stream(string.split(""))
                .allMatch(getAllLetters()::contains);



    }
}