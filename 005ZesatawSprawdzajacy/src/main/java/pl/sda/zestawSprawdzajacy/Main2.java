package pl.sda.zestawSprawdzajacy;

//        2. Napisz program który wypisuje litery od 'a' do 'z';

public class Main2 {
    public static void main(String[] args) {
        for (int i = (int)'a'; i<=(int)'z';i++){
            System.out.println((char)i);
        }
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
        }
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println((char)i);
        }
    }
}

