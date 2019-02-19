package pl.sda.zadania001_2;

//      1. Napisz aplikację która wypisuje:
//        h. litery od 'a' do 'z'
//        i. litery od ‘A’ do ‘Z’

//        l. ‘Hello World’ 100 razy przy każdym wypisaniu wypisz jego indeks (numer
//        wypisania) np.
//        1. Hello World
//        2. Hello World
//        3. Hello World
//        4. ….

public class zad1 {
    public static void main(String[] args) {

        for (int i=97; i<123; i++){
            System.out.println((char)i);
        }
        for (int i=(int)'A'; i<=(int)'Z'; i++){
            System.out.println((char)i);
        }
        for (int i=1; i<=100; i++){
            System.out.println(i + ". Hello World");
        }


    }
}
