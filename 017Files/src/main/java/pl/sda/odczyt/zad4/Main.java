package pl.sda.odczyt.zad4;

//Napisz aplikację która czyta plik 'output_form.txt' i wypisuje zawartość formularzy.


import pl.sda.zapis.zad5.Formularz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
         List<Formularz> formularzList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("formularze.txt"))) {
            String linia;
            Formularz formularz = null;

            while ((linia = reader.readLine()) != null) {
                if (linia.equals("------")) {
                    if (formularz != null) {
//                        System.out.println(formularz);
                        formularzList.add(formularz);
                    }
                    formularz = new Formularz();
                } else {
                    formularz.parsujLinie(linia);
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //
        formularzList.forEach(System.out::println);
        System.out.println("Ilość wypełnionych formularzy:" + formularzList.size());

        /// sredni wiek kobiet ktore wypelnily formularz
        OptionalDouble sredniWiekOptional = formularzList.stream()
                .filter(formularz -> formularz.isCzyKobieta())
                .mapToInt(formularz -> formularz.getWiek())
                .average();

        if (sredniWiekOptional.isPresent()) {
            System.out.println("średni wiek kobiet wypełniających formularz: " + sredniWiekOptional.getAsDouble());
        }

        ///////////////////////////////////////////////
        long iloscMezczyzn = formularzList.stream()
                .filter(formularz -> !formularz.isCzyKobieta())
                .count();

        ////////////////////////////////////////////////
        OptionalDouble sredniWzrostOptional = formularzList.stream()
                .filter(formularz -> !formularz.isCzyKobieta())
                .mapToInt(formularz -> formularz.getWzrost())
                .average();

        ////////////////////////////////////////////////
        OptionalDouble srednieZarobkiOptional = formularzList.stream()
                .filter(formularz -> !formularz.isCzyKobieta())
                .mapToDouble(formularz -> formularz.getZarobki())
                .average();

        /////////////////////////////////////////////////
        Map<String, Integer> mapaOdpowiedzi = new HashMap<>();
        formularzList.forEach(formularz -> {
            String odpowiedz = formularz.getCoSadziszOTymFormularzu().toLowerCase().trim();
            if (mapaOdpowiedzi.containsKey(odpowiedz)) {
                mapaOdpowiedzi.put(odpowiedz, mapaOdpowiedzi.get(odpowiedz) + 1);
            } else {
                mapaOdpowiedzi.put(odpowiedz, 1);
            }
        });

        for (Map.Entry<String, Integer> wpisWMapie : mapaOdpowiedzi.entrySet()) {
            System.out.println("Odpowiedz: " + wpisWMapie.getKey() + " udzielona była :" + wpisWMapie.getValue() + " razy.");
        }
    }
}