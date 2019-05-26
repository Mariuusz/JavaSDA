package pl.anicos.patterns.exercises.dekorator.windowexample;

public abstract class WindowDecorator implements Window {
    protected final Window window;

    public WindowDecorator(Window window) {
        this.window = window;
    }
}
