package pl.anicos.patterns.exercises.abstractfactory;

import pl.anicos.patterns.exercises.abstractfactory.buttons.Button;
import pl.anicos.patterns.exercises.abstractfactory.checkboxes.Checkbox;
import pl.anicos.patterns.exercises.abstractfactory.factories.GUIFactory;

public class AbstractFactoryApplication {
    private Button button;
    private Checkbox checkbox;

    public AbstractFactoryApplication(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public String[] paint() {
        return new String[]{
                button.paint(),
                checkbox.paint()
        };
    }
}
