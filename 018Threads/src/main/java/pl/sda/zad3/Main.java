package pl.sda.zad3;

//Tworzymy aplikację Bankową.
//
//        Stwórz klasę Bank która przyjmuje zlecenia.
//        Stwórz klasę Bank która posiada metody :
//        sendSubtractRequest(double howMuch) - odejmuje z konta
//        sendAddToAccountRequest(double howMuch) - dodaje do konta
//        printBalanceRequest() - wypisuje stan konta
//
//        Stwórz klasę zlecenia BankOrder/BankRequest które jest Runnable.
//
//        W klasie BankAccount:
//        add(double ile) - dodaje do konta.
//        sub(double ile) - odejmuje z konta
//        balance() - wypisuje na ekran stan konta
//
//        Klasa Bank w swoich metodach dodawnia i usuwania tworzy Request(runnable)
//        który przekazuje do wykonania. Każdy request przeczekuje X ilość czasu (na początek 1ms)
//        i uruchamia akcję add/sub na koncie bankowym (które posiada jako pole).
//        Stwórz maina a w mainie stwórz pętle która 1000 razy usuwa i dodaje do konta tą samą kwotę.
//        Sprawdź czy wyniki sprowadzają się do 0.
//        Zsynchronizuj działanie na koncie.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        for (int i = 0; i < 10; i++) {
            bank.wykonajPrzelewPrzychodzacy(100);
            bank.wykonajPrzelewWychodzacy(100);
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.nextLine().equals("quit")) break;

            bank.wypiszBilansKonta();
        }
    }
}