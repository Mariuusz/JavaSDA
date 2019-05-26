package pl.anicos.patterns.exercises.singleton.billpugh;

import pl.anicos.patterns.exercises.singleton.ThreadWrapper;

public class BillPughSingleton {
    private BillPughSingleton() {
        ThreadWrapper.sleep();
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
