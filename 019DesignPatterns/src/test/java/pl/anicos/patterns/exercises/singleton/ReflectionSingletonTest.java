package pl.anicos.patterns.exercises.singleton;

import org.junit.Test;
import pl.anicos.patterns.exercises.singleton.eager.EagerInitializedSingleton;

import java.lang.reflect.Constructor;

import static org.junit.Assert.assertNotSame;

public class ReflectionSingletonTest {

    @Test
    public void shouldDestroySinglton() {
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());

        assertNotSame(instanceOne, instanceTwo);
    }
}
