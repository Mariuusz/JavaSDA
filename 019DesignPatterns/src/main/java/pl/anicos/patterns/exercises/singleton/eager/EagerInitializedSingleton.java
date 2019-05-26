package pl.anicos.patterns.exercises.singleton.eager;

import pl.anicos.patterns.exercises.singleton.ThreadWrapper;

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton() {
        ThreadWrapper.sleep();
    }

    public void getSomeThing() {
        // do something here
        System.out.println("I am here....");
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
