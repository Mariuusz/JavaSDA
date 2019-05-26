package pl.anicos.patterns.exercises.abstractfactory.factories;

import pl.anicos.patterns.exercises.abstractfactory.buttons.MacOSButton;
import pl.anicos.patterns.exercises.abstractfactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public MacOSButton createButton() {
        return new MacOSButton();
    }

    @Override
    public MacOSCheckbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
