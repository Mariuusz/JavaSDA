package pl.sda.divo.zad10_Vigener;

//Pobierz od użytkownika napis oraz literę. Następnie zaszyfruj i odszyfruj wiadomość za pomocą oryginalnego algorytmu vigener`a z wykorzystaniem "autoklucza"
//
//        1. Przedstaw opis słowny problemu
//        2. Przedstaw schemat blokowy
//        3. Zaimplementuj algorytm.
//
//        Rozwinięcie:
//        2. Zaimplementuj prostszą wersję deszyfrowania. Wymaga on wykonania prostej operacji "odwrócenia" hasła, jak poniżej:
//        K2(i) = [26 – K(i)] mod 26, gdzie K(i) – kolejna litera słowa kluczowego, numerowane A=0, B=1 itd., a K2(i) – kolejna litera hasła "odwróconego". 26 oznacza liczbę liter alfabetu łacińskiego. Efektem działania takiego przekształcenia dla hasła "TAJNE" będzie słowo "HARNW". Następnie należy na szyfrogramie wykonać operację szyfrowania z otrzymanym hasłem. Wynikiem, jak można się przekonać, będzie postać jawna tekstu.
//        3. Zaimplementuj szyfrowanie/deszyfrowanie za pomocą klucza o dowolnej długości.
//
//        Algorytm Vigenere`a:
//        Tekst szyfrujemy na podstawie hasła. Szyfrowanie odbywa się w sposób następujący. Każdą literę tekstu jawnego szyfrujemy korzystając z alfabetu zaczynającego się od odpowiadającej litery w haśle. W przypadku, gdy hasło jest krótsze od szyfrowanego tekstu powtarzamy je wielokrotnie.
//        Szyfrowanie i deszyfrowanie odbywa się na podstawie tablicy Vigenere`a. Tablica Vigenere`a powstaje na podstawie wygenerowania tablicy dwuwymiarowej, gdzie kolejny wiersz jest przesunięty względem poprzedniego o jedną literę. "Ucinana" litera przechodzi na koniec wiersza.
//
//        Autoklucz tworzony jest na podstawie pierwszej litery klucza która była ustalana, a kolejnymi literami były kolejne litery tekstu jawnego.

class VigenerCipher {
    private char[][] alphabetTable = new char['z' + 1]['z' + 1];

    VigenerCipher() {
        for (char a = 'a'; a <= 'z'; a++) {
            char b = a;
            for (int z = 'a'; z <= 'z'; z++) {
                if (b == 'z' + 1) {
                    b = 'a';
                }
                alphabetTable[a][z] = b;
                b++;
            }
        }
    }

    private String padKey(String inputString, String passString) {
        String key = passString;
        for (; key.length() < inputString.length();) {
            key += key;
        }

        return key;
    }

    /**
     * Szyfruj dane
     */
    public String crypt(String inputString, String passString) {
        char[] textCharTable = inputString.toCharArray();
        char[] passCharTable = padKey(inputString, passString).toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < textCharTable.length; index++) {
            if (textCharTable[index] != ' ') {
                sb.append(alphabetTable[textCharTable[index]][passCharTable[index]]);
            } else {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    /**
     * Deszyfruj dane
     */
    public String decrypt(String inputString, String passString) {
        char[] textCharTable = inputString.toCharArray();
        char[] passCharTable = padKey(inputString, passString).toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < textCharTable.length; index++) {
            if (textCharTable[index] != ' ') {
                for (int z = 'a'; z <= 'z'; z++) {
                    if (textCharTable[index] == alphabetTable[passCharTable[index]][z]) {
                        sb.append(alphabetTable['a'][z]);

                    }
                }
            } else {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        String word = "tekst do zaszyfrowania";
        String key = "n";

        VigenerCipher cipher = new VigenerCipher();
        String encrypted = cipher.crypt(word, key);
        String decrypted = cipher.decrypt(encrypted, key);

        System.out.println("Original word: " + word);
        System.out.println("Encrypted by Vigener: " + encrypted);
        System.out.println("Decrypted by Vigener: " + decrypted);
        System.out.println("Are same: " + decrypted.equals(word));
    }
}