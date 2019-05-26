package pl.anicos.patterns.exercises.facade;

public class Memory {
    public void load() {
        System.out.println("Memory load");
    }

    public String readData() {

        System.out.println("Memory readData");
        return "Some data form RAM";
    }
}
