package pl.sda.str13_VarArgs;

public class Kalkulator {
    public int dodaj(int... liczby){
        int suma =0;
        for (int liczba:liczby){
            suma += liczba;
        }
        return suma;
    }

    public int odejmij(int... liczby){
        int roznica = liczby[0];
        for (int i=1; i<liczby.length; i++){
            roznica -= liczby[i];
        }
        return roznica;
    }

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        System.out.println(kalkulator.odejmij(100,10));
    }
}