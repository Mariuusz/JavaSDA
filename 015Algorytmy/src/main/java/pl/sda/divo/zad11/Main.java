package pl.sda.divo.zad11;
//Pobierz z pliku dane, a następnie wyświetl wyrazy pomijając duplikaty
//
//        1. Przedstaw opis słowny problemu
//        2. Przedstaw schemat blokowy
//        3. Zaimplementuj algorytm.
//
//        Rozwinięcie:
//        2. Wyświetl wyrazy łącznie z ilością duplikatów

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    private List<String> getFileLines(Path filePath) {
        try {
            return Files.lines(filePath).collect(Collectors.toList());
        } catch (IOException ignored) { }

        return Collections.emptyList();
    }
    private Set<String> getFileSet(Path filePath) {
        try {
            return Files.lines(filePath).collect(Collectors.toSet());
        } catch (IOException ignored) { }

        return Collections.emptySet();
    }

    private List<String> removeDuplicatesWithList(List<String> words) {
        List<String> withoutDuplicates = new ArrayList<>();
        words.stream()
                .filter(word -> !withoutDuplicates.contains(word))
                .forEach(withoutDuplicates::add);
        return withoutDuplicates;
    }

    private Map<String, Integer> getDuplicityCount(List<String> words) {
        HashMap<String, Integer> duplicityCount = new HashMap<>();
        for (String word : words) {
            if (duplicityCount.containsKey(word)) {
                duplicityCount.put(word, duplicityCount.get(word) + 1);
            } else {
                duplicityCount.put(word, 1);
            }
        }
        return duplicityCount;
    }

    public static void main(String[] args) {
        Main m = new Main();
        int LIMIT = 13;
        Path filePath = Paths.get("/media/mateusz/Data/projekty/sdacademy/programowanie/src/main/resources/2018/03/files/duplicates.txt");
        List<String> lines = m.getFileLines(filePath);
        System.out.println("Show first " + LIMIT + " words");
        lines.stream().sorted(Comparator.comparingInt(String::length).reversed()).limit(LIMIT).forEach(System.out::println);

        System.out.println();
        System.out.println("Show first " + LIMIT + " words without duplicates");
        List<String> listWithoutDuplicates = m.removeDuplicatesWithList(lines);
        listWithoutDuplicates.stream().sorted(Comparator.comparingInt(String::length).reversed()).limit(LIMIT).forEach(System.out::println);

        System.out.println();
        System.out.println("Show first " + LIMIT + " words without duplicates");
        Set<String> withoutDuplicates = m.getFileSet(filePath);
        withoutDuplicates.stream().sorted(Comparator.comparingInt(String::length).reversed()).limit(LIMIT).forEach(System.out::println);

        System.out.println();
        System.out.println("Show first " + LIMIT + " words with summary");
        Map<String, Integer> summary = m.getDuplicityCount(lines);
        summary.entrySet().stream().sorted((e1, e2) -> e2.getValue() - e1.getValue()).limit(LIMIT).forEach(System.out::println);
    }
}