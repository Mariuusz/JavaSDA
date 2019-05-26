package pl.anicos.patterns.exercises.dekorator.windowexample;

public class HorizontalScrollbarWindow extends WindowDecorator {

    public HorizontalScrollbarWindow(Window window) {
        super(window);
    }

    @Override
    public void print() {
        System.out.println("Print HorizontalScrollbarWindow");
        window.print();
    }

    @Override
    public String getDescription() {
        return "HorizontalScrollbarWindow";
    }
}
