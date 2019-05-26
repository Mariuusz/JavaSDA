package pl.sda.decorator.zad5;

public class Main {
    public static void main(String[] args) {
        SimpleTree tree = new SimpleTree(10);

        System.out.println(tree);

        System.out.println(new DecoratedTree(tree));
    }
}