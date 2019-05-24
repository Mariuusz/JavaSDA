package pl.sda.divo.zad8_Levenshtein;

//Pobierz od użytkownika napisy, a następnie wyświetl te napisy w kolejności zgodnej z sumą wartości liter w napisie. Zakładając, że a=1
//        ola = 15 + 12 + 1 = 28
//        ala = 1 + 12 + 1 = 14
//        Wyświetl je w formie jak powyżej. Zakładamy, że wszystkie litery będą małe oraz bez polskich znaków.
//
//        1. Przedstaw opis słowny problemu
//        2. Przedstaw schemat blokowy
//        3. Zaimplementuj algorytm.
//
//        Rozwinięcie:
//        2. Wykonaj algorytm również dla dużych liter, zakładając, że duże litery są mniej ważne (A=1, B=2, ..., Z=32,a=33, b=34)
//        3. Wybierz 8 dowolnych liter i nadaj im odpowiednie wagi. Posortuj i wyświetl napisy jak poprzednio oczywiście uwzględniając wagi.
//        4. Na podstawie algorytmu Levenshteina oblicz minimalna liczbę działań prostych oraz podobieństwa wyrazów podanych od użytkownika (zakładamy, że sprawdzamy podobieństwo do pierwszego podanego wyrazu)
//
//        Opis algorytmu
//        Algorytm Levenshteina, służy do liczenia odległości edycyjnej. Jest to najmniejsza liczba działań prostych, przeprowadzająca jeden napis w drugi.
//
//        Działania proste to:
//        wstawienie nowego znaku
//        usuniecie znaku
//        zamiana na inny znak
//
//        Jak działa algorytm?
//        Ustala długość łańcuchów znaków (n – długość łańcucha pierwszego, m – długość łańcucha drugiego),
//        Tworzy macierz o rozmiarze (n+1) x (m+1),
//        Inicjalizuje pierwszy wiersz wartościami od 0 do n,
//        Inicjalizuje pierwszą kolumnę wartościami od 0 do m,
//        Sprawdza każdy znak z łańcucha pierwszego (indeks i od 1 do n),
//        Sprawdza każdy znak z łańcucha drugiego (indeksy j od 1 do m),
//        jeżeli znak na pozycji i równa się znakowi na pozycji j. to koszt jest równy zero,
//        jeżeli znak na pozycji i jest różny od znaku na pozycji j to koszt wynosi 1,
//        Ustala wartość komórki i,j jako minimum:
//        komórka powyżej + 1,
//        komórka z lewej + 1,
//        komórka po skosie (góra, lewo) + koszt.
//        Algorytm powtarzamy dla wszystkich znaków, całkowity koszt otrzymamy w komórce o indeksie n, m.
//******************************************************************************************************************
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Podstawa:
// Pobierz listę napisów
// Dla każdego napisu oblicz sumę znaków.
// Sumę znaków obliczamy na podstawie:
// Ustaw zmienną pomocniczą, która przechowa sumę wszystkich znaków
// Dla każdej litery w słowie:
// Pobierz numer litery (pobierz kod ascii i odejmij: 96 - dla małych liter, 65 - dla wielkich)
// dodaj do sumy numer litery
// zwróć sumę.
// Wyświetl słowo oraz sumę liter.

@Getter
@Builder
class Summary {
    private final List<Integer> codes;
    private final int sum;
    private final String word;

    public String toString() {
        StringBuilder sb = new StringBuilder(word);
        sb.append(" = ");
        sb.append(codes.stream()
                .map(Object::toString)
                .collect( Collectors.joining( "," )));
        sb.append(" = ");
        sb.append(sum);

        return sb.toString();
    }
}

public class Main {
    private static final Map<Character, Integer> weights = new HashMap<>();
    static {
        weights.put('a', 60);
        weights.put('b', 7);
        weights.put('c', 20);
        weights.put('d', 50);
        weights.put('e', 15);
        weights.put('f', 8);
        weights.put('g', 11);
        weights.put('h', 11);
    }
    private Summary summarizeLetters(String word, int start, Map<Character, Integer> weights) {
        List<Integer> codes = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            Character actualLetter = word.charAt(i);
            int code = word.codePointAt(i) - start;
            if (weights.containsKey(actualLetter)) {
                code *= weights.get(actualLetter);
            }
            sum += code;
            codes.add(code);
        }

        return Summary.builder()
                .codes(codes)
                .sum(sum)
                .word(word)
                .build();
    }
    private List<Summary> summarizeSmallLetters(List<String> words) {
        List<Summary> summaries = new ArrayList<>();

        for (String word : words) {
            summaries.add(summarizeLetters(word.toLowerCase(), 96, Collections.emptyMap()));
        }

        return summaries;
    }
    private List<Summary> summarizeLettersWithBig(List<String> words) {
        List<Summary> summaries = new ArrayList<>();

        for (String word : words) {
            summaries.add(summarizeLetters(word, 65, Collections.emptyMap()));
        }

        return summaries;
    }
    private List<Summary> summarizeSmallLettersAndWeights(List<String> words) {
        List<Summary> summaries = new ArrayList<>();

        for (String word : words) {
            summaries.add(summarizeLetters(word.toLowerCase(), 96, weights));
        }

        return summaries;
    }
    private int levenshtein(String s, String t) {
        int i, j, m, n, cost;
        int d[][];

        m = s.length();
        n = t.length();

        d = new int[m+1][n+1];

        for (i=0; i<=m; i++) {
            d[i][0] = i;
        }
        for (j=1; j<=n; j++) {
            d[0][j] = j;
        }

        for (i=1; i<=m; i++) {
            for (j=1; j<=n; j++) {
                if (s.charAt(i-1) == t.charAt(j-1)) {
                    cost = 0;
                } else {
                    cost = 1;
                }

                d[i][j] = Math.min(d[i-1][j] + 1,         /* remove */
                        Math.min(d[i][j-1] + 1,      /* insert */
                                d[i-1][j-1] + cost));   /* change */
            }
        }

        return d[m][n];
    }

    public static void main(String[] args) {
        Main main = new Main();
        List<String> words = Arrays.asList("Ala", "Ola", "pies", "Marek", "Arek");

        System.out.println("Summarize with only small letters");
        List<Summary> summaries = main.summarizeSmallLetters(words);
        summaries.sort(Comparator.comparingInt(Summary::getSum).reversed());
        summaries.forEach(System.out::println);

        System.out.println("\nSummarize with big letters");
        summaries = main.summarizeLettersWithBig(words);
        summaries.sort(Comparator.comparingInt(Summary::getSum).reversed());
        summaries.forEach(System.out::println);

        System.out.println("\nSummarize with only small letters and weights");
        summaries = main.summarizeSmallLettersAndWeights(words);
        summaries.sort(Comparator.comparingInt(Summary::getSum).reversed());
        summaries.forEach(System.out::println);

        System.out.println("\nAlgorytm Levenshteina");
        for (String word : words) {
            int levenshtein = main.levenshtein(words.get(0), word);
            double ratio = 1 - ((double) levenshtein) / (Math.max(words.get(0).length(), word.length()));
            System.out.println("Word: " + word + ", minimal: " + levenshtein + ", probability: " + ratio);
        }
    }
}