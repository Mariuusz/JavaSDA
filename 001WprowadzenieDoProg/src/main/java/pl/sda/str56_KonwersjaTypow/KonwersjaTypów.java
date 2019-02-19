package pl.sda.str56_KonwersjaTypow;

//1.Spróbuj przekonwertować następujące wartości:
//        A.short-> int
//        B.short-> long
//        C.int-> float
//        D.int-> double
//        E.long-> int
//        F.short-> byte
//        G.char -> int
//        2.Przeanalizuj otrzymane rezultaty
//        3.*Czym jest otrzymany wynik z działania G?

public class KonwersjaTypów {
    public static void main(String[] args) {

        int liczba = 146;
        byte liczbunia = (byte) liczba;
        System.out.println(liczbunia);

        char a = 'a';
        int kodASCII_to_97 = (int) a;
        System.out.println(kodASCII_to_97);
    }
}