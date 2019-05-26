package pl.anicos.patterns.exercises.abstractfactory;

import org.junit.Assert;
import org.junit.Test;
import pl.anicos.patterns.exercises.abstractfactory.buttons.MacOSButton;
import pl.anicos.patterns.exercises.abstractfactory.buttons.WindowsButton;
import pl.anicos.patterns.exercises.abstractfactory.checkboxes.MacOSCheckbox;
import pl.anicos.patterns.exercises.abstractfactory.checkboxes.WindowsCheckbox;
import pl.anicos.patterns.exercises.abstractfactory.factories.MacOSFactory;
import pl.anicos.patterns.exercises.abstractfactory.factories.WindowsFactory;

public class AbstractFactoryApplicationTest {

    @Test
    public void shouldPaintMacOsUi() {
        //given
        AbstractFactoryApplication testObj = new AbstractFactoryApplication(new MacOSFactory());
        //when
        String[] paint = testObj.paint();
        //then
        Assert.assertEquals(MacOSButton.YOU_HAVE_CREATED_MAC_OSBUTTON, paint[0]);
        Assert.assertEquals(MacOSCheckbox.YOU_HAVE_CREATED_MAC_OSCHECKBOX, paint[1]);
    }

    @Test
    public void shouldPaintWindowsUi() {
        //given
        AbstractFactoryApplication testObj = new AbstractFactoryApplication(new WindowsFactory());
        //when
        String[] paint = testObj.paint();
        //then
        Assert.assertEquals(WindowsButton.YOU_HAVE_CREATED_WINDOWS_BUTTON, paint[0]);
        Assert.assertEquals(WindowsCheckbox.YOU_HAVE_CREATED_WINDOWS_CHECKBOX, paint[1]);
    }
}