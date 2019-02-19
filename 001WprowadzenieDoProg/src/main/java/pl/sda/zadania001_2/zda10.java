package pl.sda.zadania001_2;

//      10. Napisać program rysujący w konsoli „choinkę” złożoną ze znaków gwiazdki (*).
//        Użytkownik programu powinien podać liczbę całkowitą n, n > 0, określającą
//        wysokość choinki (liczbę wierszy). Przykład: dla n = 5 wynik powinien wyglądać
//        następująco:
//            *
//           ***
//          *****
//         *******
//        *********

import java.util.Scanner;

public class zda10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wysokość choinki");
        int wysokość = scanner.nextInt();

        for (int i = 0; i < wysokość; i++) {
            for (int j = 1; j < (wysokość - i); j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=(2*i)+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
