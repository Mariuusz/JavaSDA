package pl.sda.zadania001_1;

//4. Zadeklaruj 3 zmienne - zmienna 'a', zmienna 'b', zmienna 'c'. Przypisz jej 3 wartości -
//        ważne żeby były różne. Następnie wykonaj na nich następujące działania:
//        a) przepisz wartości - do zmiennej 'a' przypisz wartość 'b', do zmiennej 'b'
//        przypisz wartość 'c', do zmiennej 'c' przypisz wartość 'a'.
//        b) wypisz wartości na ekran.

public class zad4 {
    public static void main(String[] args) {
        int a =1;
        int b =2;
        int c =3;
        a=b;
        b=c;
        c=a;
        System.out.println(a + " " + b + " " + c);
    }
}
