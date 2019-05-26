package pl.anicos.patterns.exercises.facade;

public class Computer {
    private final CPU cpu;
    private final Memory memory;
    private final HardDrive hardDrive;

    public Computer(CPU cpu, Memory memory, HardDrive hardDrive) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public void run() {
        hardDrive.readData();
        memory.load();
        cpu.processData();
    }

    public void off(){
        String someData = memory.readData();
        hardDrive.saveToDisk(someData);
    }
}
