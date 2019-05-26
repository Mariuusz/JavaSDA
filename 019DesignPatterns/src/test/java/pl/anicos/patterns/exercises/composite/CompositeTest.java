package pl.anicos.patterns.exercises.composite;

import org.junit.Test;

public class CompositeTest {

    @Test
    public void shouldAddElementsToComeposite() {
        System.out.println("Add items ...");

        Leaf leaf = new Leaf();
        Leaf leaf2 = new Leaf();
        Leaf leaf3 = new Leaf();

        Composite childComposite = new Composite();
        Composite childComposite2 = new Composite();

        childComposite.addComponent(leaf);

        childComposite2.addComponent(leaf);
        childComposite2.addComponent(leaf2);
        childComposite2.addComponent(leaf3);

        Composite composite = new Composite();
        composite.addComponent(childComposite);
        composite.addComponent(childComposite2);

        System.out.println("Execute process on Leaf ...");

        leaf.process();
        leaf2.process();

        System.out.println("Execute process on Child 1 ...");

        childComposite.process();
        System.out.println("Execute process on Child 2 ...");
        childComposite2.process();

        System.out.println("Execute process on Composite ...");

        composite.process();
    }
}