package pl.sda.str13;

public class Main {
    public static void main(String[] args) {

        Telefon telefon = new Telefon();
        telefon.zadzwon("504234234");
        telefon.zadzwoanNaAlarmowy();
        telefon.zadzwon("786234234");
        telefon.zadzwon("504234234");

    }
}
