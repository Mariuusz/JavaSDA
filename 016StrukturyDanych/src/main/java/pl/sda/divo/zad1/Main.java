package pl.sda.divo.zad1;

//Do własnej implementacji listy dodaj funkcję usuwającą wszystkie wystąpienia elementu x.
//        Przygotuj dwie implementacje tej metody: rekurencyjną i iteracyjną.
//
//        Dodaj do listy metodę: public void remove(Integer x)
//        Przeiteruj przez wszystkie elementy z pola i sprawdź czy element x znajduje się w polu.
//        Jeżeli tak usuń z pola

public class Main {

    public static void main(String[] args) {
        MyArrayList words = new MyArrayList();
        words.add(4);
        words.add(3);
        words.add(5);
        words.add(10);
        words.add(4);
        words.add(7);
        words.add(8);
        words.add(4);

        System.out.println("init: ");
        for (int i = 0; i < words.size() - 1; i++) {
            System.out.print(words.get(i) + ", ");
        }

        words.removeRecurWithCopy(4);

        System.out.println();
        System.out.println("After remove `4`: ");
        for (int i = 0; i < words.size() - 1; i++) {
            System.out.print(words.get(i) + ", ");
        }
    }
}