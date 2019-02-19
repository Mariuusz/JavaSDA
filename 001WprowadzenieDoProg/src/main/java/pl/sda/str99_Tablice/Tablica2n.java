package pl.sda.str99_Tablice;
import java.util.Arrays;

public class Tablica2n {
    public static void main(String[] args) {

        int[][] macierz = new int[3][3];
        System.out.println(Arrays.toString(macierz[0]));
        System.out.println(Arrays.toString(macierz[1]));
        System.out.println(Arrays.toString(macierz[2]));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                macierz[i][j] = i*2+i+j;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(macierz[0]));
        System.out.println(Arrays.toString(macierz[1]));
        System.out.println(Arrays.toString(macierz[2]));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                macierz[i][j] = i*2+i+j;
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
    }
}