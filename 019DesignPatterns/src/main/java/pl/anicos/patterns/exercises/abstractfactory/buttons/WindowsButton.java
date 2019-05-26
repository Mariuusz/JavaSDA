package pl.anicos.patterns.exercises.abstractfactory.buttons;

public class WindowsButton implements Button {

    public static final String YOU_HAVE_CREATED_WINDOWS_BUTTON = "You have created WindowsButton.";

    @Override
    public String paint() {
        System.out.println(YOU_HAVE_CREATED_WINDOWS_BUTTON);
        return YOU_HAVE_CREATED_WINDOWS_BUTTON;
    }
}