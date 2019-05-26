package pl.anicos.patterns.exercises.facade;

public class HardDrive {
    public void readData() {
        System.out.println("Hard drive - Read data");
    }

    public void saveToDisk(String someData) {
        System.out.println("Saving to disk "+someData);
    }
}
