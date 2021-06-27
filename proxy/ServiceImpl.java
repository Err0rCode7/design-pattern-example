package design.pattern.proxy;

public class ServiceImpl implements IService {

    @Override
    public void runSomething() {
        System.out.println("ServiceImple run Something");
    }
}
