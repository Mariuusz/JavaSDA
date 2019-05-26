package pl.sda.proxy.przyklad;

public class Samochod implements ISamochod{

    public void wlaczSwiatlo(){
        System.out.println("Włącza sie swiatlo");
    }

    public void uruchomSilnik(){
        System.out.println("Silnik uruchomiony.");
        wlaczSwiatlo();
    }

    public void zakluczDrzwi(){
        System.out.println("Drzwi zamkniete");
        uruchomAlarm();
    }

    public void uruchomAlarm(){

    }

    public void wlaczRadio(){

    }
}
