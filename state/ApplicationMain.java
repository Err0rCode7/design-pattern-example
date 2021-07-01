package design.pattern.state;

public class ApplicationMain {

    /**
     * State Pattern Example
     *
     * 랩탑의 전원을 눌렀을 때 상태 패턴을 적용한 예제
     *
     */
    public static void main(String[] args) {
        Laptop laptop = new Laptop();

        laptop.powerPush();
        laptop.powerPush();
        laptop.powerPush();
        laptop.powerPush();
    }
}
