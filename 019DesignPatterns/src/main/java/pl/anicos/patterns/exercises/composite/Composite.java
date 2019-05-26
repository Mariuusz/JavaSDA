package pl.anicos.patterns.exercises.composite;

import java.util.ArrayList;
import java.util.List;

//
// Klasa kompozytu
//
class Composite implements ComponentInterface {

    private List<ComponentInterface> children = new ArrayList<>();

    public void addComponent(ComponentInterface child) {
        System.out.println("Add children: " + child);
        children.add(child);
    }

    @Override
    public void process() {
        System.out.println("Process: " + this);
        if (!children.isEmpty()) {
            for (ComponentInterface child : children) {
                child.process();
            }

        }
    }
}

