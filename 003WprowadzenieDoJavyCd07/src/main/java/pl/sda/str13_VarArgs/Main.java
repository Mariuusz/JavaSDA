package pl.sda.str13_VarArgs;

//1.Utworzklasę Kalkulator
//        2.Dodaj metodę nie-statycznądodaj:intprzyjmującą dowolną ilość argumentów typu int
//        3.Dodaj metodę nie-statyczną odejmij:intprzyjmującą dowolność ilość argumentów typu int
//        4.Utwórz klasę Main
//        5.W metodzie psvmklasy Mainzainicjalizuj obiekt Kalkulatora
//        6.Przetestuj działanie metod
//        7.* Zamień klasę Mainw samodzielny program pobierający dowolną ilośćargumentów na wejściu, gdzie pierwszy argument oznacza typ działania+ (dodawanie) –(odejmowanie)
//        8.* Zarchiwizuj projekt do postaci runnable-jar
//        9.* Przetestuj program z użyciem konsoli

public class Main {
    public static void main(String[] args) {
        String dzialanie = args[0];

        int[] liczby = new int[args.length - 1];
        for (int i = 0; i < liczby.length; i++) {
            try {
                liczby[i] = Integer.parseInt(args[i + 1]);

            } catch (NumberFormatException e) {
                System.out.println(String.format("Wprowadzona liczba %s nie jest liczbą", args[i + 1]));
            }

        }

        Kalkulator kalkulator = new Kalkulator();
        switch (dzialanie) {
            case "+":
                System.out.println("Wynik dodawania to " + kalkulator.dodaj(liczby));
                break;
            case "-":
                System.out.println("Wynik odejmowania to " + kalkulator.odejmij(liczby));
                break;
        }
    }
}
