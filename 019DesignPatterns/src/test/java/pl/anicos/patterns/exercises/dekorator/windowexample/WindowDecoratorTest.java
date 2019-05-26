package pl.anicos.patterns.exercises.dekorator.windowexample;

import org.junit.Test;

public class WindowDecoratorTest {
    @Test
    public void decoratorTest() {
        Window window = new HorizontalScrollbarWindow(new VerticalScrollbarWindow(new BasicWindow()));
        //rysuj okna
        window.print();
        // wypisz opis Okna
        System.out.println(window.getDescription());
    }
}