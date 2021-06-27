package design.pattern.proxy;

public class ApplicationMain {

    /*
    *   Proxy Pattern Example
    *
    *   실제 메소드 호출을 프록시 객체를 만들어서 실행하는 간단한 예제
     */
    public static void main(String[] args) {
        IService proxy = new Proxy(new ServiceImpl());

        proxy.runSomething();
    }
}
