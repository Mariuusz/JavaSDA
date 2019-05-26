package pl.sda.builder.zad3;

//Stworzymy aplikację symulującą komunikację między użytkownikami. Aplikacja będzie działać na zasadzie pokoju chat'owego.
//
//        Stwórz klasę Mail która posiada pola:
//        - tresc
//        - nadawca
//        - data nadania
//        - data odbioru
//        - adres ip nadania
//        - adres ip odebrania
//        - nazwe serwera posredniego
//        - nazwe skrzynki pocztowej
//        - protokol komunikacji
//        - typ wiadomości (UNKNOWN, OFFER, SOCIAL, NOTIFICATIONS, FORUM)
//        - flagę(boolean) - czy szyfrowane
//        - flagę(boolean) - isSpam
//
//        Stwórz klasę Client która:
//        - posiada pole name
//        - posiada pole List<Mail> - lista/skrzynka wiadomości klienta
//        - readMail(Mail m) - która powoduje dodanie wiadomości do skrzynki i wypisanie komunikatu:
//        "Klient " + this.getName() + " otrzymal maila"
//
//        Stwórz klasę MailServer która posiada listę podłączonych klientów (pole klasy). Metody:
//        - connect(Client c) - powoduje podłączenie klienta do serwera, czyli dodanie go do listy ( tej która jest polem klasy)
//        - disconnect(Client c) - powoduje odłączenie klienta
//        - sendMessage(Mail m, Client sender) - powoduje rozesłanie wiadomości do wszystkich klientów oprócz nadawcy. Przed przekazaniem wiadomości należy ustawić jej datę odebrania na teraz (now()).
//
//        Sprawdź poprawność działania aplikacji. Napisz testy weryfikujące poprawność działania aplikacji. DLA CHĘTNYCH
//
//        TREŚĆ DODATKOWA:
//        Zakładamy że istnieją pewne typy maili. Np. na skrzynce pocztowej gmail maile są segregowane na skrzynki: społecznościowe, powiadomienia, oferty, fora.
//
//        Dodatkowo do poprzedniej treści stwórz fabrykę wiadomości która dla wszystkich typów wiadomości pozwala na szybkie utworzenie wiadomości przesyłając do fabryki jedynie treść.
//
//        podpowiedź: stwórz fabrykę, gdzie kazda z metod posiada jeden parametr i jest nim treść maila, a resztę obiektu stwórz korzystając ze wcześniej stworzonego buildera.
//
//        Wykorzystaj metody fabryki w mainie (stwórz maile) i prześlij je wykorzystując klienta. Zweryfikuj poprawność działania aplikacji, dopisz testy.

public class Main {

    public static void main(String[] args) {
        MailServer server = new MailServer();
        server.connect(new Client("Marian"));
        server.connect(new Client("Michau"));
        server.connect(new Client("Piotrek"));
        server.connect(new Client("Władek"));

        server.sendMessage(MailFactory.createWarningMail("Yeti"), new Client("NoReply"));
    }
}