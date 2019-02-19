package pl.sda.str65_InstrukcjaIf;

//Rozbuduj poprzedni program o wypisywanie „:(„ w przypadku niespełnienia warunku
//        a.2 > 3
//        b.4 < 5
//        c.(2 -2) == 0
//        d.true
//        e.9%2 == 0
//        f.9%3 == 0

public class InstrukcjaIf {
    public static void main(String[] args) {
        System.out.println('b'+'a'+"a"+'s');
        System.out.println("a"+'b'+3);

        if (true) {                                 // Unwrap ???
            System.out.println(":)");

        } else {
            System.out.println(":(");
        }

        if (9 % 2 == 0) {
            System.out.println(":)");

        } else {
            System.out.println(":(");
        }
        if (9 % 3 == 0) {
            System.out.println(":)");

        } else {
            System.out.println(":(");
        }
        if (5 > 2) {
            System.out.println(":)");

        } else {
            System.out.println(":(");
        }
        if((2-2)==0){
            System.out.println(":)");

        }else{
            System.out.println(":(");
        }




    }
}
