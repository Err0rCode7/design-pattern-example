package design.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {

    private static final Map<String, Circle> cycleMap = new HashMap<>();

    public static ShapeFlyWeight getCircle(String color) {
        ShapeFlyWeight circle = cycleMap.get(color);

        if (circle == null) {
            Circle newCircle = new Circle(color);
            cycleMap.put(newCircle.getColor(), newCircle);
            System.out.println("== Generate Circle ==");
            circle = newCircle;
        }

        return circle;
    }
}
