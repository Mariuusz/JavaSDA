package pl.sda.divo.zad7_Fibonacci;

//Fibonacci: ciąg, w którym kolejny element jest sumą dwóch poprzednich elementów:
//        1, 1, 2, 3, 5, 8, 13, 21, 34...
//
//        Silnia: iloczyn wszystkich liczb naturalnych dodatnich nie większych niż n:
//        4! = 1 * 2 * 3 * 4 = 24
//        5! = 1  * 2  * 3  * 4  * 5 = 120
//        6! = 1  * 2  * 3  * 4  * 5  * 6 = 720
//        7! = 1  * 2  * 3  * 4  * 5  * 6 * 7 = 5040

public class Main {
    private int fibonacci_recur(int n) {
        if (n <= 1) {
            return 1;
        }

        return fibonacci_recur(n - 2) + fibonacci_recur(n - 1);
    }
    private int fibonacci_iter(int n) {
        if (n < 2) {
            return 1;
        }

        int n1 = 1;
        int n2 = 1;
        int sum = 0;
        for(int i = 2;i <= n; i++) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }

        return sum;
    }
    private int silnia_recur(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * silnia_recur(n - 1);
    }
    private int silnia_iter(int n) {
        if (n < 2) {
            return 1;
        }

        int sum = 1;
        for(int i = 2; i <= n; i++) {
            sum = sum * i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        Main main = new Main();
        System.out.println("Fibonacci rekurencyjnie - fib(" + n + ")=" + main.fibonacci_recur(n));
        System.out.println("Fibonacci iteracyjnie   - fib(" + n + ")=" + main.fibonacci_iter(n));
        System.out.println("Silnia rekurencyjnie    - fib(" + n + ")=" + main.silnia_recur(n));
        System.out.println("Silnia iteracyjnie      - fib(" + n + ")=" + main.silnia_iter(n));
    }
}