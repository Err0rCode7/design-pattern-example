package design.pattern.template_method;

public class HyunDaiMotor extends Motor{

    @Override
    public void moveMotor() {
        System.out.println("Move HyunDaiMotor");
    }

    @Override
    public void hook() {
        System.out.println("Hook HyunDaiMotor");
    }
}
