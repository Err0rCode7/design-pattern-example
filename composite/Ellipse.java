package design.pattern.composite;

public class Ellipse implements Graphic {

    @Override
    public void print() {
        System.out.println("== Leaf ==");
        System.out.println("Ellipse");
    }
}
