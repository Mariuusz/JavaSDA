package pl.sda.zad4;

//4. Stwórz metodę generyczną kóra dla dowolnych dwóch parametrów (dziedziczących po klasie Number
// (wykorzystaj metodę generyczną ze słówkiem extends) ) zwraca ich sumę (jako double).
// TODO: Metoda ma przyjmować dwie liczby typu T i zwracać wynik typu double.

public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers(3,5);
        System.out.println(numbers.suma());
    }
}
