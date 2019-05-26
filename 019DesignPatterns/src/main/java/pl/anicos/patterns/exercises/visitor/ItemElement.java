package pl.anicos.patterns.exercises.visitor;

public interface ItemElement {
    public int accept(ShoppingCartVisitor visitor);
}
