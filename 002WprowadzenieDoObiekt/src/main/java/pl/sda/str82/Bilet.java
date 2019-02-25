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

public enum Bilet {
    ULGOWY_GODZINNY(1.6,60),
    ULGOWY_CALODNIOWY(6.5,1440),
    NORMALNY_GODZINNY(3.6,60),
    NORMALNY_CALODNIOWY(13,1440),
    BRAK_BILETU(0,0);

    private double cena;
    private int czasPrzejazdu;

    Bilet(double cena, int czasPrzejazdu) {
        this.cena = cena;
        this.czasPrzejazdu = czasPrzejazdu;
    }
    public double pobierzCeneBiletu(){
        return this.cena;
    }
    public int pobierzCzasJazdy(){
        return this.czasPrzejazdu;
    }
    public void wyswietlDaneOBilecie(){
        System.out.println("Bilet " + this.name().toLowerCase().replace('_',' '));
    }
    public static Bilet kupBilet(int wiek, int czasJazdy, double kwota){
        if (wiek>=18){
            if (czasJazdy>=60){
                if (kwota>=13){
                    return Bilet.NORMALNY_CALODNIOWY;
                } else return Bilet.BRAK_BILETU;
            }else if (kwota>=3.6){
                return Bilet.NORMALNY_GODZINNY;
            } else return Bilet.BRAK_BILETU;
        } else if (czasJazdy>=60){
            if (kwota>=6.5){
                return Bilet.ULGOWY_CALODNIOWY;
            } else return Bilet.BRAK_BILETU;
        }else if (kwota>=1.8){
            return Bilet.ULGOWY_GODZINNY;
        } else return Bilet.BRAK_BILETU;
    }

}
