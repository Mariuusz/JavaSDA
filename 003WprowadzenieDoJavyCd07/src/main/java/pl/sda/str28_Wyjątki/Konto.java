package pl.sda.str28_Wyjątki;

//1.Dodaj klasę Mainpodaną przez prowadzącego do swojego projektu
//        2.Zaimplementuj klasę Konto, tak aby kod się kompilował
//        3.Zidentyfikuj miejsca gdzie działanie aplikacji może zostać zaburzone
//        4.Dodaj blok trycatchw metodzie pobierzLiczbe, tak aby:
//        1.Wyświetlić komunikat o nieprawidłowej wartości wprowadzonej przez użytkownika
//        2.Zwrócić liczbę typu intz powrotem do bloku main
//        5.Przetestuj rozwiązanie
//        6.Rzuć wyjątkiem jawnym gdy użytkownik próbuje podać kwotę większą od swojego stanu konta
//        7.* Obsłuż odpowiednio rzucany wyjątek z punktu 6

//        Str 32
//1.Utwórz nowy wyjątek w pakiecie pl.sda.wyjatki.bank
//        2.Nazwij go InsufficientFundsException
//        3.Odziedzicz po klasie Exception
//        4.Rzuć utworzony wyjątek gdy użytkownik próbuje wybrać wyższą kwotę niż aktualny stan jego konta
//        5.Zmień oczekiwany wyjątek w bloku catch
//        6.* Zobacz jak zmieni się użycie przy oddziedziczeniu poRunTimeException

public class Konto {
    private final String imie;
    private int kwotaStartowa;

    public Konto(String imie, int kwotaStartowa) {
        this.imie = imie;
        this.kwotaStartowa = kwotaStartowa;
    }

    public int wybierzPieniadze(int kwota) throws InsufficientFoundsException {
        if (kwota>kwotaStartowa){
            throw new InsufficientFoundsException();
        }else {
            kwotaStartowa -= kwota;
            return kwota;

        }
    }

    public int pobierzStanKonta() {
        return kwotaStartowa;
    }
}