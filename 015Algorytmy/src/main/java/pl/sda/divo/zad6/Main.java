package pl.sda.divo.zad6;

//Napisz funkcję, która narysuje na ekranie prostokąt (z dowolnych znaków)
//        a. pełną figurę
//        b. sam obrys
//
//        1. Przedstaw opis słowny problemu
//        2. Przedstaw schemat blokowy
//        3. Zaimplementuj algorytm.
//
//        Rozwinięcie:
//        2. Narysuje trójkąt
//        3. Narysuje trójkąt nieprostokątny (równoramienny, równoboczny)
//        4. Narysuje koło/okrąg
//***************************************************************************************************************
// 1.  Napisz funkcję, która narysuje na ekranie pełny prostokąt
// 1a. Wyświetl "_" dopóki nie osiągnie szerokości
// 1b. Powtórz a dopóki nie osiągnie wysokości

public class Main {
    private void rectangle1(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("# ");
            }

            System.out.println();
        }
    }
    private void rectangle2(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == height - 1 || j == width - 1 || i == 0 || j == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    private void triangle1(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }

            System.out.println();
        }
    }
    private void triangle2(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1 || i == 1 || i == height) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }

            System.out.println();
        }
    }
    private void isoscelesTriangle(int side) {
        for (int i = 0; i < side; i++) {
            for (int k=i;k<side-1; k++){
                System.out.print(' ');
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    private void circle1(int posY, int posX, int radius) {
        for (int i = 0;i <= posX + radius; i++) {
            for (int j = 0;j <=posY + radius; j++) {
                int xSquared = (i - posX)*(i - posX);
                int ySquared = (j - posY)*(j - posY);
                if (Math.abs(xSquared + ySquared - radius) <= radius) {
                    System.out.print("O ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private void circle2(int posY, int posX, int radius) {
        for (int i = 0;i <= posX + radius ; i++) {
            for (int j = 0;j <=posY + radius; j++) {
                int xSquared = (i - posX)*(i - posX);
                int ySquared = (j - posY)*(j - posY);
                if (Math.abs(xSquared + ySquared - radius * radius) < radius) {
                    System.out.print("O ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.rectangle1(5, 5);
        System.out.println();
        m.rectangle2(5, 5);
        System.out.println();
        m.triangle1(5);
        System.out.println();
        m.triangle2(5);
        System.out.println();
        m.isoscelesTriangle(5);
        System.out.println();
        m.circle1(5, 5, 5);
        System.out.println();
        m.circle2(5, 5, 5);

    }
}