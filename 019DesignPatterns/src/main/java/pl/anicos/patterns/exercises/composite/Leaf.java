package pl.anicos.patterns.exercises.composite;

//
// Klasa liscia - definiuje objekty które nie mają dzieci
//
class Leaf implements ComponentInterface {

    @Override
    public void process() {
        System.out.println("Process: " + this);
    }
}
