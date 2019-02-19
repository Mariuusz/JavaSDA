package pl.sda.zadania001_1;

//  Wypisz na ekran wartości poniższych wyrażeń logicznych
//        a. false == false
//        b. false != true
//        c. !true
//        d. 2 > 4
//        e. 3 < 5
//        f. 3 == 3 && 3 == 4
//        g. 3 != 5 || 3 == 5
//        h. (2+4) > (1+3)
//        i. “cos”.equals(“cos”);
//        j. “cos” == “cos”;

public class zad3 {
    public static void main(String[] args) {
        System.out.println("false == false");
        System.out.println(false == false);
        System.out.println("false != true");
        System.out.println(false != true);
        System.out.println("!true");
        System.out.println(!true);
        System.out.println("2 > 4");
        System.out.println(2 > 4);
        System.out.println("3 < 5");
        System.out.println(3 < 5);
        System.out.println("3 == 3 && 3 == 4");
        System.out.println(3 == 3 && 3 == 4);
        System.out.println("3 != 5 || 3 == 5");
        System.out.println(3 != 5 || 3 == 5);
        System.out.println("(2+4) > (1+3)");
        System.out.println((2+4) > (1+3));
        System.out.println("“cos”.equals(“cos”);");
        System.out.println("cos".equals("cos"));
        System.out.println("“cos” == “cos”");
        System.out.println("cos" == "cos");

        String a = "a";
        String b = "a";
        System.out.println(a==b);
        System.out.println("a".equals(b));
        System.out.println(a.equals(b));
    }
}
