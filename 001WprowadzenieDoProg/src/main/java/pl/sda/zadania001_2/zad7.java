package pl.sda.zadania001_2;

//      7. Napisać program, który pobiera od użytkownika ilość liczb N , a następnie wczytuje:
//        - N liczb całkowitych od użytkownika
//        - W następnej kolejności program powinien wyświetlić sumę największej oraz
//        najmniejszej z podanych liczb oraz ich średnią arytmetyczną.


import java.util.Scanner;
import java.util.Arrays;

public class zad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of integers to save: ");
        int n = sc.nextInt();
        System.out.println("Enter first number of " + n + " numbers: ");
        int number = sc.nextInt();
        int[] enteredNumbers = new int[n];
        enteredNumbers[0] = number;
        int index = 1;

        while (index < n) {
            System.out.println("Enter next number: ");
            number = sc.nextInt();
            enteredNumbers[index] = number;
            index++;
        }
        System.out.println(Arrays.toString(enteredNumbers));
        int min = enteredNumbers[0];
        int max = enteredNumbers[0];
        for (int i = 0; i < enteredNumbers.length; i++) {
            if (i == enteredNumbers.length - 1) {
                break;
            }
            if (enteredNumbers[i] > max) {
                max = enteredNumbers[i];
            }else if (enteredNumbers[i] < min) {
                min = enteredNumbers[i];
            }
        }
        System.out.println("Min value is: " + min);
        System.out.println("Max value is: " + max);
        int sum = min + max;
        System.out.println("Sum of min and max number is " + sum);

        int sumOfElements = 0;
        for (int i = 0; i < enteredNumbers.length; i++){
            sumOfElements += enteredNumbers[i];
        }
        System.out.println("Arithmetic average is " + (double) sumOfElements / n);
    }
}