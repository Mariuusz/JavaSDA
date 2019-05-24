package pl.sda.divo.zad9_Cezar;

//Pobierz od użytkownika napis oraz liczbę. Następnie zaszyfruj i odszyfruj wiadomość za pomocą algorytmu cezara.
//
//        1. Przedstaw opis słowny problemu
//        2. Przedstaw schemat blokowy
//        3. Zaimplementuj algorytm.
//
//        Rozwinięcie:
//        2. Znając tylko pierwszą literę tekstu jawnego i mając tekst zaszyfrowany napisz algorytm, który odszyfruje cały tekst.
//        3. Znając jeden dowolny wyraz tekstu jawnego i mając tekst zaszyfrowany napisz algorytm, który odszyfruje cały tekst.
//        4. Czy jesteśmy w stanie odszyfrować tekst bez klucza? Ile prób nam to zajmie?
//        5. Napisz algorytm deszyfrujący znając jedynie zaszyfrowany tekst. Hint: dostaniemy kilka odszyfrowanych wiadomości.
//        6. Wiedząc, że najczęściej występującą literą w tekście jawnym jest litera a, napisz program deszyfrujący.
//
//        Algorytm Cezara:
//        Jest to rodzaj szyfru podstawieniowego, w którym każda litera tekstu jawnego (niezaszyfrowanego) zastępowana jest inną, oddaloną od niej o stałą liczbę pozycji w alfabecie, literą (szyfr monoalfabetyczny), przy czym kierunek zamiany musi być zachowany. Nie rozróżnia się przy tym liter dużych i małych.

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class CesarCipher {
    String encrypt(String origText, int key) {
        StringBuilder sb = new StringBuilder();
        int len = origText.length();
        for(int x = 0; x < len; x++){
            char c = (char)(origText.charAt(x) + key);
            if (origText.charAt(x) == ' ') {
                sb.append(" ");
            } else if (c > 'z') {
                sb.append((char)(origText.charAt(x) - (26 - key)));
            } else {
                sb.append((char)(origText.charAt(x) + key));
            }
        }
        return sb.toString();
    }
    String decrypt(String encryptedText, int key) {
        StringBuilder sb = new StringBuilder();
        int len = encryptedText.length();
        for(int x = 0; x < len; x++) {
            char c = (char)(encryptedText.charAt(x) - key);
            if (encryptedText.charAt(x) == ' ') {
                sb.append(" ");
            } else if (c < 'a') {
                sb.append((char)(encryptedText.charAt(x) + (26 - key)));
            } else {
                sb.append((char)(encryptedText.charAt(x) - key));
            }
        }
        return sb.toString();
    }
    String decrypt(String encryptedText, char firstLetter) {
        return decrypt(encryptedText, encryptedText.charAt(0) - firstLetter);
    }
    List<String> decrypt(String encryptedText, String knownWord) {
        return Arrays.stream(encryptedText.split(" "))
                .filter(word -> word.length() == knownWord.length())
                .map(word -> decrypt(encryptedText, word.charAt(0) - knownWord.charAt(0)))
                .collect(Collectors.toList());
    }
    List<String> decryptOptimize(String encryptedText, String knownWord) {
        return Arrays.stream(encryptedText.split(" "))
                .filter(word -> word.length() == knownWord.length())
                .map(word -> new AbstractMap.SimpleEntry<>(word, decrypt(word, word.charAt(0) - knownWord.charAt(0))))
                .collect(Collectors.toList())
                .stream()
                .filter(entry -> entry.getValue().equals(knownWord))
                .map(entry -> decrypt(encryptedText, entry.getKey().charAt(0) - knownWord.charAt(0)))
                .collect(Collectors.toList());
    }
}

public class Main {
    public static void main(String[] args) {
        CesarCipher cipher = new CesarCipher();
        String word = "ala ma kota a kot ma ale olek za to ma reksia a mala ania nie ma nic";
        int key = 4;

        String encryptedText = cipher.encrypt(word, key);
        String decryptedText = cipher.decrypt(encryptedText, key);
        System.out.println("Original word: " + word);
        System.out.println("Encrypted by Cesar: " + encryptedText);
        System.out.println("Decrypted by Cesar: " + decryptedText);
        System.out.println("Are same: " + decryptedText.equals(word));
        System.out.println("Decrypted by Cesar with letter: " + word.charAt(0) + " = " + cipher.decrypt(encryptedText, word.charAt(0)));
        System.out.println("Decrypted by Cesar with known word: " + cipher.decrypt(encryptedText, "kota"));
        System.out.println("Optimized decrypt by Cesar with known word: " + cipher.decryptOptimize(encryptedText, "kota"));
    }
}