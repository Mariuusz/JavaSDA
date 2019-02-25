package pl.sda.str70.zad2;

//    2.Utwórz klasę Ulamek, reprezentującą ułamek zwykły. Klasa ma udostępniać operację dodawania,
//        odejmowania, mnożenia, dzielenia oraz wyświetlania ułamków (w formie licznik/mianownik np. 4/3).
//        Ułamki powinny mieć liczbę całkowitą zarówno w liczniku jak i mianowniku.
//        Przetestuj swoje rozwiązanie

public class Ulamek {
    private int licznik;
    private int mianownik;

    public Ulamek(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
        uproscUlamek();
    }

    private void uproscUlamek() {
        int nwd;
        do {
            nwd = obliczNWD(licznik, mianownik);
            this.licznik = licznik / nwd;
            this.mianownik = mianownik / nwd;
        } while (nwd != 1);

    }

    private int obliczNWD(int licznik, int mianownik) {
        int nwd = 1;
        if (licznik <= mianownik) {
            for (int i = 1; i <= licznik; i++) {
                if (licznik % i == 0 && mianownik % i == 0) {
                    nwd = i;
                }
            }
        } else {
            for (int i = 1; i <= mianownik; i++) {
                if (licznik % i == 0 && mianownik % i == 0) {
                    nwd = i;
                }
            }
        }
        return nwd;
    }
//
//    private int obliczNWD(int licznik, int mianownik) {
//        int nwd =1;
//        if (licznik<=mianownik){
//            for (int i =1; i<licznik; i++){
//                if (licznik%1==0 && mianownik%1==0){
//                    nwd = i;
//                }else {for (int i =1; i<=mianownik; i++){
//                    if (licznik%1==0 && mianownik%1==0){
//                        nwd=i;
//                    }
//
//                }
//            }
//        }
//        return nwd;
//    }

    public void wyswietl() {
        if (licznik==mianownik){
            System.out.println(licznik);
        }else {
            System.out.println(String.format("%d/%d", licznik, mianownik));
        }

    }

    public Ulamek pomnoz(Ulamek ulamek) {
        int licznik = this.licznik * ulamek.licznik;
        int mianownik = this.mianownik * ulamek.mianownik;

        Ulamek wynik = new Ulamek(licznik, mianownik);
        return wynik;
    }

    public Ulamek dodaj(Ulamek ulamek) {
        int licznik = this.licznik * ulamek.mianownik + ulamek.licznik * this.mianownik;
        int mianownik = this.mianownik * ulamek.mianownik;

        return new Ulamek(licznik, mianownik);
    }

    //    public Ulamek odejmij(Ulamek ulamek){
//
//        int mianownik = this.licznik * ulamek.mianownik - ulamek.licznik;
//        int licznik = ulamek.mianownik;
//
//        return new Ulamek(licznik,mianownik);
//    }
    public Ulamek podziel(Ulamek ulamek) {
        int licznik = this.licznik * ulamek.mianownik;
        int mianownik = this.mianownik * ulamek.licznik;

        Ulamek wynik = new Ulamek(licznik, mianownik);
        return wynik;
    }
    public Ulamek odejmij(Ulamek ulamek){
        int licznik = this.licznik * ulamek.mianownik - ulamek.licznik* this.mianownik;
        int mianownik = this.mianownik * ulamek.mianownik;

        return new Ulamek(licznik,mianownik);
    }
}