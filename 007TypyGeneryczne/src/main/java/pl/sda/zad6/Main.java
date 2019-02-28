package pl.sda.zad6;

//6. Stwórz statyczną metodę generyczną 'abs:T' która dla dowolnej liczby zwraca jej :
//        - wartość bezwzględną.
//        - wartość przeciwną,
//        - wartość odwrotną
//
//        DO REALIZACJI ZADANIA NIE UŻYWAJ METOD KLASY 'Math'.

public class Main {
    public static void main(String[] args) {
        System.out.println(abs(-15.9));
    }

    public static <T> T abs(T liczba) {
        Double a = (Double) liczba;
        if (a < 0) {
            a *= -1;
            return (T) a;
        } else return liczba;
    }
}


//        int a = (int)liczba;
//        if (a < 0){
//        a *=(-1);
//        return a;
