package pl.sda.zad2;

//     2.Napisz interfejs ICalculable (obliczalne), a w interfejsie zadeklaruj metodę :
//        -	public double calculate()
// a.	Napisz klasę SumEquation która implementuje interfejs ICalculable i dodaj do klasy dwa pola
// (dwie liczby typu double). Zaimplementuj metodę calculate() z interfejsu ICalculable tak, aby zwracała sumę obu pól.
// b.	Napisz klasę SubtractEquation która implementuje interfejs ICalculable i dodaj do klasy dwa pola
//(dwie liczby typu double). Zaimplementuj metodę calculate() z interfejsu ICalculable tak, aby zwracała różnicę obu pól.
// c.	Napisz klasę DivEquation która implementuje interfejs ICalculable i dodaj do klasy dwa pola
// (dwie liczby typu double). Zaimplementuj metodę calculate() z interfejsu ICalculable tak,
// aby zwracała wynik dzielenia pola a przez pole b.
// d.	Napisz klasę MulEquation która implementuje interfejs ICalculable i dodaj do klasy dwa pola (
// dwie liczby typu double). Zaimplementuj metodę calculate() z interfejsu ICalculable tak,
// aby zwracała wynik mnożenia obu pól.
// e.	Stwórz w mainie aplikację, która przyjmuje komendy i dla komendy:
//     i.	add - tworzy SumEquation i prosi o dwie zmienne (wartości pól), a następnie oblicza wartość sumy i
//          wypisuje wynik na ekran
//     ii.	sub - tworzy SubtractEquation i prosi o dwie zmienne (wartości pól), a następnie oblicza wartość
//          różnicy i wypisuje wynik na ekran
//     iii.	div - tworzy DivEquation i prosi o dwie zmienne (wartości pól), a następnie oblicza wynik dzielenia
//          i wypisuje wynik na ekran
//     iv.	mul - tworzy MulEquation i prosi o dwie zmienne (wartości pól), a następnie oblicza wartość mnożenia
//          i wypisuje wynik na ekran
// f.	Napisz klasę PowEquation która jako parametr przyjmuje wartość n oraz pow a następnie wylicza wartość liczby n do potęgi pow. Dodaj obsługę tak, jak w przypadku wcześniejszych klas.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj komendę działania (add, sub, div, mul):");
        String dzialanie = scanner.nextLine();

        System.out.println("Podaj dwie zmienne:");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        switch (dzialanie){
            case "add":
                SumEquation wynikAdd = new SumEquation(x,y);
                System.out.println(wynikAdd.Calculate());
                break;
            case "sub":
                SubtractEquation wynikSub = new SubtractEquation(x,y);
                System.out.println(wynikSub.Calculate());
                break;
            case "div":
                DivEquation wynikDiv = new DivEquation(x,y);
                System.out.println(wynikDiv.Calculate());
                break;
            case "mul":
                MulEquation wynikMul = new MulEquation(x,y);
                System.out.println(wynikMul.Calculate());
                break;
            default:
                break;
        }


    }
}
