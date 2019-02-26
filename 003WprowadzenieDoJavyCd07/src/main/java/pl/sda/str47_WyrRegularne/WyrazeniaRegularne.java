package pl.sda.str47_WyrRegularne;

//        3.Utwórz klasę WyrazeniaRegularne
//        4.Utwórz metodę ‚zlacz’ –która pobiera 2 ciągi typu string,
// usuwa z nich białe znaki na początku i końcu
// a następnie usuwa 2 litery z początku i końca
// i zwraca połączenie obu tych łańcuchów
//        5.Utwórz metodę do usuwania samogłosek z wybranego ciągu znaków
//        6.Utwórz metodę do usuwania liczb większych niż 9, podanych w zadanym ciągu znaków
//        7.Utwórz metodę zamieniającą słowa z dużej litery na wybrany tekst
// (2 parametr metody) np. „Ala ma kota”,”???” „??? ma kota”
//        8.Utwórz metodę zamieniającą koniec zdania na koniec zdania + znak nowej linii.
//        9.* Usprawnij metodę z 8 zadania, tak aby to był rzeczywiście koniec zdania a nie ‚np. X’‚np.\nX’

public class WyrazeniaRegularne {
    public static void main(String[] args) {

        String str1 = "         njZISNBSJKBNJDdf       ";
        String str2 = "        as.ksjfaaaadksjfkKJ        ";
        System.out.println(zlacz(str1,str2));
        System.out.println(usunSamogloski(str2));
        System.out.println(usunWiekszeNiz10("128 42 2 12 4 1 2 3 4 03 5 6 7 11 10 20"));
        System.out.println(zamienZDuzej("Ala ma kota i Papugęe","Asia"));   // ę nie jest pomiędzy a-z :)

    }


    public static String zlacz(String str1,String str2){
        return str1.trim().substring(2,str1.trim().length()-2)   +    str2.trim().substring(2,str2.trim().length()-2);
    }
    public static String usunSamogloski(String tekst){
        return tekst.replaceAll("(a|e|i|o|u|y)", "");
    }
    public static String usunWiekszeNiz10(String s1){
        return s1.replaceAll("[1-9]{2,}|10","");
    }
    public static String zamienZDuzej(String s1, String s2){
        return s1.replaceAll("[A-Z]{1}[a-z]{1,}",s2);
    }

}
