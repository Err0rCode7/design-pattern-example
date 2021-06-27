package design.pattern.flyweight;

public class Circle implements ShapeFlyWeight {

    private String color;

    public Circle(String color) {
        this.color = color;
        System.out.println("Circle 생성 !");
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
