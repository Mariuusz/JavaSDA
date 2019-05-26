package pl.sda.adapter.zad2.provider1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FileDataProvider {
    private final static String PATH= "input.txt";
    private final static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    private List<Person> peopleList;

    public FileDataProvider() {
        peopleList = new ArrayList<>();
    }

    public void initAndLoad(){
        peopleList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))){
            String line = null;
            while((line = reader.readLine()) != null){
                peopleList.add(parse(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Person parse(String line) {
        String[] splits = line.split(" ");

        return new Person(Integer.parseInt(splits[0]), splits[1], splits[2], splits[3], LocalDate.parse(splits[4], FORMATTER));
    }

    public List<Person> getPeopleList(){
        return peopleList;
    }
}