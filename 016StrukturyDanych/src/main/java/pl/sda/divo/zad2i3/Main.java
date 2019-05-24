package pl.sda.divo.zad2i3;

//Do Twojej implementacji listy dorób funkcję, która usuwa wszystkie elementy, które występują w innej kolekcji.
//
//        W tym celu dodaj do klasy metodę remove(MyList<Integer> otherList).
//        W tej metodzie przeiteruj pętlą po wszystkich elementach listy `otherList`.
//        Następnie dla każdego elementu sprawdź czy występuje w polu klasy.
//        Jeżeli tak to usuń go z pola.
//
//        Rozwinięcie
//        2. Przygotuj osobną implementację funkcji (bardziej wydajną) wiedząc, że obie listy są posortowane
//        3. Przygotuj osobną implementację funkcji (bardziej wydajną) wiedząc, że tylko jedna lista jest sortowana.
//
//        2. Działanie podobne jak w poprzednim przykładzie, jednak skoro obie listy są posortowane nie musimy sprawdzać wszystkich elementów tylko w kolejności. Nie musimy wracać do początku.

//Bazując na własnej implementacji listy posortowanej, przygotuj funkcję, która pobierze dwie posortowane listy i scali je w nową listę zawierającą tylko elementy które NIE BYŁY wspólne dla tych list.
//        Przygotuj również równoważną funkcję, która zwróci listę zawierającą elementy wspólne obu list.
//
//        Działanie będzie podobne do usuwania. Tylko zamiast usuwać element z tablicy, dodamy go do nowej listy, którą zwrócimy. W tym celu:
//        Utwórz metodę diff(MyList<Integer> otherList)
//        Utwórz w niej nową tymczasową listę o nazwie: MyList<Integer> removed
//        W niej przeiteruj wszystkie elementy z listy otherList i sprawdź czy istnieje w polu klasy
//        Jeżeli element nie istnieje dodaj go do listy removed.
//        Na koniec zwróć listę removed z funkcji


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


        System.out.println("Diff: ");
        MyArrayList otherList = new MyArrayList();
        otherList.add(1);
        otherList.add(2);
        otherList.add(4);
        otherList.add(10);

        MyArrayList diff = words.diff(otherList);
        for (int i = 0; i < diff.size() - 1; i++) {
            System.out.print(diff.get(i) + ", ");
        }

        MyArrayList ct = new MyArrayList();
        ct.add(99);
        System.out.println("contains: " + words.contains(ct));
    }
}