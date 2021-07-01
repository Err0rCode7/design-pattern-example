package design.pattern.visitor;

public interface CarElement {
    void accept(CarElementVisitor visitor);
}
