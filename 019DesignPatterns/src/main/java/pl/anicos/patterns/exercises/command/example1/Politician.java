package pl.anicos.patterns.exercises.command.example1;

public class Politician implements Command {
    public void execute() {
        System.out.println("take money from the rich, take votes from the poor");
    }
}