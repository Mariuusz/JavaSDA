package pl.anicos.patterns.exercises.abstractfactory.factories;

import pl.anicos.patterns.exercises.abstractfactory.buttons.Button;
import pl.anicos.patterns.exercises.abstractfactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}