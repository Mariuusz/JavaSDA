package pl.anicos.patterns.exercises.command.example1;

public class Programmer implements Command {
    public void execute() {
        System.out.println("sell the bugs, charge extra for the fixes");
    }
}