package design.pattern.flyweight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ApplicationMain {

    /*
    *   FlyWeight Pattern Example
    *
    *   Shape이라는 인터페이스를 만들고 Circle(ConcreteFlyWeight or ShapeImpl)을 만들어서 실제 사용하게 되는데,
    *   메모리 낭비를 줄이기 위해서 생성된 Circle을 FlyWeightFactory를 통해 꺼내서 사용한다.
    *   FlyWeightFactory는 인스턴스를 관리하여 제공한다.
    *   Concurrent 환경 즉, 멀티 스레드 환경에서 진행한다면 싱글톤 패턴과 마찬가지로
    *   violatile과 sychronized를 사용하는 방법 등을 찾아 해결해야한다.
     */

    public static String[] colors = {"red", "blue", "pupple", "green", "black", "white", "grey"};

    public static void main(String[] args) {

        // Create New instances
        List<ShapeFlyWeight> circles = Arrays.stream(colors)
                .map(FlyWeightFactory::getCircle)
                .collect(Collectors.toList());
        circles.stream()
                .forEach(System.out::println);
        System.out.println("=== Second Time ===");
        // Share instances
        List<ShapeFlyWeight> sharedCircles = Arrays.stream(colors)
                .map(FlyWeightFactory::getCircle)
                .collect(Collectors.toList());
        sharedCircles.stream()
                .forEach(System.out::println);
    }
}
