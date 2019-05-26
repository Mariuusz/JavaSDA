package pl.sda.proxy.zad1;

public class Main {
    public static void main(String[] args) {
        IMyFileReader reader = new MyFileReader();
        System.out.println(reader.wczytajNLinii(50));
//        reader.wczytajNLinii(50).forEach(System.out::println);

        MyFileReader reader1 = new MyFileReader();
        System.out.println(reader1.wczytajLinie());
//        System.out.println(reader.wczytajLinie());;
//        System.out.println(reader.wczytajLinie());;
//        System.out.println(reader.wczytajLinie());;
//        System.out.println(reader.wczytajLinie());;
//        System.out.println(reader.wczytajLinie());;
//        System.out.println(reader.wczytajLinie());;


//        System.out.println(reader.wczytajNLinii(50));
    }
}