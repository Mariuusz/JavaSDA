package pl.anicos.patterns.exercises.factorymethod;

public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        switch (type) {
            case "PC":
                return new PC(ram, hdd, cpu);
            case "Server":
                return new Server(ram, hdd, cpu);
            default:
                throw new RuntimeException("Can't create Computer instance based on type " + type);
        }
    }
}
