package design.pattern.proxy;

public class Proxy implements IService {

    IService iService;
    // 두가지 방법을 생각해볼 수 있는데,
    // 1. 생성자를 통해서 실제 호출하고자하는 객체를 받아 프록시 객체를 만드는 방법
    // 2. 새롭게 객체를 만들어서 실제 호출하고자 하는 메소드를 실행하는 방법
    // 2번의 경우 인스턴스의 필드와 같은 정보에 의존하고 있는 경우 문제가 생길 수 있다.(나의 추측)
    // 아래는 1번 방법.

    public Proxy(IService iService) {
        this.iService = iService;
    }

    /*
    *   메소드의 호출과 반환은 똑같이 단, 흐름만 바꾼다.
     */
    @Override
    public void runSomething() {

        System.out.println("Proxy run Something");
        iService.runSomething();
    }
}
