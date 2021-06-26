package design.pattern.bridge_pattern;

public class Application {
    public static void main(String[] args) {
        // Bridge Pattern 을 이용한 리모콘 예제
        // 추상 클래스가 인터페이스에 의존하여 독립적으로 확장이 가능한 패턴
        // 스위치는 리모콘이 될 수 있고 다른 버튼이 될 수 있다.
        // 또한 스위치에서 사용하는 가전제품은 TV 또는 에어컨으로 변형할 수 도 있다.
        Switch switch1 = new RemoteController(new TV());

        switch1.turnOn();
        switch1.turnOff();
    }
}
