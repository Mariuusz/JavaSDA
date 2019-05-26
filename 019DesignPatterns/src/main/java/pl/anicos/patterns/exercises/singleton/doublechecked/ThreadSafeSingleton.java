package pl.anicos.patterns.exercises.singleton.doublechecked;

import pl.anicos.patterns.exercises.singleton.ThreadWrapper;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        ThreadWrapper.sleep();
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        ThreadWrapper.sleep();
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        ThreadWrapper.sleep();
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}