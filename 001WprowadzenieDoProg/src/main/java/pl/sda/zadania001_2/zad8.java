package pl.sda.zadania001_2;

//      8. *Napisać program, który pobiera od użytkownika ciąg liczb całkowitych. Pobieranie
//        danych kończone jest podaniem wartości 0 (nie wliczana do danych). W następnej
//        kolejności program powinien wyświetlić sumę największej oraz najmniejszej z
//        podanych liczb oraz ich średnią arytmetyczną.
//        a. Spróbuj zadanie zrealizować z tablicą oraz bez tablicy
//        b. Pamiętaj! Czytaj liczby tak długo aż wczytana liczba nie jest 0!.

/*
Napisać program, który pobiera od użytkownika ciąg liczb całkowitych.
Pobieranie danych kończone jest podaniem wartości 0 (nie wliczana do danych).
W następnej kolejności program powinien wyświetlić sumę największej oraz najmniejszej z podanych liczb
oraz ich średnią arytmetyczną.
a. Spróbuj zadanie zrealizować z tablicą oraz bez tablicy
b. Pamiętaj! ​Czytaj liczby tak długo aż wczytana liczba nie jest 0!.
 */

import java.util.Scanner;
import java.util.Arrays;

public class zad8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a set of integers. 0 ends entering. Enter first number: ");
        int number = sc.nextInt();
        String numbers = String.valueOf(number);
        String separator = ";";
        while (number != 0) {
            System.out.println("Enter next number: ");
            number = sc.nextInt();
            numbers = numbers + separator + number;
        }

        //removing 0 from last position of string and last semicolumn
        numbers = numbers.substring(0, numbers.length() - 2);


        String [] arraySplit = numbers.split(";");
        int [] arrayInt = new int[arraySplit.length];

        //creating array of integers from array of strings
        for (int i = 0; i < arraySplit.length; i ++){
            arrayInt[i] = Integer.parseInt(arraySplit[i]);
        }

        System.out.println(Arrays.toString(arrayInt));

        int min = arrayInt[0];
        int max = arrayInt[0];
        int sumOfElements = 0;

        for (int i = 0; i < arrayInt.length; i++){
            sumOfElements += arrayInt[i];

            if (arrayInt[i] > max){
                max = arrayInt[i];
            }

            if (arrayInt[i] < min){
                min = arrayInt[i];
            }
        }
        int sumOfMinMax = min + max;
        double average = (double)sumOfElements / (double)arrayInt.length;
        System.out.println("Sum of min and max is: " + sumOfMinMax);
        System.out.println("Average value is: " + average);
    }
}