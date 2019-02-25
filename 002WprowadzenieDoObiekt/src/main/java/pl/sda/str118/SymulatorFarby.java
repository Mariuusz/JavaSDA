package pl.sda.str118;

//        1.Utwórz klasę SymulatorFarby
//        2.Dodaj metodę publiczną statyczną :
//          1.obliczZapotrzebowanieNaFarbe():int
//          2.Metoda pobiera tablicę elementów typu Figura oraz wielkość pojemnika na farbę w double
//          3.Metoda oblicza powierzchnię a następnie zakładamy, że jeśli np. powierzchnia do malowania = 200.5 a pojemność pojemnika wynosi 50, to potrzebujemy 5 pojemników aby pomalować całą powierzchnię
//        3.Dodaj metodę psvm
//        4.Przeprowadź symulację:
//          1.Utwórz kilka obiektów typu Kwadrat, Koło, Trapez
//          2.Wrzuć je do pojedynczej tablicy Figura[]
//          3.Prześlij dane do SymulatoraFarby
//          4.Sprawdź wynik

public class SymulatorFarby {

    public static int zapotrzebowanieNaFarbe(Figura[] figury, double wielkoscPojemnika){
        double pole=0;

        for (Figura f:figury){
            pole+= f.obliczPole();
        }

        return (int)(pole/wielkoscPojemnika) + 1;
    }

    public static void main(String[] args) {
        Okreg okreg = new Okreg(5);
        Kwadrat kwadrat = new Kwadrat(5);
        Kwadrat kwadrat2 = new Kwadrat(8);
        Figura figura = new Prostokat(2,5);
        Figura trapez = new Trapez(2,5, 3,4);

        Figura[] figury = new Figura[]{kwadrat,figura,okreg, kwadrat2};

        System.out.println(zapotrzebowanieNaFarbe(figury,5));

    }

}
