package pl.sda.str82;

//        1.Zamodelować sytuację zakupu biletu
//        2.Utworzyć enumBilet
//        3.Nadać następujące wartości:
//          a.ULGOWY_GODZINNY
//          b.ULGOWY_CALODNIOWY
//          c.NORMALNY_GODZINNY
//          d.NORMALNY_CALODNIOWY
//          e.BRAK_BILETU
//        4.Dodać konstruktor przyjmujący 2 parametry:
//          a.cena (double)
//          b.czasJazdyw minutach (int)
//        5.Nadać odpowiednie wartości startowe
//        6.Utworzyć metodę pobierzCeneBiletu():int
//        7.Utworzyć metodę pobierzCzasJazdy():int
//        8.Utworzyć metodę wyswietlDaneOBilecie():voidnp. „Bilet ulgowy 1-godzinny”
//        9.Utwórz kilka biletów, wywołaj metody i przetestuj działanie
//        10.* Utwórz metodę statyczną przyjmująca wiek osoby kupującej bilet,
//             czas jazdy w minutach oraz kwotę –zwróć odpowiedni bilet
//             (w przypadku niewystarczających środków zwróć BRAK_BILETU)

public class Zad1 {
    public static void main(String[] args) {
        Bilet bilet1 = Bilet.ULGOWY_GODZINNY;
//        bilet1.wyswietlDaneOBilecie();
//        System.out.println(bilet1.pobierzCeneBiletu());
//        System.out.println(bilet1.pobierzCzasJazdy());

        System.out.println(Bilet.kupBilet(18,20,3.6));

    }
}
