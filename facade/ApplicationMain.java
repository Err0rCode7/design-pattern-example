package design.pattern.facade;

public class ApplicationMain {


    /*  Facade Pattern
    *
    *   컴퓨터를 키는 동작을 한다고 했을 때, 컴퓨터 메모리, cpu, 그래픽 등을 직접 동작시키는 것이 아니라
    *   하나의 통합된 인터페이스를 제공하여 키는 동작으로 한번에 각각의 동작이 수행되게하는 예제
     */
    public static void main(String[] args) {
        Computer facade = new Computer();
        facade.bootComputer();
    }
}
