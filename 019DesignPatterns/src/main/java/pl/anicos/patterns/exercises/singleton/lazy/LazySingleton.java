package pl.anicos.patterns.exercises.singleton.lazy;

import pl.anicos.patterns.exercises.singleton.ThreadWrapper;

public class LazySingleton {

    private static LazySingleton instance = null;

    //private constructor to avoid client applications to use constructor
    private LazySingleton() {
        ThreadWrapper.sleep();
    }

    public void getSomeThing() {
        // do something here
        System.out.println("I am here....");
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }


}