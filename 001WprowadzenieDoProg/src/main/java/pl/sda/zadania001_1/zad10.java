package pl.sda.zadania001_1;

//      10. Zadeklaruj trzy zmienne (liczby). Wypisz na ekran wszystkie z nich, a następnie
//        wypisz na ekran największą oraz najmniejszą z nich.

public class zad10 {
    public static void main(String[] args) {
        int a =111;
        int b =223;
        int c =33;
        System.out.println(a + " " + b + " " + c);
//        wypisz największą
        if (a>b){
            if (a>c){
                System.out.println(a);
            }else
                System.out.println(c);
        }else if (b>c){
            System.out.println(b);
        }else
            System.out.println(c);
    }
}
