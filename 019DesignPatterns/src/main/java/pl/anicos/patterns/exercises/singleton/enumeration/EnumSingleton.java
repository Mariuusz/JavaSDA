package pl.anicos.patterns.exercises.singleton.enumeration;

import pl.anicos.patterns.exercises.singleton.ThreadWrapper;

public enum EnumSingleton {
    INSTANCE;

    EnumSingleton() {
        ThreadWrapper.sleep();
    }

    public static void doSomething() {
        //do something
    }
}
