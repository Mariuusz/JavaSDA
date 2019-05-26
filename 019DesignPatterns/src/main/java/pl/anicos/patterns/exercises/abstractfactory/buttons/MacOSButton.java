package pl.anicos.patterns.exercises.abstractfactory.buttons;

public class MacOSButton implements Button {

    public static final String YOU_HAVE_CREATED_MAC_OSBUTTON = "You have created MacOSButton.";

    @Override
    public String paint() {
        System.out.println(YOU_HAVE_CREATED_MAC_OSBUTTON);
        return YOU_HAVE_CREATED_MAC_OSBUTTON;
    }

}
