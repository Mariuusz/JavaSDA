package pl.sda.divo.zad12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Scanner;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        List<Student2> student2List = new ArrayList<>();
        while (true) {
            student2List.add(pobierzStudentow());
            System.out.print("Czy pobierać dalej: ");
            if (new Scanner(System.in).nextLine().equals("n")) {
                break;
            }
        }

        Map<Student2, Integer> iloscGodzin = new HashMap<>();
        while (true) {
            Integer nrIndeksu = pobierzIndeks();
            System.out.print("Czy pobierać dalej: ");
            if (new Scanner(System.in).nextLine().equals("n")) {
                break;
            }

            Student2 klucz = null;
            for (Student2 student2 : student2List) {
                if (student2.getNrIndeksu() == nrIndeksu) {
                    klucz = student2;
                    break;
                }
            }

            if (klucz == null) {
                System.out.println("Nie znaleziono studenta");
            } else {
                iloscGodzin.putIfAbsent(klucz, 0);
                System.out.print("Ile godzin opuścił: ");
                int godzina = new Scanner(System.in).nextInt();
                iloscGodzin.put(klucz, iloscGodzin.get(klucz) + godzina);
            }


//            student2List.stream()
//                    .filter(s -> s.getNrIndeksu() == nrIndeksu)
//                    .forEach(s -> iloscGodzin.put(s, 0));
        }

        // wyswietl wszystkich studentow z iloscia godzin.
        Set<Map.Entry<Student2, Integer>> entries = iloscGodzin.entrySet();
        for (Map.Entry<Student2, Integer> entry : entries) {
            Student2 student2 = entry.getKey();
            Integer godzina = entry.getValue();

            System.out.print(student2.getImie());
            System.out.print(" " + student2.getNazwisko());
            System.out.println(" = " + godzina);
        }

        Map<Student2, Integer> studenci1 = new HashMap<>();
        Map<Student2, Integer> studenci2 = new HashMap<>();

        studenci1.put(new Student2("a", "a", 1), 1);
        studenci1.put(new Student2("a", "b", 2), 2);
        studenci1.put(new Student2("a", "c", 3), 3);
        studenci1.put(new Student2("a", "a", 1), 4);
        studenci1.put(new Student2("a", "b", 1), 5);

        studenci2.put(new Student2("a", "a", 1), 11);
        studenci2.put(new Student2("a", "b", 2), 12);
        studenci2.put(new Student2("a", "c", 3), 13);
        studenci2.put(new Student2("a", "a", 4), 14);
        studenci2.put(new Student2("a", "b", 5), 15);

//        studenci1.putAll(studenci2);
//        System.out.println(studenci1);

        for (Map.Entry<Student2, Integer> entry : studenci2.entrySet()) {
            studenci1.putIfAbsent(entry.getKey(), entry.getValue());
        }
        System.out.println(studenci1);
    }

    public static int pobierzIndeks() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nr indeksu studenta: ");
        return in.nextInt();
    }

    public static Student2 pobierzStudentow() {
        Scanner in = new Scanner(System.in);
        System.out.print("Imie studenta: ");
        String imie = in.nextLine();

        System.out.print("Nazwisko studenta: ");
        String nazwisko = in.nextLine();

        System.out.print("Numer indeksu studenta: ");
        Integer nrIndeksu = in.nextInt();

        return new Student2(imie, nazwisko, nrIndeksu);
    }
}
