package design.pattern.visitor;

public class ApplicationMain {

    /**
     * Visitor Pattern Example
     *
     * 자동차의 구성요소에 특정 알고리즘을 실행해야하는데 구성요소에서 연산을 빼고
     * Visitor를 구현하여 연산을 수행하는 예제
     */
    public static void main(String[] args) {
        Car car = new Car();

        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());
    }
}
