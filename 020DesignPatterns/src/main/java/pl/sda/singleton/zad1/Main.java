package pl.sda.singleton.zad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PostOffice healthDepartment = new PostOffice();

        boolean isWorking = true;
        while (isWorking) {
            String line = sc.nextLine().trim().toLowerCase();

            if (line.startsWith("quit")) {
                break;
            } else if (line.startsWith("machine")) {
                healthDepartment.fromAutomat();
            } else if (line.startsWith("reception")) {
                healthDepartment.fromReception();
            } else if (line.startsWith("website")) {
                healthDepartment.fromWebsite();
            }
        }

    }
}