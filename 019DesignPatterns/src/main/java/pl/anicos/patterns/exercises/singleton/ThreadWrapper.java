package pl.anicos.patterns.exercises.singleton;

public class ThreadWrapper {
    public static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
