package pl.sda.str84;

public class Kabriolet extends Samochod {
    boolean czyDachSchowany;

//    public Kabriolet(){
//    }

    public Kabriolet(String kolor, String marka, int rocznik) {
        super(kolor, marka, rocznik);
    }

    public void schowajDach() {
        if(czyDachSchowany == true){
            System.out.println("Dach już jest schowany!");
        }else {
            czyDachSchowany = true;
            System.out.println("Chowam dach");
        }
    }

    @Override
    public void przyspiesz() {
        predkosc += 10;
        if (predkosc <= 180) {
            System.out.println(String.format("Predkosc = %d km/h", predkosc));

        } else {
            predkosc = 180;
            System.out.println("Szybciej nie pojadę");
        }
    }
}