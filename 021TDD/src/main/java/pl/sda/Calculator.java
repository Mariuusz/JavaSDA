package pl.sda;

public class Calculator {
    public static  int sum(int a, int b) {
        return a + b;
    }

    public static  int difference(int a, int b) {
        return a - b;
    }

    public static  int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b==0){
            throw new IllegalArgumentException();
        }
        return a / b;
    }
    public static boolean isEven(int number){
        return number%2==0;
    }

    public static double log(double a, double b) {
        return Math.log(b) / Math.log(a);
    }

    public static double power(double a) {
        return Math.pow(a,2.0);
    }

    public static double podnies(double a, double b) {
        return Math.pow(a,b);
    }
}
