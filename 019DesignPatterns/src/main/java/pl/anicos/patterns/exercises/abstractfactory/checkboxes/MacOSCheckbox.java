package pl.anicos.patterns.exercises.abstractfactory.checkboxes;

public class MacOSCheckbox implements Checkbox {

    public static final String YOU_HAVE_CREATED_MAC_OSCHECKBOX = "You have created MacOSCheckbox.";

    @Override
    public String paint() {
        System.out.println(YOU_HAVE_CREATED_MAC_OSCHECKBOX);
        return YOU_HAVE_CREATED_MAC_OSCHECKBOX;
    }
}