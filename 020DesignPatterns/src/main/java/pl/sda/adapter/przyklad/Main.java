package pl.sda.adapter.przyklad;

public class Main {
    public static void main(String[] args) {

        PralkaAdapter adapter = new PralkaAdapter();

//        PralkaAdapter p = pobierzPralkeZLazienki();

    }
    public static Pralka pobierzPralkeZLazienki(){
        return new Pralka();
    }
}