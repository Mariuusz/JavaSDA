package pl.anicos.patterns.exercises.dekorator.windowexample;

public class BasicWindow implements Window {
    @Override
    public void print() {
        System.out.println("Print BasicWindow");
    }

    @Override
    public String getDescription() {
        return "Basic Window";
    }
}
