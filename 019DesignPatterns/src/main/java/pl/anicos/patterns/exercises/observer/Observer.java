package pl.anicos.patterns.exercises.observer;

abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
