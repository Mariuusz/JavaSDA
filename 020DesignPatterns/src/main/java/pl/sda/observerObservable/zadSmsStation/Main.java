package pl.sda.observerObservable.zadSmsStation;

public class Main {
    public static void main(String[] args) {
        SmsStation station = new SmsStation();

        Phone telefon1 = new Phone("666");
        Phone telefon2 = new Phone("999");
        Phone telefon3 = new Phone("112");

        station.addPhone(telefon1);
        station.addPhone(telefon2);
        station.addPhone(telefon3);

        station.sendSms("666", "Tresc");
    }
}