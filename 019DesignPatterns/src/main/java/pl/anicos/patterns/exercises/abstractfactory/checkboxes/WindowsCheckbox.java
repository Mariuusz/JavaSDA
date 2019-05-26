package pl.anicos.patterns.exercises.abstractfactory.checkboxes;

public class WindowsCheckbox implements Checkbox {

    public static final String YOU_HAVE_CREATED_WINDOWS_CHECKBOX = "You have created WindowsCheckbox.";

    @Override
    public String paint() {
        System.out.println(YOU_HAVE_CREATED_WINDOWS_CHECKBOX);
        return YOU_HAVE_CREATED_WINDOWS_CHECKBOX;
    }
}