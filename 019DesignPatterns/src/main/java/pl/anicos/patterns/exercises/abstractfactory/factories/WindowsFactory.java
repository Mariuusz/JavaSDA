package pl.anicos.patterns.exercises.abstractfactory.factories;

import pl.anicos.patterns.exercises.abstractfactory.buttons.WindowsButton;
import pl.anicos.patterns.exercises.abstractfactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public WindowsButton createButton() {
        return new WindowsButton();
    }

    @Override
    public WindowsCheckbox createCheckbox() {
        return new WindowsCheckbox();
    }
}