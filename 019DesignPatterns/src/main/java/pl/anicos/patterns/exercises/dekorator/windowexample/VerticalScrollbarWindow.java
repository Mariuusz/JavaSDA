package pl.anicos.patterns.exercises.dekorator.windowexample;

public class VerticalScrollbarWindow extends WindowDecorator {

    public VerticalScrollbarWindow(Window window) {
        super(window);
    }

    @Override
    public void print() {
        System.out.println("Print VerticalScrollbarWindow");
        window.print();
    }

    @Override
    public String getDescription() {
        return "VerticalScrollbarWindow";
    }
}
