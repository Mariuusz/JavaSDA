package pl.sda.zestawSprawdzajacy;

//        6. Napisać program, który utworzy tablicę 20 liczb całkowitych z przedziału 1 . . . 10
//        a następnie wypisze na ekranie ile razy każda z liczb z tego przedziału powtarza się w tablicy.
//        Przykład:
//        Wylosowane liczby: 6 5 4 5 10 5 8 3 10 6 6 6 4 3 2 8 1 3 4 7
//        Wystąpienia:
//        1 - 1
//        2 - 1
//        3 - 3
//        4 - 3
//        5 - 3
//        6 - 4
//        7 - 1
//        8 - 2
//        9 - 0
//        10 - 2

import java.util.Random;

public class Main6 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] liczby = new int[20];
        for (int a = 0; a < liczby.length; a++) {
            liczby[a] = random.nextInt(10) + 1;
        }
        System.out.println("Wylosowane liczby to: ");
        for (int a = 0; a < liczby.length; a++) {
            System.out.print(liczby[a]+ ", ");
        }

        System.out.println("Wystąpienia:");
        for (int i = 1; i <= 10; i++) {
        int iloscWystapien = 0;
            for (int j = 0; j < 20; j++) {
                if (i == liczby[j]) {
                    iloscWystapien += 1;
                }
            }
            System.out.println(i + " = " + iloscWystapien);
        }


    }
}
